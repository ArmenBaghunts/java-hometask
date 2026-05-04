public class NoVisaException extends Exception {
    NoVisaException(){
        super("You are not permitted to leave the country. There is no visa in your passport");
    }
}
