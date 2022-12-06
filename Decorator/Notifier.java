package Decorator;

public class Notifier implements INotifier {
    @Override
    public void send(String msg) {
        System.out.println("Sending notification through e-mail: " + msg);
    }
}
