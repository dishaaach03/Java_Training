/*Problem statement:-
        ------Hotel ASHOKA----
        1. Idly (1.75)
2. Dosa (2.00)
3. Poori (2.25)
4. Wada (3.00)
Select the dish code: 3
Howmany plates you want: 4
Pls pay the amount: 9.00
        ---Thanks Visit Again---|*/
import java.util.Scanner;

public class DAY1_Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Menu details
        String[] dishes = {"Idly", "Dosa", "Poori", "Wada"};
        double[] prices = {1.75, 2.00, 2.25, 3.00};

        // Display menu
        System.out.println("------ Hotel ASHOKA ------");
        for (int i = 0; i < dishes.length; i++) {
            System.out.printf("%d. %s (%.2f)\n", i + 1, dishes[i], prices[i]);
        }

        // Take user input
        System.out.print("Select the dish code: ");
        int dishCode = sc.nextInt();

        // Validate dish code
        if (dishCode < 1 || dishCode > 4) {
            System.out.println("Invalid dish code! Please select between 1-4.");
            return;
        }

        System.out.print("How many plates you want: ");
        int quantity = sc.nextInt();

        // Calculate total amount
        double totalAmount = prices[dishCode - 1] * quantity;

        // Display bill
        System.out.printf("Please pay the amount: %.2f\n", totalAmount);
        System.out.println("--- Thanks, Visit Again! ---");

        sc.close();
    }
}
