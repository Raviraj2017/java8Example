import java.util.HashMap;
import java.util.Map;

import javax.sound.sampled.SourceDataLine;

public class MapExample {
    public static void main(String[] args) {
        Map<String,String> hm = new HashMap<>();
        hm.put("A", "Apple");
        hm.put("Z", "Zebra");
        hm.put("Durga", "Java");
        hm.put("B", "Boy");
        hm.put("T","Tiger");
        
        System.out.println(hm);
        //{A=Apple, B=Boy, T=Tiger, Z=Zebra, Durga=Java}
    }
}