package composite_pattern.comp;

import java.util.ArrayList;
import java.util.List;

public class Folder extends Component{
    private List<Component> childs = new ArrayList<>();

    public Folder(String name) {
        super(name);
    }

    public Component addChild(Component child) {
        child.level = this.level +1;
        childs.add(child);
        return child;
    }

    @Override
    public void show() {
        System.out.println(tab() + "folder:" + name);
        for (Component child :childs){
            child.show();
        }
    }
}
