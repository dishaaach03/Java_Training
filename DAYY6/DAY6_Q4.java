import java.util.ArrayList;

public class DAY6_Q4 {
    private ArrayList<String> itemNames;
    private ArrayList<Double> itemPrices;

    // Constructor
    public DAY6_Q4() {
        this.itemNames = new ArrayList<>();
        this.itemPrices = new ArrayList<>();
    }

    // Method to add an item to the cart
    public void addItem(String itemName, double itemPrice) {
        itemNames.add(itemName);
        itemPrices.add(itemPrice);
        System.out.println(itemName + " added to cart.");
    }

    // Method to calculate the total price
    public double calculateTotalPrice() {
        double total = 0;
        for (double price : itemPrices) {
            total += price;
        }
        return total;
    }

    // Method to display the cart items
    public void displayCart() {
        System.out.println("Shopping Cart Items:");
        for (int i = 0; i < itemNames.size(); i++) {
            System.out.println(itemNames.get(i) + " - $" + itemPrices.get(i));
        }
    }

    public static void main(String[] args) {
        DAY6_Q4 cart = new DAY6_Q4();
        cart.addItem("Laptop", 1200.0);
        cart.addItem("Headphones", 150.0);
        System.out.println("Total Price: $" + cart.calculateTotalPrice());
        cart.displayCart();
    }
}
