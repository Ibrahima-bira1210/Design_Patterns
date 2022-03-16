package State_Pattern;

public interface Avion {
    // state transition operation
    void sortirDuGarage();
    void entrerAuGarage();
    void decoller();
    void atterir();

    // do ann activity
    void doActivity();
}
