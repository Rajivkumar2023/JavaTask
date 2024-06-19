class A {
    private int value; // data hiding

    public void setValue(int x) { // data abstraction
        value = x;
    }

    public int getValue() {
        return value;
    }
}

class B {
    public static void main(String[] args) {
        A r = new A();
        r.setValue(100);
        System.out.println(r.getValue()); // Use println instead of print for better readability
    }
  }
