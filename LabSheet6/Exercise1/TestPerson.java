package LabSheet6.Exercise1;

import LabSheet6.Exercise1.Person;
import javax.swing.*;

public class TestPerson {
    public static void main(String[] args) {

        String output, firstName, lastName;

        output = "Calling the Person() constructor ... ";

        Person person1 = new Person();
        output += "\nValue of the first Person object is: " + person1;

        output += "\n\nCalling the Person(String,String) constructor after getting the user-supplied values ...";

        firstName = JOptionPane.showInputDialog("Please enter the first name of the second person ");
        lastName = JOptionPane.showInputDialog("Please enter the last name of the second person ");

        Person person2 = new Person(firstName, lastName);
        output += "\nValue of the second person object is: " + person2;

        JOptionPane.showMessageDialog(null, "*****Person Class Tester*****\n\n" + output,
                                      "Person Class Tester", JOptionPane.INFORMATION_MESSAGE);

        System.exit(0);

    }
}
