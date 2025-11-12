package SEE;

import CIE.Personal;

public class External extends Personal {
    public int[] seeMarks = new int[5]; // marks in 5 subjects

    public External(String usn, String name, int sem) {
        super(usn, name, sem);
    }

    public void setSeeMarks(int[] marks) {
        if (marks.length == 5)
            this.seeMarks = marks.clone();
        else
            System.out.println("Please enter marks for 5 courses!");
    }

    public void displaySeeMarks() {
        System.out.print("SEE Marks: ");
        for (int m : seeMarks)
            System.out.print(m + " ");
        System.out.println();
    }
}
