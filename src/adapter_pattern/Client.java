package adapter_pattern;

import adapter_pattern.Adpaters.Standard;

public class Client {
    private Standard standard;

    public void setStandard(Standard standard) {
        this.standard = standard;
    }

    public void treatment(double a, double b){
        System.out.println("**********************");
        System.out.println("----------------------");
        standard.operation(a, b);
        System.out.println("**********************");
        System.out.println("----------------------");
    }
}
