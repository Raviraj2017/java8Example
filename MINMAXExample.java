import java.util.ArrayList;
import java.util.List;

class MINMAXExample {
    public static void main(String[] args) {

        List<Integer> l = new ArrayList<>();
        l.add(10);
        l.add(20);
        l.add(3);
        l.add(10);
        System.out.println(l);

        Integer l1 = l.stream().min((i1, i2) -> -i1.compareTo(i2)).get();

        System.out.println("minimum value is" + l1);

    }

}