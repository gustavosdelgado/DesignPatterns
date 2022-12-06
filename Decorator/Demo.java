package Decorator;

public class Demo {

    public static void main(String[] args) {
        INotifier notifier = new FacebookDecorator(new WhatsAppDecorator(new Notifier()));

        notifier.send("Enviando mensagem na main");
    }
}
