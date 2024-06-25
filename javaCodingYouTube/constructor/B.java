/* constructor example */

class A{
    int a; String name;
    A(){
        a=24; name = "Rajiv kumar";
    }
    void show()
    {
        System.out.print(a+ " " +name);
    }
}
class B 
{
    public static void main(String[] args){
        A ref= new A();
        ref.show();
    }
}