package Decorator_pattern.components;


public class Columbia extends Boisson{

    public Columbia() {
        description = "Sumatra";
    }

    @Override
    public double cout() {
        return 15;
    }
}
