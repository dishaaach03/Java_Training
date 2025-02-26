/*Problem statement:-
        -> develop an application for a company called Ford and it wants to produces bikes for its distributors and based on the request from distributors for N bikes, you need to generate N bike objects and return to distributor.
create a Bike class with properties:: plateNo, brand, type, price, owner.
add the required static and non-static variables in the class
add the static and non-static blocks and constructors in the class.
add an operational method that can generate N Bike objects and return as an array, on the requested no.of bikes.
points to consider:-
brand is same for all bikes [i.e. FORD]
There should be two bike types [gear, auto]
a) gear bike price 86000.25
b) auto bike price 120000.50*/

import java.util.Scanner;

class Bike {
    private static final String BRAND = "FORD";
    private static int counter = 1000;

    private String plateNo;
    private String type;
    private double price;
    private String owner;

    static {
        System.out.println("Welcome to Ford Bike Manufacturing System!");
    }

    {
        plateNo = "FORD-" + (++counter);
    }

    public Bike(String type, String owner) {
        this.type = type;
        this.owner = owner;
        this.price = (type.equalsIgnoreCase("gear")) ? 86000.25 : 120000.50;
    }

    public void displayDetails() {
        System.out.println("Plate No: " + plateNo);
        System.out.println("Brand: " + BRAND);
        System.out.println("Type: " + type);
        System.out.println("Price: ₹" + price);
        System.out.println("Owner: " + owner);
        System.out.println("-------------------------------");
    }

    public static Bike[] generateBikes(int n, Scanner sc) {
        Bike[] bikes = new Bike[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter owner name for bike " + (i + 1) + ": ");
            String owner = sc.next();
            System.out.print("Enter bike type (gear/auto) for " + owner + ": ");
            String type = sc.next();

            if (!type.equalsIgnoreCase("gear") && !type.equalsIgnoreCase("auto")) {
                System.out.println("Invalid type! Defaulting to 'gear'.");
                type = "gear";
            }

            bikes[i] = new Bike(type, owner);
        }
        return bikes;
    }
}

public class DAY3_Q2
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of bikes required: ");
        int n = sc.nextInt();

        Bike[] bikes = Bike.generateBikes(n, sc);

        System.out.println("\n--- Bike Details ---");
        for (Bike bike : bikes) {
            bike.displayDetails();
        }

        sc.close();
    }
}

