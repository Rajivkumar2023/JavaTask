////WhileLoop:- 
	////Syntax:- while(condition){ do something}

///Exapmle:- 
/*public class WhileLoop{
public static void main(String[] args){
	 int i = 0;
	while( i < 11 ){
	System.out.println(i);
	 i++;  }

}}*/

////Qs. Print the sum of First n= 5 Natural Numbers.

/*import java.util.*;
public class WhileLoop{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter you number: ");
		int n = sc.nextInt();
		int sum = 0;
		for (int i=0; i<=n; i++){
			sum += i;
		}
		System.out.println( "The number of sum of 0 to " + n + " is " + sum);
	}
}*/




/////Qs. Print the table of a number input by the user.
import java.util.Scanner;
public class WhileLoop{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your talble Number: ");
		int n = sc.nextInt();
		System.out.println("your "+ n + 
		" table is Here ");
		for (int i=1; i<11; i++){
			System.out.println(i* n);
		}

	}
}

