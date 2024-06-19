                ///Arithmetic Operator Example...
import java.util.*;
public class Arithmetic {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter First number: ");
        int a = obj.nextInt();
        System.out.print("Eneter Second Number: ");
        int b = obj.nextInt();
        System.out.println("All Operation Results :- ");
        System.out.println("Addition:  "+ (a+b));
        System.out.println("Substraction: "+(a-b));
        System.out.println("Multiplication: "+(a*b));
        System.out.println("Division: "+(a/b));
        System.out.println("Reminder: "+(a%b));

    }
}
