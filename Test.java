import java.util.InputMismatchException;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {


        int div = 0;
        boolean validInput;
        do{
            validInput = true;
            try {
                System.out.print( "Enter a number: ");
                int a = (new Scanner(System.in)).nextInt();

                System.out.print("Enter another number: ");
                int b = (new Scanner(System.in)).nextInt();

                div = a / b;
            } catch (ArithmeticException ae) {
                System.out.println( "Exeption Generated"+ae.getMessage());
            } catch (InputMismatchException ime) {
                System.out.println("Invlaid input");
            }
        }while (!validInput);


        System.out.println("Result: "+div);
    }
}
