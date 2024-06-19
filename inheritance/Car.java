package inheritance;
public class Car extends Vehicle{
    // void start(){
    //     System.out.println("Car is running");
    // }
    public static void main(String[] args) {
        Car obj = new Car();
        obj.wheelsCount = 5;
        obj.model = "Ferari";
        obj.start();
    }
}