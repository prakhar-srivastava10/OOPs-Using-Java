package student;

public class TestStudent{
    public static void main(String[] args) {
        Student s1 = new Student("PrS", 10, "AI", 'C');
        s1.display();
        
        System.out.println("-------------------");

        RegularStudent rs1 = new RegularStudent("Prakhar", 11, "CSE(AI)", 'C', 80, "H-506");
        rs1.display();
        rs1.payFee();

        System.out.println("-------------------");

        OnlineStudent os1 = new OnlineStudent("Sri", 9, "Artificial Intelligence", 'B', "Meet");
        os1.display();
        os1.payFee();

        System.out.println("-------------------");

        HostelStudent hs1 = new HostelStudent("Hosteller", 1, "AIML", 'A', 95, "H-306", "109");
        hs1.display();
        hs1.payFee();

        System.out.println("-------------------");

        s1.search(10);
        s1.search(11, "Name1");
        s1.search("Name2", "AI");
        s1.search("AI", 'C');
        
    }
    
}
