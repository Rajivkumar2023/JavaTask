public class LearnConstructor {
    public static void main(String[] args) {
        // Complex num1 = new Complex(1, 5);
        // Complex num2 = new Complex( 5, 2);
        Complex num3 = new Complex( );
        num3.print();

    }
    
}

class Complex {
    int a , b;

    // public Complex(int real, int imagenary){
    //     a = real;
    //     b = imagenary;
    // }

    void print(){
        System.out.println(a + " + " + b + "i");
    }
}