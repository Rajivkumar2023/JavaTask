public class error1 {
    public static void main(String[] args) {
        int n = 20, no;
        try{
            no = n/5;  // exception raised
        }
        catch(Exception e){
            System.out.println("A number be divided by 0.");
        }
        System.out.println("out of the try catch block.");
    }

    
}
