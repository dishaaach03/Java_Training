// StandardCustomer class
class StandardCustomer {
    int id;
    String name, city;

    public StandardCustomer(int id, String name, String city) {
        this.id = id;
        this.name = name;
        this.city = city;
    }
}

// PremiumCustomer class
class PremiumCustomer {
    int id;
    String name, email, city;

    public PremiumCustomer(int id, String name, String email, String city) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.city = city;
    }
}

// PlatinumCustomer class
class PlatinumCustomer {
    int id;
    String name, email, phone, city;

    public PlatinumCustomer(int id, String name, String email, String phone, String city) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.city = city;
    }
}

// CallCenter class with overloaded handleCall methods
class CallCenter {
    public void handleCall(StandardCustomer sc, String issue) {
        System.out.println("Handling call for Standard Customer " + sc.name + " from " + sc.city);
        System.out.println("Issue: " + issue);
        System.out.println("Call duration: 5 minutes\n");
    }

    public void handleCall(PremiumCustomer pc, String issue) {
        System.out.println("Handling call for Premium Customer " + pc.name + " from " + pc.city);
        System.out.println("Issue: " + issue);
        System.out.println("Call duration: 10 minutes\n");
    }

    public void handleCall(PlatinumCustomer plc, String issue) {
        System.out.println("Handling call for Platinum Customer " + plc.name + " from " + plc.city);
        System.out.println("Issue: " + issue);
        System.out.println("Call duration: 15 minutes\n");
    }
}

// Main class
public class DAY7_Q4 {
    public static void main(String[] args) {
        // Creating customer objects
        StandardCustomer sc = new StandardCustomer(101, "Alice", "New York");
        PremiumCustomer pc = new PremiumCustomer(102, "Bob", "bob@example.com", "Los Angeles");
        PlatinumCustomer plc = new PlatinumCustomer(103, "Charlie", "charlie@example.com", "1234567890", "Chicago");

        // Creating CallCenter object
        CallCenter callCenter = new CallCenter();

        // Invoking handleCall methods
        callCenter.handleCall(sc, "Internet not working.");
        callCenter.handleCall(pc, "Billing issue.");
        callCenter.handleCall(plc, "Technical support required.");
    }
}
