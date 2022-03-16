package adapter_pattern;

import adapter_pattern.Adpaters.AdapterImpl;
import adapter_pattern.Adpaters.StandardImpl;

public class Test {
    public static void main(String [] args){
        Client client = new Client();
        client.setStandard(new StandardImpl());
        client.treatment(12,14);

        Client client2 = new Client();
        client2.setStandard(new AdapterImpl());
        client2.treatment(12,14);
    }
}
