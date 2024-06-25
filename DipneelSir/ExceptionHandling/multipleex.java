/*Multiple Exception Handling */


class exceptiondemo1 {
    String name = "Rajiv kumar";
    void showname(){
        System.out.println("Name is : "+ name);
    }
}
class multipleex{
    public static void main(String[] args) {
        try {
            int a=4, b=2,c;
            c=a/b;
            System.out.println("c= "+c);
            exceptiondemo1 obj = null;
            obj.showname();
        } 
        catch (ArithmeticException ae) {
            System.out.println("Denominator can't be ZERO.");
        }
        catch (NullPointerException ne) {
            System.out.println("Null reference has been used.");
        }
        catch(Exception e){
            System.out.println("Unexpected error.");
        }
    }
}
