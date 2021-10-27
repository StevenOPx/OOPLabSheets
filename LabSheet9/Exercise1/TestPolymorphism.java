package LabSheet9.Exercise1;

//TestPolymorphism.java
/*A driver class to test out the Employee, Boss and HourlyWorker classes, modified for Exercise1's requirements*/

public class TestPolymorphism {
    public static void main(String args[])
    {
        Employee[] employees = new Employee[3]; //array of Employee objects (SelfEmployedWorker.java)

        Boss b1 = new Boss("Joe","Smith",750.50);
        HourlyWorker hw1 = new HourlyWorker("Mary","O'Neill", 8.5,49.5);

        employees[0]=b1; //recall a Boss "is a" Employee so this assignment is allowed
        employees[1]=hw1; //recall that an HourlyWorker "is a" Employee so this is okay too (recall HourlyWorker as an Employee)

        SelfEmployedWorker selfEmp=new SelfEmployedWorker("Richard", "Branson");
        employees[2]=selfEmp; //

        //will now use the Employee reference object to display the correct information via polymorphism

        //note the generic nature of the code here

        for(int i=0; i<employees.length; i++)
            System.out.println("\n" + employees[i].toString() + " and the earnings were €" + String.format("%.2f",employees[i].earnings()));
    }
}