//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Passenger p = new Passenger(true, false, false);
        BoardingService b = new BoardingService();

try {
    b.boardPassenger(p);

}
catch (ExpiredPassportException e) {
    System.out.println("Your passport date is expired");
}
catch (NoVisaException e) {
    System.out.println("There is no visa in your Passport");
}

catch (InvalidBoardingPassException e) {
    System.out.println("You do not have a ticket");

}

catch (MostCriticalException e) {
    System.out.println("There are several problems with your documents");
}
    }
}