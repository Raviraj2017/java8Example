import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import javax.swing.plaf.synth.SynthMenuBarUI;


public class ArrayListExample{
public static void main(String arg[]){
    List<Integer> l = new ArrayList<>();
    l.add(10);
    l.add(2);
    l.add(9);
    l.add(5);

    System.out.println("Before Sorting");
    System.out.println(l);

    //Collections.sort(l);
   System.out.println("After Sorting");
   // Collections.sort(l, new MyComparator());
   Collections.sort(l, (I1,I2)->(I1<I2)?-1:(I1>I2)?1:0);
    System.out.println(l);
    /////// with customize sorting order////////
    
    ArrayList<Employee> alc = new ArrayList<>();
    alc.add(new Employee(1, "Rajat"));
    alc.add (new Employee(200, "Rao"));
    alc.add(new Employee(100, "Pooja"));
    alc.add(new Employee(50, "Ranu"));
    System.out.println("with customized Array List");
    System.out.println(alc);

    Collections.sort(alc,(e1,e2)->(e1.eno<e2.eno)?-1:(e1.eno>e2.eno)?1:0);
    Collections.sort(alc,(e1,e2)->(e1.getEname().compareTo(e2.getEname())));
    //Collections.sort(alc,Comparator.comparing(Employee::getEname));
    System.out.println(alc);

}
}