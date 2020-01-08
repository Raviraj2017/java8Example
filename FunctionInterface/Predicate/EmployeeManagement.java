import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

class Employee {
    String name;
    String designation;
    double salary;
    String location;

    Employee(final String name, final String designation, final double salary, final String location) {
        this.location = location;
        this.designation = designation;
        this.salary = salary;
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        Employee emp = (Employee) obj;
        return (name.equals(emp.name) && designation.equals(emp.designation) && salary == emp.salary
                && location.equals(emp.location));
    }

    @Override
    public String toString() {
        return String.format("{%s,%s,%.2f,%s}", name, designation, salary, location);
    }
}

public class EmployeeManagement {
    public static void main(final String[] args) {
        final List<Employee> employee = new ArrayList<>();
        populateEmployee(employee);
        // System.out.println(employee);
        final Predicate<Employee> p = emp -> emp.designation.equals("Manager");
        System.out.println("Manager Information");
        display(p, employee);

        final Predicate<Employee> p2 = emp -> emp.location.equals("Bangalore");
        System.out.println("Empoyee reside in Bangalore");
        display(p2, employee);

        final Predicate<Employee> p3 = emp -> emp.salary < 20000;
        System.out.println("Empoyee to check salary less then 20000 Give hike and bonas");
        display(p3, employee);

        System.out.println("Employee from banglore and manager");
        display(p.and(p2), employee);

        System.out.println("Employee is manager or salary less than 20000");
        display(p.or(p3), employee);

        System.out.println("Employee who are not manager");
        display(p.negate(), employee);

        System.out.println("Prediacate isEquals");
        Predicate<Employee> isCEO = Predicate.isEqual(new Employee("Durga", "CEO", 30000, "Hyderabad"));
        
        Employee e1 = new Employee("Durga", "CEO", 30000, "Hyderabad");
        Employee e2 = new Employee("Durga", "CEO", 34000, "Hyderabad");
        System.out.println(isCEO.test(e1));
        System.out.println(isCEO.test(e2));

    }

    public static void populateEmployee(final List<Employee> empList) {
        empList.add(new Employee("Durga", "CEO", 30000, "Hyderabad"));
        empList.add(new Employee("Ravi", "Manager", 30000, "Mumbai"));
        empList.add(new Employee("Gaurav", "Manager", 30000, "Bangalore"));
        empList.add(new Employee("Kareena", "Lead", 20000, "Delhi"));
        empList.add(new Employee("Sanjeet", "Lead", 15000, "Delhi"));
        empList.add(new Employee("Anuksha", "Lead", 10000, "Bangalore"));
        empList.add(new Employee("Kanukska", "Developer", 10000, "pune"));
        empList.add(new Employee("Aman", "Developer", 10000, "pune"));
        empList.add(new Employee("Raj", "Consultant", 10000, "Hyderabad"));
        empList.add(new Employee("Pooja", "Consultant", 30000, "Mumbai"));
        empList.add(new Employee("Rahul", "Developer", 1000, "Mumbai"));

    }

    public static void display(Predicate<Employee> p, List<Employee> emp) {
        for (Employee employee : emp) {
            if (p.test(employee)) {
                System.out.println(employee + "\t");
            }

        }
        System.out.println("######################");
    }
}
