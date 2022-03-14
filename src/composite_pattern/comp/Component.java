package composite_pattern.comp;

public abstract class Component {
    public Component(String name) {
        this.name = name;
    }

    protected String name;
    protected int level = 0;
    public abstract void show();


    public String tab(){
        StringBuilder tab = new StringBuilder();
        for(int i =0;i<level;i++){
            tab.append("\t");
        }
        return tab.toString();
    }
}
