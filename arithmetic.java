
import java.util.Scanner;

class Student {
    String usn;
    String name;
    int credits[];
    int marks[];
    int n; // number of subjects

    // Accept student details
    void accept() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter USN: ");
        usn = sc.nextLine();

        System.out.print("Enter Name: ");
        name = sc.nextLine();

        System.out.print("Enter number of subjects: ");
        n = sc.nextInt();

        credits = new int[n];
        marks = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter credits of subject " + (i + 1) + ": ");
            credits[i] = sc.nextInt();

            System.out.print("Enter marks of subject " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
        }
    }

    // Display student details
    void display() {
        System.out.println("\n--- Student Details ---");
        System.out.println("USN : " + usn);
        System.out.println("Name : " + name);
        System.out.println("Subjects: " + n);
        for (int i = 0; i < n; i++) {
            System.out.println("Subject " + (i + 1) + " -> Credits: " + credits[i] + ", Marks: " + marks[i]);
        }
    }

    // Calculate grade point from marks
    int getGradePoint(int mark) {
        if (mark >= 90) return 10;
        else if (mark >= 80) return 9;
        else if (mark >= 70) return 8;
        else if (mark >= 60) return 7;
        else if (mark >= 50) return 6;
        else if (mark >= 40) return 5;
        else return 0;
    }

    // Calculate SGPA
    double calculateSGPA() {
        int totalCredits = 0;
        int weightedSum = 0;

        for (int i = 0; i < n; i++) {
            int gradePoint = getGradePoint(marks[i]);
            weightedSum += credits[i] * gradePoint;
            totalCredits += credits[i];
        }

        if (totalCredits == 0) return 0.0;
        return (double) weightedSum / totalCredits;
    }
}

public class StudentSGPA {
    public static void main(String[] args) {
        Student s = new Student();
        s.accept();
        s.display();
        double sgpa = s.calculateSGPA();
        System.out.printf("SGPA: %.2f\n", sgpa);
    }
}