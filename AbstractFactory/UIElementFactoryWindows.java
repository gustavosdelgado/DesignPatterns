package AbstractFactory;

public class UIElementFactoryWindows implements UIElementFactory {

    @Override
    public Button createButton() {
        return new ButtonWindows();
    }

    @Override
    public Form createForm() {
        return new FormWindows();
    }
    
}
