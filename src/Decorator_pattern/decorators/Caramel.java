package Decorator_pattern.decorators;

import Decorator_pattern.components.Boisson;

public class Caramel extends AbstractDecorator{
    public Caramel(Boisson boisson) {
        super(boisson);
    }

    @Override
    public double cout() {
        return 1.8 + boisson.cout();
    }

    @Override
    public String getDescription() {
        return boisson.getDescription() + " au caramel";
    }
}
