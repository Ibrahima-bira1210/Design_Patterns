package Strategy_pattern.QuackBehavior;

public class MuteQuack implements QuackBehavior{
    @Override
    public void Quack() {
        System.out.println("Duck MuteQuack");
    }
}
