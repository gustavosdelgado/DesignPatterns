package AbstractFactory;

public class UIElementFactoryLinux implements UIElementFactory {

    @Override
    public Button createButton() {
        return new ButtonLinux();
    }

    @Override
    public Form createForm() {
        return new FormLinux();
    }
    
}
