public class InvalidBoardingPassException extends Exception{
    InvalidBoardingPassException() {
        super("You don't have ticket for fly.");
    }
}
