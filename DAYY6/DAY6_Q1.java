public class DAY6_Q1 {
    private String name;
    private int studentId;
    private int[] grades;

    // Constructor
    public DAY6_Q1(String name, int studentId, int[] grades) {
        this.name = name;
        this.studentId = studentId;
        setGrades(grades);
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getStudentId() {
        return studentId;
    }

    public int[] getGrades() {
        return grades;
    }

    // Setter methods
    public void setName(String name) {
        this.name = name;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public void setGrades(int[] grades) {
        for (int grade : grades) {
            if (grade < 0 || grade > 100) {
                throw new IllegalArgumentException("Grades must be between 0 and 100");
            }
        }
        this.grades = grades;
    }

    // Method to calculate the average grade
    public double calculateAverageGrade() {
        if (grades == null || grades.length == 0) {
            return 0;
        }
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return (double) sum / grades.length; // Fixed syntax error
    }

    public static void main(String[] args) {
        DAY6_Q1 student = new DAY6_Q1("Alice", 12345, new int[]{85, 90, 78});
        System.out.println("Student Name: " + student.getName());
        System.out.println("Student ID: " + student.getStudentId());
        System.out.println("Average Grade: " + student.calculateAverageGrade());
    }
}
