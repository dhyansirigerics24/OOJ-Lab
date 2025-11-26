import java.io.File;
import  java.io.FileNotFoundException;
import java.util.Scanner;
public class OpenFileOnly {
    public static void main(String[] args) {
        try {
            Scanner sc =new Scanner(System.in);
            System.out.println("Enter file name:");
            String S=sc.next();
            File file=new File(S);
            if(!file.exists()){
                throw new FileNotFoundException("File Not Found");
            }
            System.out.println("File opened successfully");
        } catch (FileNotFoundException e) {
            System.out.println("Error:"+ e.getMessage());
        }
    }
}
