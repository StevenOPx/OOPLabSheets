package LabSheet5.Exericse1;
//The Computer c1 code should output getManufacturer from LabSheet3 Exercise1 - Computer.
// = Not available 2.
import LabSheet3.Exercise1.Computer;
import javax.swing.*;

public class TestBook {
    public static void main(String[] args) {

        String output="";

        Computer c1 = new Computer();

        System.out.println(c1.getManufacturer());

        Book b1 = new Book();

        output += "Calling the no-argument Book constructor. " + "The first Book object details are: \n\n" + b1.toString();

        Book b2 = new Book("The Davinci Code", 19.99, "3452617232", 348);

        output += "\n\nCalling the multi-argument Book constructor. " + "The second Book object details are: \n\n" + b2.toString();

        JOptionPane.showMessageDialog(null, output, "Book Object Data",
                                      JOptionPane.INFORMATION_MESSAGE);

        System.out.println(Book.getCount());

        System.exit(0);
    }
}
