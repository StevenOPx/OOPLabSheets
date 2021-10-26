package LabSheet1;

import javax.swing.*;

public class SnackDeal {
    public static void main(String[] args) {

        String name, course;
        int snacks;

        name = JOptionPane.showInputDialog(null, "Please enter your name");
        course = JOptionPane.showInputDialog(null, "Please enter your course");
        snacks = Integer.parseInt(JOptionPane.showInputDialog(null, "How many snacks would you like?"));

        JOptionPane.showMessageDialog(null, "Name: " + name +
                                        "\nCourse: " + course +
                                        "\nSnacks: " + snacks +
                                        "\n\nCost = € " + (snacks*2),
                                        "Receipt", JOptionPane.INFORMATION_MESSAGE);

        System.exit(0);
    }
}
