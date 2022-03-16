package adapter_pattern.Adpaters;

import adapter_pattern.Older.OldImpl;

public class AdapterImpl2 implements Standard{
    OldImpl older = new OldImpl();
    @Override
    public void operation(double nb1, double nb2) {
        double p= older.produit(nb1, nb2);
        older.show(p);
    }
}
