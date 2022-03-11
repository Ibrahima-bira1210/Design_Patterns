package Decorator_pattern.components;


public class Tea extends Boisson{

    public Tea() {
        description = "Tea";
    }

    @Override
    public double cout() {
        return 12.5;
    }
}
