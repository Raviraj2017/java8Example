//Profram of using Funtion and Predicate Using Student Class
import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

class Student {
    String name;
    int marks;

    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "(" + name + ":" + marks + " )";
    }
}

class StudentFunction {
    public static void main(String[] args) {
        ArrayList<Student> l = new ArrayList<>();
        populate(l);
    Function<Student,String> f = S-> {
        int marks = S.marks;
        if(marks>=80){
            return "A[Distinction]";
        }
        else if(marks>=60){
            return "B[Frist class]";
        }
        else if(marks>=50){
            return "C[Second class]";
        }
        else if(marks>=35){
            return "D[Thrid class]";
        }
        else 
        return "E[Fail]";
    };

    /* for (Student student : l) {
        System.out.println("Name:" +student.name);
        System.out.println("Marks"+student.marks);
       System.out.println("Grade: "+f.apply(student));
       System.out.println("===========================");
    } */
    System.out.println("List of all Student whos marks is greater then 60");
    Predicate<Student> p = s-> s.marks>=60;
    for (Student student : l) {
        if(p.test(student)){
            System.out.println("Name:" +student.name);
            System.out.println("Marks"+student.marks);
           System.out.println("Grade: "+f.apply(student));
           System.out.println("===========================");
   
        }
    }

    }

   static void populate(ArrayList<Student> al){
        al.add(new Student("Durga", 90));
        al.add(new Student("Ram", 80));
        al.add(new Student("Rahul", 70));
        al.add(new Student("Pooja", 60));
        al.add(new Student("Runi", 45));
        al.add(new Student("divya", 30));
        al.add(new Student("Namrata", 50));
        
    }
}