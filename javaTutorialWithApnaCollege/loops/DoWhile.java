// do{ do something} while(condtion); 
/*public class DoWhile{
public static void main(String[] args){
	int i = 0;
	do{
	System.out.println(i);
	i++;
	}while( i < 11 ); 
}}*/


///Note:- In do while loop one statement will defenetly print
///Example:- 
/*public class DoWhile{
public static void main(String[] args){
	int i = 12;
	do{
	System.out.println("Rajiv kumar");
	}while( i < 11);
	
}}*/


///Qs. Print the Sum of First n Natural Numbers.
import java.util.*;
public class DoWhile{
public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int sum = 0;
	for(int i = 1; i <= n; i++){
	sum = sum + i;
	}
	System.out.println(sum);
}
}
