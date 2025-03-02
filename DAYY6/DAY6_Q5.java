import java.util.ArrayList;

public class DAY6_Q5 {
    private String name;
    private int age;
    private ArrayList<String> medicalHistory;

    // Constructor
    public DAY6_Q5(String name, int age) {
        this.name = name;
        this.age = age;
        this.medicalHistory = new ArrayList<>();
    }

    // Method to update medical history
    public void updateMedicalHistory(String record) {
        medicalHistory.add(record);
        System.out.println("Medical history updated.");
    }

    // Method to display patient information
    public void displayPatientInfo() {
        System.out.println("Patient Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Medical History:");
        for (String record : medicalHistory) {
            System.out.println("- " + record);
        }
    }

    public static void main(String[] args) {
        DAY6_Q5 patient = new DAY6_Q5("Mary", 35);
        patient.updateMedicalHistory("Allergies: None");
        patient.displayPatientInfo();
    }
}

