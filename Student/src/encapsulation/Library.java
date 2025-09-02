package encapsulation;

public class Library {
    final private int MAX_BORROW = 5;
    private int borrowedBooks=0;

    public void borrowBook(){
        if(borrowedBooks<MAX_BORROW){
            borrowedBooks++;
            System.out.println("Number of books borrowed = "+borrowedBooks);
        }else{
            System.out.println("No more books can be borrowed");
        }
    }

    public void returnBook(){
        if(borrowedBooks>0){
            borrowedBooks--;
            System.out.println("Number of books remaining to be returned = "+borrowedBooks);
        }else{
            System.out.println("All books are returned");
        }
    }

    public int getBorrowedBooks() {
        return borrowedBooks;
    }

    
}
