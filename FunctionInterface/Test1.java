import Intref1;

@FunctionalInterface
interface Intref1 {
    // void add(int a,int b);
    // int getLength(String s);
    int squareRoot(int x);
}

// with out lamadha Expression implementaion
class Demo implements Intref1 {
    public int squareRoot(int s) {
        return s * s;
    }

    public void add(int a, int b) {
        System.out.println("The sum" + (a + b));
    }
}

public class Test1 {
public static void main(String arg[]){
    //with out lamadha Expression
    Intref1 intref1 = new Demo();
    System.out.println(intref1.squareRoot(4));
    //with  lamadha Expression
    Intref1 intref = s->s*s;
    System.out.println(intref.squareRoot(4));
    System.out.println(intref.squareRoot(10));
    //intref.add(100, 200);
}
}