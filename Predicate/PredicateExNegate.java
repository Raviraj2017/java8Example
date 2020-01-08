import java.util.function.Predicate;

public class PredicateExNegate {
    public static void main(String[] args) {
        int[] x = { 5, 2, 4, 3, 6, 7, 8, 9, 0, 10, 20, 13, 16 };
        Predicate<Integer> p1 = I -> I > 10;
        Predicate<Integer> p2 = I -> I % 2 == 0;
        System.out.println("Number greater then 10");
        m1(p1, x);
        System.out.println("Number to check even number");
        m1(p2, x);
        System.out.println("Number not greater then 10");
        m1(p1.negate(), x);
        System.out.println("Number greater then 10 and even number");
        m1(p1.and(p2), x);
        System.out.println("Number greater then 10 OR even number");
        m1(p1.or(p2), x);

        System.out.println("Number not greater then 10 and even number");
        m1(p1.negate().and(p2), x);

        System.out.println("Number not greater then 10 and not even number");
        m1(p1.negate().and(p2.negate()), x);
        System.out.println("Number not greater then 10 or not  even number");
        m1(p1.negate().or(p2.negate()), x);

    }

    public static void m1(Predicate<Integer> p, int x[]) {
        for (int i : x) {
            if (p.test(i))
                System.out.print(i + "\t");
        }
        System.out.println();
    }

}