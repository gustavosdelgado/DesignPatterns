package Decorator;

public abstract class BaseNotifierDecorator implements INotifier {

    private final INotifier wrapped;

    BaseNotifierDecorator(INotifier wrapped) {
        this.wrapped = wrapped;
    }

    @Override
    public void send(String msg) {
        wrapped.send(msg);
    }

}
