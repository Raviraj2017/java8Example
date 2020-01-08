import java.util.function.Function;
import java.util.function.Predicate;

public class Test {
    public static void main(String[] args) {
        String s1 = "Durga Software Solutions Hyderabad";
        Function<String,String> f2 = s-> s.replaceAll(" ","");
        System.out.println(f2.apply(s1));
        Function<String,Integer> f = s-> s.length();
        System.out.println(f.apply("Romeo"));
        // to print squre of the number
        Function<Integer,Integer> f1 = i-> i*i;
        System.out.println(f1.apply(10));
        
    }
}