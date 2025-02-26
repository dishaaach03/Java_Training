/*Problem statement:- (usecase on Static variable)
        -> develop an application to create N student objects.
create a Student class with properties: id, name, course, fee
create a constructor that accepts name, course, fee as parameters.
declare studentid as static variable
make use of static block to generate id and assign to each student object.
print the student details by creating a method studentInfo()
class Student{
    private int id;
    static{
        private String name;
// logic to generate id and assign|
        private String course;
    }
    private double fee;
    private static int student_id;*/

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

class Student {
    private int id;
    private String name;
    private String course;
    private double fee;
    private static int student_id;

    static {
        student_id = 100;
    }

    public Student(String name, String course, double fee) {
        this.id = student_id++;
        this.name = name;
        this.course = course;
        this.fee = fee;
    }

    public void studentInfo() {
        System.out.printf("ID: %d | Name: %s | Course: %s | Fee: ₹%.2f\n", id, name, course, fee);
    }
}

public class DAY2_Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int n = sc.nextInt();
        sc.nextLine();

        Student[] students = new Student[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Student " + (i + 1) + ":");
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Course: ");
            String course = sc.nextLine();
            System.out.print("Fee: ");
            double fee = sc.nextDouble();
            sc.nextLine();

            students[i] = new Student(name, course, fee);
        }

        System.out.println("\n--- Student Details ---");
        for (Student s : students) {
            s.studentInfo();
        }

        sc.close();
    }
}
