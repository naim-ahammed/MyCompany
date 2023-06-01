import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.print( "Enter a number: ");
        int a = (new Scanner(System.in)).nextInt();

            System.out.print("Enter another number: ");
            int b = (new Scanner(System.in)).nextInt();

            int div = 0;

            try {

                div = a / b;

            } catch (ArithmeticException ae) {
                System.out.println( "Exeption Generated");
            } catch (Exception e) {

            System.out.println("Exeption Generated");

        }
            System.out.println("Result: "+div);
        }
    }
