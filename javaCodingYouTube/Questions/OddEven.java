        /* Odd Even Progarm */

import java.util.Scanner;
public class OddEven {
    public static void main(String[] args){
        int n;
        System.out.print("Enter any number : ");
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        if(n%2==0){
        System.out.println("Even number ");
        }else{
            System.out.println("Odd Number");
        }
    }
}
