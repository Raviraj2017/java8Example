import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Test{
    public static void main(final String[] args) {
        final ArrayList<String> list = new ArrayList<>();
        list.add("Raviraj");
        list.add("Ponmani");
        list.add("Pooja");
        list.add("Chiranjivi");
        list.add("Mithalesh");
        list.add("Sukhinand");

         List<String> l1 = list.stream().
         filter(s -> s.length() >= 6).map(s->s.toUpperCase()).
         sorted(Comparator.comparing())
         .collect(Collectors.toList()));
        //List<String> intList = list.stream().collect(Collectors.toList());

        System.out.println(l1);
    }
}