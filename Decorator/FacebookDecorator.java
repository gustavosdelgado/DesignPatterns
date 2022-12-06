package Decorator;

public class FacebookDecorator extends BaseNotifierDecorator {

    FacebookDecorator(INotifier wrapped) {
        super(wrapped);
    }

    @Override
    public void send(String msg) {
        super.send(msg);
        System.out.println("Sending notification through Facebook also");
    }

}
