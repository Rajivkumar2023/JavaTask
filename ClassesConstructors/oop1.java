

public class oop1 {
    public static void main(String[] args) {
        Greet obj = new Greet();
        obj.greeting();
        obj.greeting("Rajiv");
        obj.greeting(24);
        obj.greeting("RajivRathod",5);
        
    }}

    //method overloading (Means :-we can take in same classes and with different parameters)
    class Greet{
        void greeting(){
                System.out.println("Hey buddy good morning");
        }
        void greeting(String name){
            System.out.println("Hello "+name+", Good morning");
        }
        void greeting(String name, int count){
            for(int i= 0; i<count; i++){
            System.err.println("Hello " +name+" Very Good Morning");}
        }
        void greeting(int age){
            System.out.println("And your age is " + age);
        }

    }


