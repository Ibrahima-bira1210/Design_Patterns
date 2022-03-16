package adapter_pattern.Older;

public class OldImpl {
    public double produit(double a, double b){
        return a*b;
    }
    public void show(double n){
        System.out.println("**********************");
        System.out.println("----------Ancienne Implementation ---> "+ n);
    }
}
