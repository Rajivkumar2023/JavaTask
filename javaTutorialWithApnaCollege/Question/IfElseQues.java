//Question 1. : - Make a Calculator. Take 2 numbers (a & b ) from the user and an operation as follows: 
	//1: + ( Addition) a + b
	//2: - (subtraction) a- b
	//3: * (Multiplication) a * b
	//4: / (Division) a / b
	//5: % (Modulo or remainder) a % b

	//Calculate the result according to the operation given and display it to the user.
////Solution:- 
import java.util.*;
	public class IfElseQues{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.print(" Enter your first Number: ");
	int a = sc.nextInt();
	System.out.print(" Enter your Second Number: ");
	int b = sc.nextInt();
	System.out.println( a + b);
	System.out.println( a - b);
	System.out.println( a * b);
	System.out.println( a / b);
	System.out.println( a % b);
}}


/*Question 2. - Ask the user to enter the number of the month & print the name of the month. For eg - For  '1' print 'January', '2' print 'February' & so on.*/

/* import java.util.*;
	public class IfElseQues{
	public static void main(String[] args){
	System.out.print( "Enter No of Month :  ");
	Scanner sc = new Scanner(System.in);
	int button = sc.nextInt();
	
	switch(button){
		case 1 : System.out.println("January");
		break;
		case 2 : System.out.println(" February");
		break;	
		case 3 : System.out.println("March");
		break;		
		case 4 : System.out.println("April");	
		break;
		case 5 : System.out.println("May");
		break;
		case 6 : System.out.println(" June");
		break;	
		case 7 : System.out.println("July");
		break;		
		case 8 : System.out.println("August");	
		break;
		case 9 : System.out.println("September");
		break;
		case 10 : System.out.println(" October");
		break;	
		case 11 : System.out.println("November");
		break;		
		case 12: System.out.println("December");	
		break;
		default: System.out.println("Invalid number");}


}}*/

