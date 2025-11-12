package CIE;

public class Internals {
    public int[] internalMarks = new int[5]; // marks in 5 subjects

    public void setInternalMarks(int[] marks) {
        if (marks.length == 5)
            this.internalMarks = marks.clone();
        else
            System.out.println("Please enter marks for 5 courses!");
    }

    public void displayInternals() {
        System.out.print("Internal Marks: ");
        for (int m : internalMarks)
            System.out.print(m + " ");
        System.out.println();
    }
}
