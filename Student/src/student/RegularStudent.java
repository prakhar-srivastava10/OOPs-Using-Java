package student;

public class RegularStudent extends Student{
    int attendancePercentage;
    String classroom;

    public RegularStudent(String name, int rollNo, String branch, char section, int attendancePercentage,
            String classroom) {
        super(name, rollNo, branch, section);
        this.attendancePercentage = attendancePercentage;
        this.classroom = classroom;
    }

    public void submitAssignment(){
        System.out.println("The student "+super.name+" has submitted the assignment");
    }

    public void payFee(){
        super.payFee();
        System.out.println("The regular student "+super.name+" has also paid the lab fee and exam fee");
    }

    public void display(){
        super.display();
        System.out.println("The branch of the student is "+super.branch);
        System.out.println("The attendance percentage of the student is "+this.attendancePercentage);
        System.out.println("The classroom of the student is "+this.classroom);
    }
    
}
