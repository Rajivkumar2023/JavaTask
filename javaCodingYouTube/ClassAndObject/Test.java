/* Class And Objects */

class Demo{
    int a = 24; String b="Rajiv kumar";

    void Show(){
        System.out.println(b + " " + "Age: " + a);
    }
}
class Test{
    public static void main(String args[]){
        Demo r = new Demo();
        r.Show();
    }
}