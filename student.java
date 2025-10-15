import java.util.Scanner;
public class student {
    String USN;
    String name;
    float credits[]=new float[5];
    float marks[]=new float[5];

    void input(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter USN:");
        USN = sc.nextLine();
        System.out.println("Enter name:");
        name=sc.nextLine();
        for(int i=0;i<5;i++){
            System.out.println("Enter marks of subject "+(i+1)+":");
            marks[i]=sc.nextFloat();
            System.out.println("Enter subject"+(i+1)+"Credits");
            credits[i]=sc.nextFloat();
        }
        
    }
    float claculate(){
        float sgpa;
        float sumcredits=0;
        float sumresult=0;
        float gradepoint=0;
        for(int i=0;i<5;i++){
            if(marks[i]<100&&marks[i]>=90){
                gradepoint=10;
            }
            else if(marks[i]<90&&marks[i]>=80){
                gradepoint=9;
            }
            else if(marks[i]<80&&marks[i]>=70){
                gradepoint=8;
            }
            else if(marks[i]<70&&marks[i]>=65){
                gradepoint=7;
            }
            else if(marks[i]<65&&marks[i]>=60){
                gradepoint=6;
            }
            
            sumresult+=(gradepoint*credits[i]);
            sumcredits+=credits[i];
        }
        sgpa=sumresult/sumcredits;
        return sgpa;
    }
    void display(){
        System.out.println("USN="+USN);
        System.out.println("Name="+name);
        for(int i=0;i<5;i++){
            System.out.println("Marks of subject"+(i+1)+"="+marks[i]);
        }
        System.out.printf("SGPA = %.2f\n", claculate());

        
    }
    public static void main(String[] args) {
        student s=new student();
        s.input();
        s.display();

    }
    
}
