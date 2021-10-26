package LabSheet8.Exercise1;

public class TestVehicle {
    public static void main(String[] args) {
        System.out.println("\nTesting the Car no-argument constructor: " );
        Car c1=new Car();
        System.out.println(c1);

        System.out.println("\n\nTesting the Car multi-argument constructor: ");
        Car c2=new Car(100000.0, 4.5, 1.25, 2000.0, "Ferrari", "F2", 2, "05KY21");
        System.out.println(c2);

        System.out.println("\n\nTesting the Bicycle no-argument constructor: ");
        Bicycle b1=new Bicycle();
        System.out.println(b1);

        System.out.println("\n\nTesting the Bicycle multi-argument constructor: ");
        Bicycle b2=new Bicycle(500.0, 1.5, 50.0, 1.0, "Raleigh", "Mountain bike", 4, true);
        System.out.println(b2);
    }
}
