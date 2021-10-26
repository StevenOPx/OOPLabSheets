package LabSheet1;

import javax.swing.*;

public class NumbersMenu {
    public static void main(String[] args) {

        String text="";
        int i=0, number, choice;
        double factorial;

        do {
            number = Integer.parseInt(JOptionPane.showInputDialog("------Iteration" + (i + 1) +
                    "------\n\nPlease enter any whole number: "));

            choice = Integer.parseInt(JOptionPane.showInputDialog("\nWhat would you like to do?\n\n" +
                    "1. Determine if the number is odd or even\n" +
                    "2. Find the factorial of the number\n" +
                    "3. Quit the program" +
                    "\n\nPlease enter the choice: "));

            switch (choice) {
                case 1:
                    if (number % 2 == 0)
                        text += "\nThe number you entered is even";
                    else
                        text += "\nThe number you entered is odd";
                    break;
                case 2:
                    if (number < 0)
                        text += "\nCannot get the factorial of a negative number!";
                    else {
                        factorial = 1;

                        for (int j = 1; j <= number; j++)
                            factorial *= j;

                        text += "\nThe factorial of the number you entered is: " + factorial;
                    }
                    break;
                case 3:
                    text += "\nQuitting the program earlier than anticipated ... goodbye";
            }

            JOptionPane.showMessageDialog(null, text, "Number Data", JOptionPane.INFORMATION_MESSAGE);

            i++;

            text = "";
        }
        while(i<10 && choice!=3);

        System.exit(0);
    }
}
