import java.util.*;

public class DAY8_Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter a number:");
            int x = sc.nextInt();

            System.out.println("Enter another number:");
            int y = sc.nextInt();

            int z = x / y;
            System.out.println("Division result: " + z);
        }
        catch (ArithmeticException ae) {
            System.out.println("Exception handled: " + ae.getMessage());
        }
        finally {
            sc.close();
        }
    }
}
