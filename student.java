public class student {
  public int rollno;
  private int marks;
  public char grade;

  public int marksdisplay(int p, int x) {
    marks = p; // marks = 75
    System.out.println("The marks sent is : " + marks);
    int num;
    num = x + marks;
    return num;
  }
}

class stumain {
  public static void main(String args[]) {
    student st = new student();
    int n;
    st.rollno = 12;
    // st.marks = 75; // error
    st.grade = 'A';
    n = st.marksdisplay(75, 11);
    System.out.println("Total marks is : " + n);
  }
}