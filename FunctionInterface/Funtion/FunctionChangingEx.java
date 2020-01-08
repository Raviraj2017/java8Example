import java.util.function.Function;
import java.util.function.Predicate;
class FunctionChangingEx {
    public static void main(String[] args) {
        Function<String,String> f1 =  s-> s.toUpperCase();
       // Function<String,String> f2 = s -> s.substring(0, 9);
       Function<String,Integer> f2 = s -> s.length();

        System.out.println("Function with f1"+ f1.apply("Ashwiaryaabhi"));
        System.out.println("function with f2"+ f2.apply("Ashwiaryaabhi"));
        System.out.println("f1.andThen(f2)"+ f1.andThen(f2).apply("Ashwiaryaabhi"));
        System.out.println("f1.compose(f2)"+ f2.compose(f1).apply("Ashwiaryaabhi"));
    }
}