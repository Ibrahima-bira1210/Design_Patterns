package composite_pattern;

import composite_pattern.comp.File;
import composite_pattern.comp.Folder;

public class Test {
    public static void main(String[] args) {
        Folder root = new Folder("Design Pattern");
        Folder d1 = (Folder) root.addChild(new Folder("Comportement"));
        Folder d2 = (Folder)root.addChild(new Folder("Structure"));
        Folder d3 = (Folder)root.addChild(new Folder("Creation"));
        d1.addChild(new File("Strategy"));
        d2.addChild(new File("Decorator"));
        d2.addChild(new File("Composite"));
        d2.addChild(new File("Adapter"));
        d3.addChild(new File("Singleton"));
        d3.addChild(new File("Builder"));
        Folder d21 = (Folder) d2.addChild(new Folder("MyFolder"));
        d21.addChild(new File("myFile1 for d21"));
        d21.addChild(new File("myFile2 for d21"));
        d21.addChild(new File("myFile3 for d21"));

        root.show();
    }
}
