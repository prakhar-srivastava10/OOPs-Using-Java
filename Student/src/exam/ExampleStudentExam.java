package exam;
import student.Student;

// Testing scope of access modifiers in a subclass in different package
import student.Student;

public class ExampleStudentExam extends Student{
    public static void main(String[] args) {
        Student s1 = new Student("Prakhar", 173, "CSE(AI)", 'C');
        System.out.println(s1.name); // Public
        System.out.println(s1.branch); // Protected
        System.out.println(s1.rollNo); // Private
        System.out.println(s1.section); // Default

        ExampleStudentExam obj = new ExampleStudentExam();
        obj.branch = "AI";
        System.out.println(obj.branch);
    }
}