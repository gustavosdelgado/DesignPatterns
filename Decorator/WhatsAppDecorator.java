package Decorator;

public class WhatsAppDecorator extends BaseNotifierDecorator {

    WhatsAppDecorator(INotifier wrapped) {
        super(wrapped);
    }

    @Override
    public void send(String msg) {
        super.send(msg);
        System.out.println("Sending notification through WhatsApp also");
    }

}
