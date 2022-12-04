package Adapter;

import java.lang.reflect.Constructor;

public class Client {

    public static void main(String[] args) {
        String cameraBrand = "Elsys";
        CameraControlAdapter camera = null;
        try {
            Class<CameraControlAdapter> aClass =
                    (Class<CameraControlAdapter>) Class.forName(
                            "Adapter." + cameraBrand + "CameraControlAdapter");
            Constructor<CameraControlAdapter> constructor = aClass.getDeclaredConstructor();
            camera = constructor.newInstance();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        camera.startRecording();
    }
}
