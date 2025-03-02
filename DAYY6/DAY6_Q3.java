class DAY6_Q3 {
    private String name;
    private int id;
    private double salary;

    // Constructor
    public DAY6_Q3(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    // Method to give a salary raise
    public void giveSalaryRaise(double newSalary) {
        if (newSalary > salary) {
            System.out.println("Salary increased from " + salary + " to " + newSalary);
            salary = newSalary;
        } else {
            System.out.println("New salary must be higher than the current salary!");
        }
    }

    // Getter for salary
    public double getSalary() {
        return salary;
    }

    public static void main(String[] args) {
        DAY6_Q3 employee = new DAY6_Q3("John", 9876, 50000.0);
        employee.giveSalaryRaise(55000.0);
    }
}
