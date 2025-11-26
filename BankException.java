import java.util.InputMismatchException; 
import java.util.Scanner;

public class BankException {
    

    public static void withdraw(double w, double b) throws Exception {
        if (w <= 0 || b < 0) {
      
            throw new Exception("Amount cannot be lesser than or equal to 0 or balance negative.");
        }
        if (w > b) {
     
            throw new Exception("Withdrawal amount greater than balance");
        }
        System.out.println("Balance=" + (b - w));
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter withdrawal and balance amount:");
            double a = sc.nextDouble();
            double b = sc.nextDouble();
            
            withdraw(a, b);
            
        } catch (InputMismatchException e) {
            System.out.println("Input Error: You must enter a valid double value.");
            
        } catch (Exception e1) { 
          
            System.out.println("Transaction Error: " + e1.getMessage());
            
        } finally {
         
            sc.close(); 
        }
    }
}