import java.util.TreeMap;

import javax.sound.sampled.SourceDataLine;

class TreeMapExample {
    public static void main(String[] args) {
        TreeMap<Integer,String> tm = new TreeMap<>((i1,i2)->(i1>i2)?-1:(i1<i2)?1:0);
        tm.put(1, "Druga");
        tm.put(2, "Sunny");
        tm.put(200,"Bunny");
        tm.put(100,"pinny");

        System.out.println(tm);
        }

}