package State_Pattern;

public class OnGarageState extends State {

    public OnGarageState(AvionImpl avion) {
        super(avion);
    }

    @Override
    void performSortirDuGarage() {
        System.out.println("Transition d'etat du garage ====> vers la piste");
        avion.setState(new OnPisteState(avion));
    }

    @Override
    void performEntrerAuGarage() {
        System.out.println("Impossible je suis deja au garage");
    }

    @Override
    void performDecoller() {
        System.out.println("Impossibble de decoller je suis au garage");
    }

    @Override
    void performAtterir() {
        System.out.println("Impossibble de d'atterir je suis au garage");

    }

    @Override
    void performDoActivity() {
        for(int i = 0; i < 5; i++){
            System.out.println("Activity d'etat au Grarage......"+i);
        }
    }
}