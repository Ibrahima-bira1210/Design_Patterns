package method_template_pattern;

public class TemplateImple2 extends Template{
    @Override
    protected double detail2(double x, double y, int param) {
        double w = x*y/param;
        return Math.log10(w);
    }

    @Override
    protected int detail1(double data) {
        return (int)Math.tan(data);
    }
}
