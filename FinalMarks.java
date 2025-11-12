
import java.util.Scanner;
import CIE.*;
import SEE.*;

public class FinalMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine();

        External[] students = new External[n];
        Internals[] internalMarks = new Internals[n];

        // Input student details
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Student " + (i + 1));

            System.out.print("Enter USN: ");
            String usn = sc.nextLine();

            System.out.print("Enter Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Semester: ");
            int sem = sc.nextInt();

            students[i] = new External(usn, name, sem);
            internalMarks[i] = new Internals();

            int[] internals = new int[5];
            System.out.println("Enter 5 Internal Marks: ");
            for (int j = 0; j < 5; j++)
                internals[j] = sc.nextInt();
            internalMarks[i].setInternalMarks(internals);

            int[] see = new int[5];
            System.out.println("Enter 5 SEE Marks: ");
            for (int j = 0; j < 5; j++)
                see[j] = sc.nextInt();
            students[i].setSeeMarks(see);

            sc.nextLine(); // consume newline
        }

        // Display final marks
        System.out.println("\n----------- Final Marks -----------");
        for (int i = 0; i < n; i++) {
            System.out.println("\nStudent " + (i + 1) + " Details:");
            students[i].displayPersonal();

            System.out.print("Final Marks (out of 100): ");
            for (int j = 0; j < 5; j++) {
                int finalMark = internalMarks[i].internalMarks[j] + (students[i].seeMarks[j] / 2);
                System.out.print(finalMark + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
