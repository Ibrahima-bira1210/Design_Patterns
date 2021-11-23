package Strategy_pattern.QuackBehavior;

public class Squeak implements QuackBehavior{
    @Override
    public void Quack() {
        System.out.println("Duck Squeak");
    }
}
