class Overload {
    int add(int a, int b) {
        return a + b;
    }

    float add(float a, float b) {
        return a + b;
    }

    String add(String a, String b) {
        return a + b;
    }
}

class OverloadTest {
    public static void main(String[] args) {
        int a = 10, b = 20;
        float c = 25.63f, d = 87.10f;
        String g = "JAVA", h = "CLASS";
        Overload ovd = new Overload();

        System.out.println("Integer version: a + b = " + ovd.add(a, b));
        System.out.println("Float version: c + d = " + ovd.add(c, d));
        System.out.println("String version: g + h = " + ovd.add(g, h));
    }
}
