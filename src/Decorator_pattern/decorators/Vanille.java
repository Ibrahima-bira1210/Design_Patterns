package Decorator_pattern.decorators;

import Decorator_pattern.components.Boisson;

public class Vanille extends AbstractDecorator{
    public Vanille(Boisson boisson) {
        super(boisson);
    }

    @Override
    public double cout() {
        return 0.9 + boisson.cout();
    }

    @Override
    public String getDescription() {
        return boisson.getDescription() + " au vanille";
    }
}
