class DummyAppProMax extends DummyAppPro {

    private boolean screenShare;

    public DummyAppProMax(String[] participants) {
        super(participants);
    }

    public void startScreenShare() {
        if (callActive) {
            screenShare = true;
        }
    }

    public void stopScreenShare() {
        screenShare = false;
    }
}