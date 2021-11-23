package Strategy_pattern.FlyBehavior;

public class FlyWithWings implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("Duck fly with wings");
    }
}
