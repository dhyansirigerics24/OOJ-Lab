public class Car {
    String make, model;
    int year;
    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }
    void displayInfo() {
        System.out.println("The make of the car is: " + make);
        System.out.println("The model of the car is: " + model);
        System.out.println("The year of the car is: " + year);
    }

    public static void main(String[] args) {
        Car[] cars = new Car[3];
        cars[0] = new Car("Toyota", "Camry", 2019);
        cars[1] = new Car("Honda", "Accord", 2021);
        cars[2] = new Car("Ford", "Mustang", 2020);

        for (Car car : cars) {
            car.displayInfo();
            System.out.println();
        }
        cars[1] = null;
        System.gc();
        System.out.println("Requested garbage collection.");
    }
}
