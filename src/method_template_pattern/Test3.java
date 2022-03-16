package method_template_pattern;

public class Test3 {
    public static void main(String[] args) {
        Template template = new TemplateImpl1();
        Template template2 = new TemplateImple2();
        System.out.println("---------Template Implementation 1-------------");
        System.out.println(template.ComputeTemplate(30,40));
        System.out.println("*************************************");
        System.out.println("---------Template Implementation 2 ---------------");
        System.out.println(template2.ComputeTemplate(30,40));
    }
}
