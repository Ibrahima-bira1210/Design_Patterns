package State_Pattern;

public class AvionImpl implements Avion{
    private State state;

    public AvionImpl() {
        state = new OnPisteState(this);
    }

    public void setState(State state) {
        this.state = state;
    }

    @Override
    public void sortirDuGarage() {
        state.performSortirDuGarage();
    }

    @Override
    public void entrerAuGarage() {
        state.performEntrerAuGarage();
    }

    @Override
    public void decoller() {
        state.performDecoller();
    }

    @Override
    public void atterir() {
        state.performAtterir();
    }

    @Override
    public void doActivity() {
        state.performDoActivity();
    }

    // define an internal class for state and use it by composition


}
