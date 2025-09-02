package encapsulation;

public class Test {
    public static void main(String[] args) {
        Library l1 = new Library();

        l1.borrowBook(); // 1 book borrowed
        l1.borrowBook(); // 2 books borrowed
        l1.borrowBook(); // 3 books borrowed
        l1.borrowBook(); // 4 books borrowed
        l1.borrowBook(); // 5 books borrowed
        l1.borrowBook(); // Can't borrow more
        l1.borrowBook(); // Can't borrow more books

        l1.returnBook(); // Returned 1 book. Remaining = 4
        l1.returnBook(); // Returned 2 books. Remaining = 3
        l1.returnBook(); // Returned 3 books. Remaining = 2
        l1.returnBook(); // Returned 4 books. Remaining = 1
        l1.returnBook(); // Returned all 5 books. Remaining = 0
        l1.returnBook(); // No more books can be returned
        l1.returnBook(); // No more books can be returned
    
        
    }
    
}
