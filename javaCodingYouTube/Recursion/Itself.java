// package Recursion;
                /* Recursion in java */
import java.util.*;
public class Itself {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a = sc.nextInt();
        Itself r = new Itself();
        int b = r.sum(a); //calling
        System.out.println("Sum first N naturnal Number: " + b);
    }
    int sum(int b){
        if(b>0){
            return b+sum(b-1); //calling
        }else{
            return 0;
        }
    } 
}
