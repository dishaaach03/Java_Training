/*Problem Statement:-
projectStatus= NEW/PROGRESS/DONE
        domain = PAYMENT (or) INSURANCE
        (or) HEALTHCARE
->
Develop an application to perform following operations.
        (or) RAIL-ROAD |
create Project class with properties: serialNo, name, domain, cost, manager, teamSize, projectStatus
add required constructor, setter and getter methods.
create Main class and that should have a Project array and create below
        methods to perform operations:: N no.of
a) add operational method to add project into an array.
        b) add operational method to find a project is present in array with given name.
c) add operational method to print projects of a given domain.
d) add operational method to find the total cost of projects of a given domain
e) add operational method to remove a project whose projectStatus is DONE.
        f) add operational method to print the projects which are having the given teamSize.*/

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

class Project {
    private int serialNo;
    private String name;
    private String domain;
    private double cost;
    private String manager;
    private int teamSize;
    private String projectStatus;

    public Project(int serialNo, String name, String domain, double cost, String manager, int teamSize, String projectStatus) {
        this.serialNo = serialNo;
        this.name = name;
        this.domain = domain;
        this.cost = cost;
        this.manager = manager;
        this.teamSize = teamSize;
        this.projectStatus = projectStatus;
    }

    public String getName() {
        return name;
    }

    public String getDomain() {
        return domain;
    }

    public double getCost() {
        return cost;
    }

    public int getTeamSize() {
        return teamSize;
    }

    public String getProjectStatus() {
        return projectStatus;
    }

    @Override
    public String toString() {
        return "Project{" +
                "serialNo=" + serialNo +
                ", name='" + name + '\'' +
                ", domain='" + domain + '\'' +
                ", cost=" + cost +
                ", manager='" + manager + '\'' +
                ", teamSize=" + teamSize +
                ", projectStatus='" + projectStatus + '\'' +
                '}';
    }
}

public class DAY3_Q3 {
    private static List<Project> projects = new ArrayList<>();

    public static void addProject(Project project) {
        projects.add(project);
    }

    public static boolean isProjectPresent(String name) {
        for (Project project : projects) {
            if (project.getName().equalsIgnoreCase(name)) {
                return true;
            }
        }
        return false;
    }

    public static void printProjectsByDomain(String domain) {
        for (Project project : projects) {
            if (project.getDomain().equalsIgnoreCase(domain)) {
                System.out.println(project);
            }
        }
    }

    public static double getTotalCostByDomain(String domain) {
        double totalCost = 0;
        for (Project project : projects) {
            if (project.getDomain().equalsIgnoreCase(domain)) {
                totalCost += project.getCost();
            }
        }
        return totalCost;
    }

    public static void removeCompletedProjects() {
        Iterator<Project> iterator = projects.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().getProjectStatus().equalsIgnoreCase("DONE")) {
                iterator.remove();
            }
        }
    }

    public static void printProjectsByTeamSize(int teamSize) {
        for (Project project : projects) {
            if (project.getTeamSize() == teamSize) {
                System.out.println(project);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of projects: ");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for project " + (i + 1) + ":");
            System.out.print("Serial No: ");
            int serialNo = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Domain (PAYMENT/INSURANCE/HEALTHCARE/RAIL-ROAD): ");
            String domain = scanner.nextLine();
            System.out.print("Cost: ");
            double cost = scanner.nextDouble();
            scanner.nextLine();
            System.out.print("Manager: ");
            String manager = scanner.nextLine();
            System.out.print("Team Size: ");
            int teamSize = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Project Status (NEW/PROGRESS/DONE): ");
            String projectStatus = scanner.nextLine();

            Project project = new Project(serialNo, name, domain, cost, manager, teamSize, projectStatus);
            addProject(project);
        }

        System.out.println("\nAll Projects:");
        for (Project project : projects) {
            System.out.println(project);
        }

        System.out.print("\nEnter project name to check if it exists: ");
        String checkName = scanner.nextLine();
        System.out.println(isProjectPresent(checkName) ? "Project found." : "Project not found.");

        System.out.print("\nEnter domain to list projects: ");
        String domainQuery = scanner.nextLine();
        printProjectsByDomain(domainQuery);

        System.out.print("\nEnter domain to get total cost: ");
        String costQuery = scanner.nextLine();
        System.out.println("Total cost: " + getTotalCostByDomain(costQuery));

        removeCompletedProjects();
        System.out.println("\nProjects after removing completed ones:");
        for (Project project : projects) {
            System.out.println(project);
        }

        System.out.print("\nEnter team size to find projects: ");
        int teamSizeQuery = scanner.nextInt();
        printProjectsByTeamSize(teamSizeQuery);

        scanner.close();
    }
}

