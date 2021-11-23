package Strategy_pattern.FlyBehavior;

public class FlyNoWay implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("Duck Fly No Way");
    }
}
