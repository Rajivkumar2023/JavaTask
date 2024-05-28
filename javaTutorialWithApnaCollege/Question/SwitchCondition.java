//Conditional Statements ‘switch’
//Switch case statements are a substitute for long if statements that compare a
//variable to multiple values. After a match is found, it executes the
//corresponding code of that value case.


// The following example is to print days of the week.


///solution:-

import java.util.*;
	public class SwitchCondition{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
switch(n) {
	case 1 : System.out.println("monday");
	break;
	case 2 : System.out.println("Tuesday");
	break;
	case 3 : System.out.println("Wednesday");
	break;
	case 4 : System.out.println("Thrusday");
	break;
	case 5 : System.out.println("Friday");
	break;
	case 6 : System.out.println("Saturday");
	break;
	default : System.out.println("Sunday");
}

///System.out.println(n);



}}
