package proxy_pattern;

import java.util.Random;

public class Proxy implements Standard{
    private StandardImpl1 target;
    @Override
    public void process() {
        System.out.println("Checking secure context");
        boolean b = new Random().nextBoolean();
        if(b){
            System.out.println("Before Method Call");
            target = new StandardImpl1();
            target.process();
            System.out.println("After Method Call");
        }else {
            throw new RuntimeException("Forbidden 403");
        }
    }
}
