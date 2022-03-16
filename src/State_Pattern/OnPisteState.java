package State_Pattern;

public class OnPisteState extends State {

    public OnPisteState(AvionImpl avion) {
        super(avion);
    }

    @Override
    void performSortirDuGarage() {
        System.out.println("Impossible de sortir du Garage Je suis deja en Piste");
    }

    @Override
    void performEntrerAuGarage() {
        avion.setState( new OnGarageState(avion));
        System.out.println("Transition d'etat: En piste ======> Garage");
    }

    @Override
    void performDecoller() {
        avion.setState(new OnAirState(avion));
        System.out.println("Transition d'etat: En piste ======> Decoller");

    }

    @Override
    void performAtterir() {
        System.out.println("Impossible d'atterir Je suis deja en Piste");
    }

    @Override
    void performDoActivity() {
        for(int i = 0; i < 5; i++){
            System.out.println("Activity d'etat en Piste......"+ i);
        }
    }
}