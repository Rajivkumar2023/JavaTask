//Command line Arguments

public class Class6 {
    public static void main(String[] args) {
        int x,y,r,z;
            x = Integer.parseInt (args[0]);
            y = Integer.parseInt (args[1]);
            r =  Integer.parseInt(args[2]);
            z = x + y * r;
        System.err.println(args[0] + " " + args[2]);
    }
    
}
