//simple consumer Example 

import java.util.function.Consumer;

class SampleTest {
    public static void main(final String[] args) {
        Consumer<String> c = s -> System.out.println(s);

        c.accept("Hello");
        c.accept("Cosumer Example");

    }

}