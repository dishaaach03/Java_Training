// Define an interface IVehicle
interface IVehicle {
    void start();
    void travel();
    void stop();
}

// Implement the IVehicle interface in Bike class
class Bike implements IVehicle {
    @Override
    public void start() {
        System.out.println("Bike is starting...");
    }

    @Override
    public void travel() {
        System.out.println("Bike is traveling...");
    }

    @Override
    public void stop() {
        System.out.println("Bike has stopped.");
    }
}

// Implement the IVehicle interface in Car class
class Car implements IVehicle {
    @Override
    public void start() {
        System.out.println("Car is starting...");
    }

    @Override
    public void travel() {
        System.out.println("Car is traveling...");
    }

    @Override
    public void stop() {
        System.out.println("Car has stopped.");
    }
}

// RapidoApp class to handle vehicle requests
class RapidoApp {
    public IVehicle rentVehicle(String vehicleType) {
        if (vehicleType.equalsIgnoreCase("Bike")) {
            return new Bike();
        } else if (vehicleType.equalsIgnoreCase("Car")) {
            return new Car();
        } else {
            System.out.println("Invalid vehicle type requested.");
            return null;
        }
    }
}

// Main class
public class DAY7_Q3 {
    public static void main(String[] args) {
        RapidoApp rapido = new RapidoApp();

        // Request a Bike
        IVehicle myVehicle = rapido.rentVehicle("Bike");
        if (myVehicle != null) {
            myVehicle.start();
            myVehicle.travel();
            myVehicle.stop();
        }

        System.out.println("----------------------");

        // Request a Car
        myVehicle = rapido.rentVehicle("Car");
        if (myVehicle != null) {
            myVehicle.start();
            myVehicle.travel();
            myVehicle.stop();
        }
    }
}
