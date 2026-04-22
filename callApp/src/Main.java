public class Main {
    public static void main(String[] args) {

        String[] participants = {
                "John Smith",
                "Anna Brown",
                "Mike White"
        };

        DummyAppProMax app = new DummyAppProMax(participants);

        app.call();

        app.turnCameraOn();

        app.startScreenShare();

        app.end();

        System.out.println("Last call duration = "
                + app.getLastCallDuration());
    }
}