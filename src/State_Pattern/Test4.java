package State_Pattern;

public class Test4 {
    public static void main(String[] args) {
        Avion avion = new AvionImpl();
        avion.doActivity();
        System.out.println("--------------------------------");
        avion.sortirDuGarage();
        avion.doActivity();
        System.out.println("--------------------------------");
        avion.entrerAuGarage();
        avion.doActivity();
        System.out.println("--------------------------------");
        avion.atterir();
        avion.doActivity();
        System.out.println("--------------------------------");
        avion.sortirDuGarage();
        avion.doActivity();
        System.out.println("--------------------------------");
        avion.decoller();
        avion.doActivity();
        System.out.println("--------------------------------");
        avion.atterir();
        avion.doActivity();

    }
}
