import java.util.Scanner;
import java.util.function.Predicate;

class User {
    String userName;
    String password;

    User(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "User :"+ userName;
    }
}

public class AuthenticateUser {
    public static void main(String[] args) {
        Predicate<User> p = User-> User.userName.equals("Raviraj") && User.password.equals("java");
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter User Name");
       final String userName = sc.next();
       System.out.println("Enter password");
       final String password = sc.next();
        User user2 = new User(userName, password);
        if(p.test(user2)){
            System.out.println(user2.userName+" are allowed  to use all service");
        }
        else
        System.out.println("you are not Authorize please try again");
    }
}