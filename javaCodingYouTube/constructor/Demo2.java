class demo {
    int age; String name;
    // demo(){
    //     name = "Rajiv kumar"; age = 24;
    // }
    void show(){
        System.out.print("name: "+name+ " , "+ "Age: "+ age);
    }
}
class Demo2{
    public static void main(String[] args){
        demo ref = new demo();
        ref.show();
    }
}