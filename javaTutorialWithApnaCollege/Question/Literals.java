public class LiteralExamples {
    public static void main(String[] args) {
        // Integer Literals
        int decimal = 123;
        int binary = 0b1010;
        int octal = 017;
        int hexadecimal = 0x1A;

        // Floating-Point Literals
        double piDouble = 3.14159;
        float piFloat = 3.14159F;

        // Character Literals
        char letter = 'A';
        char unicodeChar = '\u0041'; // Unicode for 'A'

        // String Literal
        String greeting = "Hello, World!";

        // Boolean Literals
        boolean isTrue = true;
        boolean isFalse = false;

        // Null Literal
        String str = null;

        // Underscores in Numeric Literals
        int million = 1_000_000;
        double d = 3.14_159_265;

        // Printing values
        System.out.println("Decimal: " + decimal);
        System.out.println("Binary: " + binary);
        System.out.println("Octal: " + octal);
        System.out.println("Hexadecimal: " + hexadecimal);
        System.out.println("Double: " + piDouble);
        System.out.println("Float: " + piFloat);
        System.out.println("Character: " + letter);
        System.out.println("Unicode Character: " + unicodeChar);
        System.out.println("String: " + greeting);
        System.out.println("Boolean (true): " + isTrue);
        System.out.println("Boolean (false): " + isFalse);
        System.out.println("Null String: " + str);
        System.out.println("Million with underscores: " + million);
        System.out.println("Double with underscores: " + d);
    }
}
