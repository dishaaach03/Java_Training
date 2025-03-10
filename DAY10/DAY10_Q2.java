import java.util.*;

public class DAY10_Q2 {

    @FunctionalInterface
    interface EligibilityChecker {
        boolean isEligible(String name, int age); // Single abstract method
    }

    public static void main(String[] args) {
        // Using a lambda expression to implement the EligibilityChecker interface
        EligibilityChecker checker = (name, age) -> age >= 18;

        // Check eligibility and print the results
        String name1 = "Arun";
        int age1 = 22;
        boolean eligible1 = checker.isEligible(name1, age1);
        System.out.println(name1 + " is eligible: " + eligible1);

        String name2 = "Veena";
        int age2 = 14;
        boolean eligible2 = checker.isEligible(name2, age2);
        System.out.println(name2 + " is eligible: " + eligible2);
    }
}
