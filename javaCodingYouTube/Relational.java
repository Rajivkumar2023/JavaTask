        /*Relational Operator Example....  */
import java.util.*;
public class Relational {
    public static void main(String args[]){
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter First number: ");
        int a = obj.nextInt();
        System.out.println("Enter second number: ");
        int b = obj.nextInt();
        System.out.println("All Relational operator Results: - ");
        System.out.println("Greater Than: "+ (a<b));
        System.out.println("Lesser Than: "+ (a<b));
        System.out.println("Equal to : "+ (a==b));
        System.out.println("Greater Than Equal to: "+ (a<=b));
        System.out.println("Lesser than Equal to : "+ (a>=b));
        System.out.println("Not Equal to : "+ (a!=b));

    }
    
}
