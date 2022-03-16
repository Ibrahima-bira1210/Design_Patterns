package adapter_pattern.Adpaters;

public class StandardImpl  implements Standard {
    @Override
    public void operation(double nb1, double nb2) {
        System.out.println("Standard Implementation Result" + nb1*nb2);
    }
}
