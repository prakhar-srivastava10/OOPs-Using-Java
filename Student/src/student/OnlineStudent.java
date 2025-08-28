package student;

public class OnlineStudent extends Student{
    String platform;

    public OnlineStudent(String name, int rollNo, String branch, char section, String platform) {
        super(name, rollNo, branch, section);
        this.platform = platform;
    }

    public void payFee(){
        super.payFee();
        System.out.println("The online student "+super.name+" has also paid the platform fee");
    }

    public void display(){
        super.display();
        System.out.println("The branch of the student is "+super.branch);
        System.out.println("The attendance percentage of the student is "+this.platform);
    }
    
}
