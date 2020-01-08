import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        Set<Integer> ts = new TreeSet<>((I1,I2)->(I1>I2)?1:(I1<I2)?1:0);
        ts.add(10);ts.add(4);ts.add(100);ts.add(0);
        System.out.println(ts);
    }
}