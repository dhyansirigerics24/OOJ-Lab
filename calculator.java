class ComplexNumber {
    public int real, img;

    public ComplexNumber(int real, int img) {
        this.real = real;
        this.img = img;
    }
}

public class calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public ComplexNumber add(ComplexNumber c1, ComplexNumber c2) {
        return new ComplexNumber(c1.real + c2.real, c1.img + c2.img);
    }

    public static void main(String[] args) {
        ComplexNumber c1 = new ComplexNumber(2, 5);
        ComplexNumber c2 = new ComplexNumber(3, 6);
        calculator calculator = new calculator();
        int intSum = calculator.add(10, 20);
        System.out.println("Sum of integers: " + intSum);
        ComplexNumber complexSum = calculator.add(c1, c2);
        System.out.println("Sum of complex numbers: " + complexSum.real + " + " + complexSum.img + "i");
    }
}
