class DummyAppPro extends DummyApp {

    private boolean cameraOn;

    public DummyAppPro(String[] participants) {
        super(participants);
    }

    public void turnCameraOn() {
        cameraOn = true;
    }

    public void turnCameraOff() {
        cameraOn = false;
    }

    public boolean isCameraOn() {
        return cameraOn;
    }
}