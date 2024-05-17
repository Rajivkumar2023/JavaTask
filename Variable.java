public class Variable {
    public static void main(String[] args) {
        ///varables
        String name = "Rajiv Rathod's ";
        String friend = " Friend = Amit kumar - age =";
        int age = 24;
        System.out.println( name + " " + friend + " " + age);

        ///primitive types
        
        int phone = 1234567890;
        long Phone2 = 1234567890000L;
        float pi = 3.14F;
        char letter = 'a';
        boolean isTrue = false;
        System.out.println( phone + " " + Phone2 + " " + pi + " " + letter + " " + isTrue);

        ///Non-primitive types
        //Length
        String name2 = "Rajiv";
        System.out.println(name2.length());
        //Concatenate
        String name3 = "Kumar";
        System.out.println(name2 + " and " + name3);
        //charAt
        String name4 = "Rajiv";
        System.out.println(name4.charAt(2));
        //replace
        String name5 = "Rajiv";
        String name6 = name5.replace('R' , 'P');
        System.out.println(name6);
        System.out.println(name5); ///In java string is immutable, it can't be changed.
        //Substring
        String name7 = "Raju and Rathod";
        System.out.println(name7.substring(0, 4 ));

        
    }
}
