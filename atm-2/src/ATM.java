public class ATM {

    public static final String IDLE = "IDLE";
    public static final String CARD_INSERTED = "CARD_INSERTED";
    public static final String PIN_VERIFICATION = "PIN_VERIFICATION";
    public static final String AUTHENTICATED = "AUTHENTICATED";
    public static final String TRANSACTION_IN_PROGRESS = "TRANSACTION_IN_PROGRESS";
    public static final String BLOCKED = "BLOCKED";
    public static final String CARD_EJECTED = "CARD_EJECTED";

    private String state;
    private Card card;
    private int pinAttempts;

    public ATM() {
        state = IDLE;
        card = null;
        pinAttempts = 0;
    }

    public String getState() {
        return state;
    }

    public Card getCard() {
        return card;
    }

    // IDLE -> CARD_INSERTED
    public void insertCard(Card card) {

        if (state.equals(IDLE)) {
            this.card = card;
            state = CARD_INSERTED;
            pinAttempts = 0;
        }
    }

    // CARD_INSERTED/PIN_VERIFICATION -> AUTHENTICATED,
    // or PIN_VERIFICATION, or BLOCKED
    public void enterPin(String pin) {

        if (state.equals(CARD_INSERTED)
                || state.equals(PIN_VERIFICATION)) {

            if (card.checkPin(pin)) {
                state = AUTHENTICATED;
                pinAttempts = 0;
            } else {
                pinAttempts++;

                if (pinAttempts == 3) {
                    state = BLOCKED;
                } else {
                    state = PIN_VERIFICATION;
                }
            }
        }
    }

    // AUTHENTICATED -> TRANSACTION_IN_PROGRESS
    public void startTransaction() {

        if (state.equals(AUTHENTICATED)) {
            state = TRANSACTION_IN_PROGRESS;
        }
    }

    // TRANSACTION_IN_PROGRESS -> AUTHENTICATED
    public void completeTransaction() {

        if (state.equals(TRANSACTION_IN_PROGRESS)) {
            state = AUTHENTICATED;
        }
    }

    // AUTHENTICATED/CARD_INSERTED/BLOCKED -> CARD_EJECTED
    public void ejectCard() {

        if (state.equals(AUTHENTICATED)
                || state.equals(CARD_INSERTED)
                || state.equals(BLOCKED)) {

            state = CARD_EJECTED;
            card = null;
            pinAttempts = 0;
        }
    }

    // CARD_EJECTED -> IDLE
    public void reset() {

        if (state.equals(CARD_EJECTED)) {
            state = IDLE;
        }
    }

    // Part 1: withdrawal amount classification
    public String checkWithdrawalAmount(double amount) {

        if (amount < 100) {
            return "TOO_LOW";
        }

        if (amount > 20000) {
            return "TOO_HIGH";
        }

        if (amount % 100 != 0) {
            return "NOT_MULTIPLE_OF_100";
        }

        return "VALID";
    }

    // Part 3: withdrawal approval
    public String approveWithdrawal(double amount) {

        if (card == null) {
            return "DENIED_ACCOUNT_BLOCKED";
        }

        if (!checkWithdrawalAmount(amount).equals("VALID")) {
            return "DENIED_INVALID_AMOUNT";
        }

        if (card.getBalance() < amount) {
            return "DENIED_INSUFFICIENT_BALANCE";
        }

        if (card.getDailyWithdrawn() + amount > 50000) {
            return "DENIED_LIMIT_EXCEEDED";
        }

        if (state.equals(AUTHENTICATED)) {
            return "APPROVED";
        }

        return "DENIED_ACCOUNT_BLOCKED";
    }

    public String withdraw(double amount) {

        String result = approveWithdrawal(amount);

        if (result.equals("APPROVED")) {
            state = TRANSACTION_IN_PROGRESS;
            card.withdraw(amount);
            state = AUTHENTICATED;
        }

        return result;
    }
}
