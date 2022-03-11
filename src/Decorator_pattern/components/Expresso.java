package Decorator_pattern.components;

public class Expresso extends Boisson{

    public Expresso() {
        description = "Expresso";
    }

    @Override
    public double cout() {
        return 12;
    }
}
