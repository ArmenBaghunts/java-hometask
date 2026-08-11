public class Card {

    private String pin;
    private double balance;
    private String cardNumber;
    private double dailyWithdrawn;

    public Card(String pin, double balance, String cardNumber) {
        this.pin = pin;
        this.balance = balance;
        this.cardNumber = cardNumber;
        this.dailyWithdrawn = 0;
    }

    public boolean checkPin(String enteredPin) {
        return pin.equals(enteredPin);
    }

    public double getBalance() {
        return balance;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public double getDailyWithdrawn() {
        return dailyWithdrawn;
    }

    public void withdraw(double amount) {
        balance = balance - amount;
        dailyWithdrawn = dailyWithdrawn + amount;
    }

    public void resetDailyLimit() {
        dailyWithdrawn = 0;
    }
}
