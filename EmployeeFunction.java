
//Profram of using Funtion and Predicate Using Employee Class to get toatal Monthly salary of all employee
import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

class Employee {
    String name;
    double salary;

    Employee(final String name, final int salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "{" + name + ":" + salary + " }";
    }
}

class EmployeeFunction {
    public static void main(final String[] args) {
        ArrayList<Employee> l = new ArrayList<>();
        populate(l);
        System.out.println("Emppoyee before increament");
        System.out.println(l);
        //Predicate to check emp salary greater then 3500
        Predicate<Employee> p = e -> e.salary < 3500;

        //funtion to increatement the salary
        Function<Employee, Employee> f = e -> {
            e.salary = e.salary + 477;
            return e;
        };

        /*
         * Function<ArrayList<Employee>,Double> f = Emp-> { double totalSalary = 0; for
         * (Employee employee : Emp) { totalSalary= totalSalary + employee.salary; }
         * return totalSalary; }; System.out.println("Total Monthly salary = " +
         * f.apply(l));
         */
        ArrayList<Employee> salaryIncreamentEmp = new ArrayList<>();
        for (Employee e : l) {
            if (p.test(e)) {
                f.apply(e);
                salaryIncreamentEmp.add(e);
            }
            ;
            System.out.println("After increament");
            System.out.println(l);

            System.out.println("whoes salary increament");
            System.out.println(salaryIncreamentEmp);

        }
    }

    static void populate(ArrayList<Employee> al) {
        al.add(new Employee("Durga", 2000));
        al.add(new Employee("Ram", 8000));
        al.add(new Employee("Rahul", 7000));
        al.add(new Employee("Pooja", 6000));
        al.add(new Employee("Neha", 2000));

    }
}