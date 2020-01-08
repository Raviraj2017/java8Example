import java.util.function.Predicate;

public class Test {
public static void main(String[] args) {
    Predicate<Integer> p = I->I>10;

    System.out.println(p.test(100));  
    //System.out.println(p.test("5")); //compile time error 

    System.out.println("Predicate For String");
    Predicate<String> s = S->S.length()>5;

    System.out.println(s.test("abcdef"));
    System.out.println(s.test("abcd"));

}
}