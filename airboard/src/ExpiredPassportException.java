public class ExpiredPassportException extends Exception {
    ExpiredPassportException() {
        super("Date of your passport is expired.");
    }
}
