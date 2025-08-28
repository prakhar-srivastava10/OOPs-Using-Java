package student;

public class Student {
    public String name;
    public int rollNo;
    public String branch;
    public char section;
    static String collegeName = "KIET";

    public Student(String name, int rollNo, String branch, char section) {
        this.name = name;
        this.rollNo = rollNo;
        this.branch = branch;
        this.section = section;
    }
    
    public Student() {
        this.name = "Default Name";
        this.rollNo = 000;
        this.branch = "Applied Science";
        this.section = 'O';
    }

    // Copy Constructor - Copies the same values from another instance
    public Student(Student object) {
        this.name = object.name;
        this.rollNo = object.rollNo;
        this.branch = object.branch;
        this.section = object.section;
    }


    public void studying(int hours){
        System.out.println("The student studies for "+hours+" hours");
    }

    public void playing(String sports){
        System.out.println("The student plays "+sports);
    }

    public void display(){
        System.out.println("The name of the student is "+name);
    }

    public void payFee(){
        System.out.println("The student "+this.name+" has paid the tution fee");
    }

    public void search(int rollNo){
        System.out.println("Searching student by roll no. "+rollNo);
    }
    public void search(int rollNo, String name){
        System.out.println("Searching student by roll no. "+rollNo+ " and name "+name);
    }
    public void search(String name, String branch){
        System.out.println("Searching student by name "+name+" and branch "+branch);
    }
    public void search(String branch, char section){
        System.out.println("Searching student by branch "+branch+" and section "+section);
    }
}