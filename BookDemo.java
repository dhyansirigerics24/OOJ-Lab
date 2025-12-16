import java.util.Scanner;

class Book {

    private String name;
    private String author;
    private double price;
    private int numPages;


    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setNumPages(int numPages) {
        this.numPages = numPages;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public int getNumPages() {
        return numPages;
    }

    // toString
    @Override
    public String toString() {
        return "Book Details:\n" +
               "Name: " + name + "\n" +
               "Author: " + author + "\n" +
               "Price: Rs." + price + "\n" +
               "Number of Pages: " + numPages + "\n";
    }
}

public class BookDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of books: ");
        int n = sc.nextInt();
        sc.nextLine();

        Book[] books = new Book[n];

        for (int i = 0; i < n; i++) {
            books[i] = new Book(); // object created

            System.out.println("\nEnter details for Book " + (i + 1) + ":");

            System.out.print("Enter Book Name: ");
            books[i].setName(sc.nextLine());

            System.out.print("Enter Author Name: ");
            books[i].setAuthor(sc.nextLine());

            System.out.print("Enter Price: ");
            books[i].setPrice(sc.nextDouble());

            System.out.print("Enter Number of Pages: ");
            books[i].setNumPages(sc.nextInt());
            sc.nextLine();
        }

        System.out.println("\n---- Book Details ----");
        for (Book b : books) {
            System.out.println(b);   // toString() called automatically
        }

        sc.close();
    }
}
