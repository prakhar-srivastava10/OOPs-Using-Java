package exception;

public class ExceptionDemo {
    public static void main(String[] args) {
        System.out.println("1");
        try{
            int a=5, b=0;
            System.out.println("2");
            int c=a/b;
            System.out.println("3"); // These lines will not be printed.
            System.out.println("4"); // As soon as the exception occurs in try block, it will move to the catch (handler) block
        }
        catch(ArithmeticException e){
            System.out.println("Exception was handled");
        }
        finally{
            System.out.println("5");
            System.out.println("6");
        }
        
    }
}
