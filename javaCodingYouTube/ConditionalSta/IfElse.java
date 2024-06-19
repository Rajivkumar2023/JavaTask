
import java.util.Scanner;

/* Simple if Statments */
public class IfElse {
    public static void main(String[] args){
        int age;
        System.out.println("Enter your age.. ");
        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();
        if (age>=18){
            System.out.println("you are eligible for vote");
        }else{
            System.out.println("You are not eligible for vote");
        }
    }
}
