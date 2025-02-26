/*Problem statement:-
improvment
------Hotel ASHOKA----
enter dish codes:
        1. Idly (1.75)
2
        2. Dosa (2.00)
4
        3. Poori (2.25)
1
        4. Wada (3.00)
Howmany dosa : 10
Howmany Wada: 4
Howmany Idly: 5
Select the dish code: 3
Total amount: XXXX
Howmany plates you want: 4
Pls pay the amount: 9.00
        ---Thanks Visit Again---*/

import java.util.*;

import java.util.Scanner;

public class DAY1_Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] dishes = {"Idly", "Dosa", "Poori", "Wada"};
        double[] prices = {1.75, 2.00, 2.25, 3.00};
        int[] quantities = new int[dishes.length];

        System.out.println("------ Hotel ASHOKA ------");
        System.out.println("Menu:");
        for (int i = 0; i < dishes.length; i++) {
            System.out.printf("%d. %s (₹%.2f)\n", i + 1, dishes[i], prices[i]);
        }

        System.out.println("\nEnter dish codes one by one (Press 0 to finish selection): ");
        while (true) {
            int dishCode = sc.nextInt();
            if (dishCode == 0) break;
            if (dishCode < 1 || dishCode > 4) {
                System.out.println("❌ Invalid dish code! Try again.");
                continue;
            }
            System.out.printf("How many %s: ", dishes[dishCode - 1]);
            quantities[dishCode - 1] += sc.nextInt();
        }

        double totalAmount = 0;
        System.out.println("\n📝 Your Order Summary:");
        for (int i = 0; i < dishes.length; i++) {
            if (quantities[i] > 0) {
                double itemTotal = prices[i] * quantities[i];
                System.out.printf("%s x %d = ₹%.2f\n", dishes[i], quantities[i], itemTotal);
                totalAmount += itemTotal;
            }
        }
        System.out.printf("💰 Total amount: ₹%.2f\n", totalAmount);

        System.out.print("\nDo you want to add more plates? Enter dish code (0 to finish): ");
        while (true) {
            int dishCode = sc.nextInt();
            if (dishCode == 0) break;
            if (dishCode < 1 || dishCode > 4) {
                System.out.println("❌ Invalid dish code! Try again.");
                continue;
            }
            System.out.printf("How many more %s: ", dishes[dishCode - 1]);
            int extraQty = sc.nextInt();
            quantities[dishCode - 1] += extraQty;
            totalAmount += prices[dishCode - 1] * extraQty;
            System.out.printf("🔄 Updated total: ₹%.2f\n", totalAmount);
        }

        System.out.printf("\n💵 Pls pay the amount: ₹%.2f\n", totalAmount);
        System.out.println("--- 🙏 Thanks, Visit Again! ---");

        sc.close();
    }
}
