package Decorator_pattern.decorators;

import Decorator_pattern.components.Boisson;

public class Chantilly extends AbstractDecorator{
    public Chantilly(Boisson boisson) {
        super(boisson);
    }

    @Override
    public double cout() {
        return 1 + boisson.cout();
    }

    @Override
    public String getDescription() {
        return boisson.getDescription() + " au chantilly";
    }
}