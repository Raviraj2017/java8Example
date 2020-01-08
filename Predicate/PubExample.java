import java.util.function.Predicate;

class SoftwareEngnieer {
    String name;
    int age;
    boolean isHavingGf;

    SoftwareEngnieer(String name, int age, boolean isHavingGf) {
        this.name = name;
        this.age = age;
        this.isHavingGf = isHavingGf;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return name;
    }

}

public class PubExample {
    public static void main(String[] args) {
        SoftwareEngnieer[] se = { new SoftwareEngnieer("Ravi", 19, false), new SoftwareEngnieer("Raj", 20, false),
                new SoftwareEngnieer("Duga", 60, false), new SoftwareEngnieer("Rammi", 20, true),
                new SoftwareEngnieer("sumit", 69, true), };
        Predicate<SoftwareEngnieer> p = s -> s.age >= 18 && s.isHavingGf;
        System.out.println("allowed in PUB are :");
        for (SoftwareEngnieer s : se) {
            if (p.test(s)) {
                System.out.println(s);
            }
            ;

        }

        System.out.println("Not allowed in PUB are :");
        for (SoftwareEngnieer s : se) {
            if (p.negate().test(s)) {
                System.out.println(s);
            };

        }

    }
}