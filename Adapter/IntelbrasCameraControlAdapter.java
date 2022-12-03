package Adapter;

public class IntelbrasCameraControlAdapter implements CameraControlAdapter {

    private final IntelbrasCameraControl cameraControl;

    public IntelbrasCameraControlAdapter() {
        this.cameraControl = new IntelbrasCameraControl();
    }

    @Override
    public void startRecording() {
        cameraControl.startRecord();
    }

    @Override
    public void stopRecording() {
        cameraControl.stopRecord();
    }
}
