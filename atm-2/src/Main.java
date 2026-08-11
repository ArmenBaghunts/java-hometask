public class Main {

    public static void main(String[] args) {

        // Create separate cards
        Card card1 = new Card("1234", 60000, "1111222233334444");
        Card card2 = new Card("5678", 30000, "5555666677778888");

        // Create a separate ATM
        ATM atm = new ATM();

        // Insert card1
        atm.insertCard(card1);

        System.out.println("State: " + atm.getState());

        // Wrong PIN
        atm.enterPin("1111");
        System.out.println("State after wrong PIN: " + atm.getState());

        // Correct PIN
        atm.enterPin("1234");
        System.out.println("State after correct PIN: " + atm.getState());

        // Valid withdrawal
        System.out.println("Withdrawal 10000: " + atm.withdraw(10000));
        System.out.println("Balance: " + card1.getBalance());

        // Invalid amount - not multiple of 100
        System.out.println("Withdrawal 550: " + atm.withdraw(550));

        // Too low
        System.out.println("Withdrawal 50: " + atm.withdraw(50));

        // Too high
        System.out.println("Withdrawal 21000: " + atm.withdraw(21000));

        // Eject card
        atm.ejectCard();
        System.out.println("State after eject: " + atm.getState());

        // Reset
        atm.reset();
        System.out.println("State after reset: " + atm.getState());

        // Insert another card
        atm.insertCard(card2);
        atm.enterPin("5678");

        System.out.println("Second card state: " + atm.getState());
        System.out.println("Second card balance: " + card2.getBalance());
    }
}
