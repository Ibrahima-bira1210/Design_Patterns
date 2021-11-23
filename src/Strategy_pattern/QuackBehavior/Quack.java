package Strategy_pattern.QuackBehavior;

public class Quack implements QuackBehavior{
    @Override
    public void Quack() {
        System.out.println("Duck Quack");
    }
}
