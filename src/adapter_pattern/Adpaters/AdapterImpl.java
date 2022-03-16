package adapter_pattern.Adpaters;

import adapter_pattern.Older.OldImpl;

public class AdapterImpl extends OldImpl implements Standard {
    @Override
    public void operation(double nb1, double nb2) {
        double p = produit(nb1,nb2);
        show(p);
    }
}
