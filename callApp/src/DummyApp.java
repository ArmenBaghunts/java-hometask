class DummyApp {
    private String[] participants;
    protected boolean callActive;
    private int lastCallDuration;

    public DummyApp(String[] participants) {
        if (participants.length <= 2) {
            this.participants = participants;
            callActive = true;
        } else {
            System.out.println("Max 2 participants allowed.");
            callActive = false;
        }
    }

    public void call() {
        callActive = true;
    }

    public void answer() {
        callActive = true;
    }

    public void end() {
        callActive = false;
        lastCallDuration = 10; // dummy value
    }

    public int getLastCallDuration() {
        return lastCallDuration;
    }
}