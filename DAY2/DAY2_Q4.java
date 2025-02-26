/*Problem Statement:-
        -> Develop an application to create a profile for an Employee when he joined in a company.
create an Employee class with props: id, name, age, salary, role, email,
projects[]
create an employ object by initializing all the fields using a constructor.
salary is increased by 15000, so update salary and print emp details
role is changed as "Architect", so update role and print details
email is changed to "yahoo" domain, so update email and print details
new projects assigned [ "CMS", "BCMS"] to employ, so update projects and print details.
        NOTE: add proper setter and getter methods to perform all the above operations.|*/

import java.util.Arrays;

class Employee {
    private int id;
    private String name;
    private int age;
    private double salary;
    private String role;
    private String email;
    private String[] projects;

    Employee(int id, String name, int age, double salary, String role, String email, String[] projects) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.role = role;
        this.email = email;
        this.projects = projects;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setProjects(String[] projects) {
        this.projects = projects;
    }

    public void displayDetails() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
        System.out.println("Role: " + role);
        System.out.println("Email: " + email);
        System.out.println("Projects: " + Arrays.toString(projects));
        System.out.println();
    }
}

public class DAY2_Q4 {
    public static void main(String[] args) {
        Employee emp = new Employee(101, "John Doe", 30, 60000, "Developer", "johndoe@gmail.com", new String[]{"ERP"});
        emp.displayDetails();
        emp.setSalary(emp.salary + 15000);
        emp.displayDetails();
        emp.setRole("Architect");
        emp.displayDetails();
        emp.setEmail("johndoe@yahoo.com");
        emp.displayDetails();
        emp.setProjects(new String[]{"CMS", "BCMS"});
        emp.displayDetails();
    }
}

