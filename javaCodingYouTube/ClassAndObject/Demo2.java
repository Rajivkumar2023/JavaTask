class ex{
    String name="Rajiv kumar"; int age = 24;
    void show(){
        System.out.print("Name: "+ name + ", "+ "Age: "+ age);
    }
}
class Demo2{
    public static void main(String[] args){
        ex info = new ex();
        info.show();
    }
}