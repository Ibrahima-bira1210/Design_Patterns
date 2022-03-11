package Decorator_pattern.decorators;

import Decorator_pattern.components.Boisson;

public abstract class AbstractDecorator extends Boisson{
    protected Boisson boisson;

    public AbstractDecorator(Boisson boisson) {
        this.boisson = boisson;
    }

    public abstract String getDescription();

}
