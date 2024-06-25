/* A constructor which does does not have any parameter is
 called default constructor. */

 class A{
    int Age; String name; boolean right;
    // A(){
    //     Age = 24; name = "Rajiv kumar"; right= true;
    // }
    void Disp(){
        System.err.println("Age: " + Age + ", " + name + " , " + "Male: " + right);
    }
 }
 class B{
    public static void main(String[] args) {
        A r = new A();
        r.Disp();
    }
 }  