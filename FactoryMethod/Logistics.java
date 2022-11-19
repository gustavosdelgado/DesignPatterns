package FactoryMethod;

public interface Logistics {
    
    public default void planDelivery() {
        Transport t = createTransport();

        t.deliver();
    }

    public Transport createTransport();
    
}