class WrongAge extends Exception {
    public WrongAge(String message) {
        super(message);
    }
}


class Father {
    protected int age;

    public Father(int age) throws WrongAge {
        if (age < 0) {
            throw new WrongAge("Father's age cannot be negative!");
        }
        this.age = age;
        System.out.println("Father's age: " + age);
    }
}


class Son extends Father {
    private int sonAge;

    public Son(int fatherAge, int sonAge) throws WrongAge {
        super(fatherAge); 
        if (sonAge >= fatherAge) {
            throw new WrongAge("Son's age cannot be greater than or equal to father's age!");
        }
        if (sonAge < 0) {
            throw new WrongAge("Son's age cannot be negative!");
        }
        this.sonAge = sonAge;
        System.out.println("Son's age: " + sonAge);
    }
}

public class ExceptionDemo {
    public static void main(String[] args) {
        try {
            Son s1 = new Son(45, 20);
            System.out.println("Object created successfully!");
        } catch (WrongAge e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
        System.out.println("\n\n");
        try {
            Son s2 = new Son(-40, 10); 
        } catch (WrongAge e) {
            System.out.println("Exception caught: " + e.getMessage());
        }

        System.out.println("\n\n");

        try {
            Son s3 = new Son(40, 40); 
        } catch (WrongAge e) {
            System.out.println("Exception caught: " + e.getMessage());
        }

    }
}
