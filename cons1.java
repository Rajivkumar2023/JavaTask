//////constructor :- constructor name havaing always same to class name 


public class cons1 {
    cons1(int x){
        System.out.println("Inside constructor.");
        System.out.println("The value passed is : " + x);
    }
    public static void main(String[] args) {
        cons1 obj = new cons1(34);

    }
}
