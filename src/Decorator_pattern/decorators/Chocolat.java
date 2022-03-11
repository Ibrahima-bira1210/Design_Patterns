package Decorator_pattern.decorators;

import Decorator_pattern.components.Boisson;

public class Chocolat extends AbstractDecorator{
    public Chocolat(Boisson boisson) {
        super(boisson);
    }

    @Override
    public double cout() {
        return 1.5 + boisson.cout();
    }

    @Override
    public String getDescription() {
        return boisson.getDescription() + " au chocolat";
    }
}
