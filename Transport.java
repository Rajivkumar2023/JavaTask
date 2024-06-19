/* Annotation */
public class Transport {
    void display() {
        System.out.println("Inside display method.");
    }
}

class AnnotDemo extends Transport {
    @Override
    void display() {
        System.out.println("Inside child class method.");
    }

    public static void main(String[] args) {
        AnnotDemo c1 = new AnnotDemo();
        c1.display();
    }
}
