import java.util.Scanner;
public class quadratic {
    double disc,r1,r2,complex,real;
    public void claculate(double a ,double b, double c){
        disc=(b*b)-4*a*c;
        if(disc==0){
            System.out.println("Roots are real and equal");
            r1=-b/(2*a);
            System.out.println("Root1=Root2="+r1);
        }
        else if(disc>0){
            System.out.println("Roots and real and distinct");
            r1=(-b+Math.sqrt(disc))/(2*a);
            r2=(-b-Math.sqrt(disc))/(2*a);
            System.out.println("Root1="+r1);
            System.out.println("Root2="+r2);
        }
        else{
            System.out.println("Roots are imaginary");
            real=-b/(2*a);
            complex=(Math.abs(disc));
            complex=Math.sqrt(complex)/(2*a);
            System.out.println("Root1="+real+"+i"+complex);
            System.out.println("Root2="+real+"-i"+complex);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a,b and c values:");
        double a=sc.nextDouble();
        double b=sc.nextDouble();
        double c=sc.nextDouble();
        quadratic q1=new quadratic();
        q1.claculate(a, b, c);
        sc.close();

    }



}
