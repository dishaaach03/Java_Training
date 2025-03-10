import java.util.*;
import java.util.stream.Collectors;

public class DAY10_Q3 {

    static class Employ {
        private int id;
        private String name;
        private double salary;
        private String role;
        private String location;

        public Employ(int id, String name, double salary, String role, String location) {
            this.id = id;
            this.name = name;
            this.salary = salary;
            this.role = role;
            this.location = location;
        }

        public int getId() {
            return id;
        }
        public String getName() {
            return name;
        }
        public double getSalary() {
            return salary;
        }
        public String getRole() {
            return role;
        }
        public String getLocation() {
            return location;
        }

        @Override
        public String toString() {
            return "Employ{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", salary=" + salary +
                    ", role='" + role + '\'' +
                    ", location='" + location + '\'' +
                    '}';
        }
    }

    @FunctionalInterface
    interface LocationWise {
        List<Employ> findLocationWise(List<Employ> employList, String loc);
    }

    public static void main(String[] args) {
        List<Employ> employees = new ArrayList<>();
        employees.add(new Employ(1, "Alice", 60000, "Developer", "New York"));
        employees.add(new Employ(2, "Bob", 70000, "Manager", "London"));
        employees.add(new Employ(3, "Charlie", 55000, "Analyst", "New York"));
        employees.add(new Employ(4, "David", 80000, "Architect", "San Francisco"));
        employees.add(new Employ(5, "Eve", 65000, "Developer", "London"));

        LocationWise locationFilter = (list, location) ->
                list.stream()
                        .filter(employee -> employee.getLocation().equalsIgnoreCase(location))
                        .collect(Collectors.toList());

        String targetLocation = "London";
        List<Employ> londonEmployees = locationFilter.findLocationWise(employees, targetLocation);

        System.out.println("Employees in " + targetLocation + ":");
        londonEmployees.forEach(System.out::println); // Using a method reference to print each employee
    }
}
