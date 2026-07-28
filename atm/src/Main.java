import java.util.Scanner;

 class AtmSimulator {


    public static final String VALID = "VALID";
    public static final String TOO_LOW = "TOO_LOW";
    public static final String TOO_HIGH = "TOO_HIGH";
    public static final String NOT_MULTIPLE_OF_100 = "NOT_MULTIPLE_OF_100";


    public static final String IDLE = "IDLE";
    public static final String CARD_INSERTED = "CARD_INSERTED";
    public static final String PIN_VERIFICATION = "PIN_VERIFICATION";
    public static final String AUTHENTICATED = "AUTHENTICATED";
    public static final String TRANSACTION_IN_PROGRESS = "TRANSACTION_IN_PROGRESS";
    public static final String BLOCKED = "BLOCKED";
    public static final String CARD_EJECTED = "CARD_EJECTED";


    public static final String APPROVED = "APPROVED";
    public static final String DENIED_ACCOUNT_BLOCKED = "DENIED_ACCOUNT_BLOCKED";
    public static final String DENIED_INVALID_AMOUNT = "DENIED-INVALID_AMOUNT";
    public static final String DENIED_INSUFFICIENT_BALANCE = "DENIED_INSUFFICIENT_BALANCE";
    public static final String DENIED_LIMIT_EXCEEDED = "DENIED_LIMIT_EXCEEDED";

    // Fixed Correct PIN
    private static final String RIGHT_PIN = "1234";


    // Account State Variables
    private static boolean isAccountActive = true;
    private static double accountBalance = 150000.00;
    private static double dailyRemainingLimit = 20000.00;
    private static  String approvedResult="approvedResult";




    // insert wrong amounts
    public static String classifyAmount(int amount) {
        if (amount < 100) {
            System.out.println("approvedResult: TOO_LOW");
            return approvedResult;
        }
        if (amount > 20000) {
            System.out.println("approvedResult: TOO_HIGH");
            return approvedResult;
        }
        if (amount % 100 != 0) {
            System.out.println("approvedResult: NOT_MULTIPLE_OF_100");
            return approvedResult;

        }
        System.out.println("VALID");
        return VALID;
    }







    // ATM STATES
    public static class Atm {
        private String currentState = IDLE;
        private int pinAttempts = 0;

        public String getCurrentState() {
            return currentState;
        }

        public boolean insertCard() {
            if (currentState.equals(IDLE)) {
                currentState = CARD_INSERTED;
                return true;
            }
            return false;
        }

        public boolean enterPin(String enteredPin) {
            if (currentState.equals(CARD_INSERTED) || currentState.equals(PIN_VERIFICATION)) {
                if (RIGHT_PIN.equals(enteredPin)) {
                    currentState = AUTHENTICATED;
                    pinAttempts = 0;
                } else {
                    pinAttempts++;
                    if (pinAttempts >= 3) {
                        currentState = BLOCKED;

                    } else {
                        currentState = PIN_VERIFICATION;
                    }
                }
                return true;
            }
            return false;
        }

        public boolean startTransaction() {
            if (currentState.equals(AUTHENTICATED)) {
                currentState = TRANSACTION_IN_PROGRESS;
                return true;
            }
            return false;
        }

        public boolean completeTransaction() {
            if (currentState.equals(TRANSACTION_IN_PROGRESS)) {
                currentState = AUTHENTICATED;
                return true;
            }
            return false;
        }

        public boolean ejectCard() {
            if (currentState.equals(AUTHENTICATED) || currentState.equals(CARD_INSERTED) || currentState.equals(BLOCKED)) {
                currentState = CARD_EJECTED;
                return true;
            }
            return false;
        }

        public boolean reset() {
            if (currentState.equals(CARD_EJECTED)) {
                currentState = IDLE;
                return true;
            }
            return false;
        }
    }

    // Part 3 Logic (Decision Evaluation)
    public static String approveWithdrawal(boolean isActive, int amount, double balance, double dailyLimit) {
        if (!isActive) {
            return DENIED_ACCOUNT_BLOCKED;
        }
        if (!classifyAmount(amount).equals(VALID)) {
            return DENIED_INVALID_AMOUNT;
        }
        if (balance < amount) {
            return DENIED_INSUFFICIENT_BALANCE;
        }
        if (dailyLimit < amount) {
            return DENIED_LIMIT_EXCEEDED;
        }
        return APPROVED;
    }

    // Main Interactive Loop using Scanner
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Atm session = new Atm();

        System.out.println("==========================================");
        System.out.println("          WELCOME TO THE ATM              ");
        System.out.println("==========================================");

        while (true) {
            System.out.println("\n[ Current State: " + session.getCurrentState() + " ]");

            switch (session.getCurrentState()) {
                case IDLE:
                    System.out.println("1. Insert Card");
                    System.out.println("2. Exit Program");
                    System.out.print("Choose action: ");
                    int choice = scanner.nextInt();
                    if (choice == 1) {
                        session.insertCard();
                        System.out.println("Card inserted successfully.");
                    } else if (choice == 2) {
                        System.out.println("Shutting down ATM.");
                        scanner.close();
                        return;
                    } else {
                        System.out.println("Invalid option.");
                    }
                    break;

                case CARD_INSERTED:
                case PIN_VERIFICATION:
                    System.out.print("Enter 4-digit PIN: ");
                    String pin = scanner.next();
                    session.enterPin(pin);

                    if (session.getCurrentState().equals(AUTHENTICATED)) {
                        System.out.println("PIN correct! Access granted.");
                    } else if (session.getCurrentState().equals(BLOCKED)) {
                        System.out.println("3 failed attempts! Card blocked.");
                    } else {
                        System.out.println("Incorrect PIN. Please try again.");
                    }
                    break;

                case AUTHENTICATED:
                    System.out.println("------------------------------------------");
                    System.out.printf("Current Balance: $%.2f | Daily Limit: $%.2f%n", accountBalance, dailyRemainingLimit);
                    System.out.println("1. Withdraw Cash");
                    System.out.println("2. Eject Card");
                    System.out.print("Choose action: ");
                    int authChoice = scanner.nextInt();

                    if (authChoice == 1) {
                        session.startTransaction();
                    } else if (authChoice == 2) {
                        session.ejectCard();
                        System.out.println("Card ejected.");
                    } else {
                        System.out.println("Invalid option.");
                    }
                    break;

                case TRANSACTION_IN_PROGRESS:
                    System.out.print("Enter withdrawal amount: ");
                    int amount = scanner.nextInt();

                    // Evaluate Withdrawal
                    String decision = approveWithdrawal(isAccountActive, amount, accountBalance, dailyRemainingLimit);
                    System.out.println(decision);

                    if (decision.equals(APPROVED)) {
                        accountBalance -= amount;
                        dailyRemainingLimit -= amount;
                        System.out.println("Please take your cash ($" + amount + ").");
                        System.out.printf("Updated Balance: $%.2f | Remaining Limit: $%.2f%n", accountBalance, dailyRemainingLimit);
                    } else {
                        System.out.println("Transaction rejected due to: " + decision);
                    }

                    session.completeTransaction();
                    break;

                case BLOCKED:
                    System.out.println("Your account/card is blocked.");
                    System.out.println("1. Eject Card");
                    System.out.print("Choose action: ");
                    if (scanner.nextInt() == 1) {
                        session.ejectCard();
                        System.out.println("Card ejected.");
                    }
                    break;

                case CARD_EJECTED:
                    System.out.println("Please take your card.");
                    System.out.println("1. Reset ATM for next user");
                    System.out.print("Choose action: ");
                    if (scanner.nextInt() == 1) {
                        session.reset();
                        System.out.println("ATM reset to IDLE.");
                    }
                    break;
            }
        }
    }
}