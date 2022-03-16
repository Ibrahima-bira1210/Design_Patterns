package State_Pattern;

public  class OnAirState extends State {

    public OnAirState(AvionImpl avion) {
        super(avion);
    }

    @Override
    void performSortirDuGarage() {
        System.out.println("Impossibble de sortir du garage je suis en l'air");

    }

    @Override
    void performEntrerAuGarage() {
        System.out.println("Impossibble d'entrer du garage je suis en l'air");
    }

    @Override
    void performDecoller() {
        System.out.println("Impossibble de decollerdu garage je suis en l'air");

    }

    @Override
    void performAtterir() {
        System.out.println("Transition de en l'aire ====>  vers la piste");
        avion.setState(new OnPisteState(avion));
    }

    @Override
    void performDoActivity() {
        for(int i = 0; i < 5; i++){
            System.out.println("Activity d'etat en l'Air ......"+i);
        }
    }
}