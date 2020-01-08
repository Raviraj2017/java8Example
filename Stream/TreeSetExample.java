import java.util.ArrayList;
import java.util.List;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class TreeSetExample {
    public static void main(String[] args) {
        List<Integer> ts = new ArrayList<>();
        ts.add(10);ts.add(4);ts.add(100);ts.add(0);
        System.out.println(ts);

        List<Integer> tsort = ts.stream().sorted((i1,i2)->-i1.compareTo(i2)).collect(Collectors.toList());
        System.out.println(tsort);
    }

}