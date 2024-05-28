import java.util.*;

public class UserInput{  
	public static void main (String[] args) { 
	///// User input a String

	//System.out.print("Enter a String ");
	//Scanner sc= new Scanner(System.in);
	//String name = sc.nextLine();  //nextLine(),nextInt(), nextFloat()
	//System.out.println("You entered String : " + name);


	////User input a Interger

	System.out.print("Enter a interger ");
	Scanner sc = new Scanner(System.in);
	int intValue = sc.nextInt();
	int intValue2 = sc.nextInt();
	System.out.print("Enter your Second interger ");
	int sum = intValue + intValue2;
	System.out.println("your entered integer : " + sum);

}


}