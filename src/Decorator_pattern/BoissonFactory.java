package Decorator_pattern;

import Decorator_pattern.components.Boisson;
import Decorator_pattern.components.Expresso;
import Decorator_pattern.decorators.Chocolat;

public class BoissonFactory {
    public static void main(String[] args) {
        Boisson boisson = new Expresso();
        System.out.println(boisson.getDescription());
        System.out.println(boisson.cout());
        System.out.println("-----------------------------------");
        boisson = new Chocolat(boisson);
        System.out.println(boisson.getDescription());
        System.out.println(boisson.cout());

    }
}
