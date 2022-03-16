package State_Pattern;

public abstract class State{
    protected AvionImpl avion;

    public State(AvionImpl avion) {
        this.avion = avion;
    }

    // state transition operation
    abstract void performSortirDuGarage();
    abstract void performEntrerAuGarage();
    abstract void performDecoller();
    abstract void performAtterir();

    // do ann activity
    abstract void performDoActivity();
}
