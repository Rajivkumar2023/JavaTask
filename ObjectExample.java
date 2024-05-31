class Student {
    int rollno;
    int marks;
    char grade;

    void rolldisplay() {
        System.out.println("Roll no = " + rollno);
    }

    void marksdisplay() {
        System.out.println("Marks = " + marks);
    }

    void gradedisplay() {
        System.out.println("Grade = " + grade);
    }
}

class ObjectExample {
    public static void main(String[] args) {
        Student s1 = new Student(); // <classname> = new <classname>();
        s1.rollno = 25;
        s1.marks = 92;
        s1.grade = 'E'; // Ensure 'E' is your intended grade value

        s1.rolldisplay();
        s1.marksdisplay();
        s1.gradedisplay();
    }
}
