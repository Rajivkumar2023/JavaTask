////create interface

interface intexample{
    int add(int a, int b);
}
//implementing interfaces
class intclass1 implements intexample{
    public int add(int a, int b){
        return(a+b);
    }
    public static void main(String args[]){
        intclass1 t = new intclass1();
        System.out.println("Sum : " + t.add(8,7));
    }
}
