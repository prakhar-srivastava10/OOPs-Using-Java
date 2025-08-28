package student;

public class HostelStudent extends RegularStudent{
    String room;

    public HostelStudent(String name, int rollNo, String branch, char section, int attendancePercentage,
            String classroom, String room) {
        super(name, rollNo, branch, section, attendancePercentage, classroom);
        this.room = room;
    }

    public void payFee(){
        super.payFee();
        System.out.println("The hostel student "+super.name+" has also paid the hostel fee");
    }

    public void display(){
        super.display();
        System.out.println("The hostel of the student is "+this.room);
    }

}
