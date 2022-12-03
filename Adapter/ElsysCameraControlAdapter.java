package Adapter;

public class ElsysCameraControlAdapter implements CameraControlAdapter {

    private final ElsysControleCameraDeSeguranca cameraControl;

    public ElsysCameraControlAdapter() {
        this.cameraControl = new ElsysControleCameraDeSeguranca();
    }

    @Override
    public void startRecording() {
        cameraControl.iniciarGravacao();
    }

    @Override
    public void stopRecording() {
        cameraControl.interomperGravacao();
    }
}
