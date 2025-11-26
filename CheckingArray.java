import java.util.Scanner;
public class CheckingArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int [] arr=new int[5];
        System.out.println("Enetr array elements");
        for (int i = 0; i <5; i++) {
            arr[i]=sc.nextInt();
        }
        try {
            System.out.print("Enter index:");
            int i=sc.nextInt();
            int c=arr[i];
            System.out.println("Result="+c);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index out of range");
        }
    }
}
