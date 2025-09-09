package exception;

public class ExceptionDemo {
    public static void main(String[] args) {
        System.out.println("1");
        try{
            int a=5, b=0;
            System.out.println("2");
            int c=a/b;
            System.out.println("3");
            System.out.println("4");
        }
        catch(ArithmeticException e){
            System.out.println("Exception was handled");
        }
        System.out.println("5");
        System.out.println("6");
    }
}
