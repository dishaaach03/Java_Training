import java.util.HashSet;
import java.util.Set;
import java.util.Objects;
import java.util.stream.Collectors;


public class DAY9_Q1 {

    private Set<Project> projects = new HashSet<>();

    public void addProject(Project project) {
        projects.add(project);
    }

    public boolean isProjectPresent(String projectName) {
        for (Project project : projects) {
            if (project.getName().equals(projectName)) {
                return true;
            }
        }
        return false;
    }

    public Set<Project> getProjectsByDomain(String domain) {
        return projects.stream()
                .filter(project -> project.getDomain().equals(domain))
                .collect(Collectors.toSet());
    }


    public double getTotalCostByDomain(String domain) {
        return projects.stream()
                .filter(project -> project.getDomain().equals(domain))
                .mapToDouble(Project::getCost)
                .sum();
    }

    public Set<Project> getProjectsByManager(String manager) {
        return projects.stream()
                .filter(project -> project.getManager().equals(manager))
                .collect(Collectors.toSet());
    }

    public boolean changeTeamSize(String projectName, int newTeamSize) {
        for (Project project : projects) {
            if (project.getName().equals(projectName)) {
                project.setTeamSize(newTeamSize);
                return true; // Indicate success
            }
        }
        return false;
    }

    public boolean changeDomain(String projectName, String newDomain) {
        for (Project project : projects) {
            if (project.getName().equals(projectName)) {
                project.setDomain(newDomain);
                return true; // Indicate success
            }
        }
        return false;
    }

    public boolean removeProjectsByDomain(String domain) {
        boolean removed = projects.removeIf(project -> project.getDomain().equals(domain));
        return removed;
    }


    public void increaseCostByDomain(String domain) {
        projects.stream()
                .filter(project -> project.getDomain().equals(domain))
                .forEach(project -> project.setCost(project.getCost() * 1.15));
    }

    public void increaseTeamSizeByDomain(String domain) {
        projects.stream()
                .filter(project -> project.getDomain().equals(domain))
                .forEach(project -> project.setTeamSize((int) (project.getTeamSize() * 1.07)));
    }


    public static void main(String[] args) {
        DAY9_Q1 projectManager = new DAY9_Q1();

        Project p1 = new Project(1, "Project Alpha", "Alice", "Finance", 100000, 10);
        Project p2 = new Project(2, "Project Beta", "Bob", "Healthcare", 150000, 15);
        Project p3 = new Project(3, "Project Gamma", "Alice", "Finance", 120000, 12);
        Project p4 = new Project(4, "Project Delta", "Charlie", "E-commerce", 80000, 8);
        Project p5 = new Project(5, "Project Epsilon", "Bob", "Healthcare", 180000, 18);
        Project p6 = new Project(6, "Project Zeta", "David", "Finance", 90000, 9);
        Project p7 = new Project(7, "Project Eta", "Charlie", "E-commerce", 110000, 11);
        Project p8 = new Project(8, "Project Theta", "Alice", "Healthcare", 130000, 13);
        Project p9 = new Project(9, "Project Iota", "Eve", "E-commerce", 95000, 10);

        projectManager.addProject(p1);
        projectManager.addProject(p2);
        projectManager.addProject(p3);
        projectManager.addProject(p4);
        projectManager.addProject(p5);
        projectManager.addProject(p6);
        projectManager.addProject(p7);
        projectManager.addProject(p8);
        projectManager.addProject(p9);

        System.out.println("Is Project Alpha present? " + projectManager.isProjectPresent("Project Alpha"));
        System.out.println("Projects in Finance domain: " + projectManager.getProjectsByDomain("Finance"));
        System.out.println("Total cost of projects in Healthcare domain: " + projectManager.getTotalCostByDomain("Healthcare"));
        System.out.println("Projects managed by Alice: " + projectManager.getProjectsByManager("Alice"));

        projectManager.changeTeamSize("Project Alpha", 15);
        System.out.println("Project Alpha new team size: " + p1.getTeamSize());

        projectManager.changeDomain("Project Beta", "AI");
        System.out.println("Project Beta new domain: " + p2.getDomain());

        projectManager.increaseCostByDomain("Finance");
        System.out.println("Project Alpha new cost: " + p1.getCost());

        projectManager.increaseTeamSizeByDomain("Healthcare");
        System.out.println("Project Epsilon new team size: " + p5.getTeamSize());

        projectManager.removeProjectsByDomain("E-commerce");
        System.out.println("Projects after removing E-commerce projects: " + projectManager.projects);
    }
}
