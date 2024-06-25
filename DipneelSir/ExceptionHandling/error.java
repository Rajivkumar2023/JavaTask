/*Exception Handling */

class error {
    public static void main(String[] args) {
        int x = 10, p;
        try{
            p = x/5; /*if have error then then print catch block and if not have error then print out of try & catch block*/
        }
        catch(Exception e){
            System.out.println("A number can't be divid by 0");
        }
        System.out.println("out of the try-catch block.");
    }
}
