import java.util.*;

public class SwitchCondition{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int button = sc.nextInt();
	switch(button) {
	case 1 : System.out.println("Jay Shree Ram");
	break;
	case 2 : System.out.println("Hello java");
	break;
	case 3: System.out.println("Namaste java");
	break;
	default : System.out.println("invalid number");
	}

	//// If else condition (we can write like that also)
	//if (button == 1){System.out.println("Jay Shree Ram");}
	//else if(button == 2) {System.out.println("Hello Java");}
	//else if(button == 3) {System.out.println("Namaste java");}
	//else{System.out.println("invalid number");}
}

}