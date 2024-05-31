public class LearnConstructor {
    public static void main(String[] args) {
        Complex num1 = new Complex();
        Complex num2 = new Complex();
        num1.print();
        num2.print();

    }
    
}

class Complex {
    int a , b;

    public Complex(){
        a = 3;
        b = 4;
    }

    void print(){
        System.err.println(a + " + " + b + "i");
    }
}