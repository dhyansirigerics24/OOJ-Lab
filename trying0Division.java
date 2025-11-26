
import java.util.Scanner;

public class trying0Division {
    public static void main(String[] args) {
        int a,b;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enetr 2 numbers:");
        a=sc.nextInt();
        b=sc.nextInt();
        try {
            int c=a/b;
            System.out.println("Result="+c);
        } catch (ArithmeticException e) {
            System.out.println("Dividing by 0");
        }
    }
}
