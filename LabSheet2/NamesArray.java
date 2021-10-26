package LabSheet2;

import javax.swing.*;
import java.util.Arrays;

public class NamesArray {
    public static void main(String[] args) {

        String names[] = new String[5], longestName="", result="";
        int totalCha=0;

        populateArray(names);

        for(int i=0; i<names.length(); i++)
        {
            if(names[i].length>names.length[i])
                longestName=names[i];
            result += names[i];
        }

    public static void populateArray(String names[]) {
        for(int i=0; i<names.length(); i++)
            names = JOptionPane.showInputDialog("Please enter the name of person " + (i+1));
        }

    to String() {

        }

    JOptionPane.showMessageDialog(null, "The longest name is " + longestName +
                                  "\n\nAverage characters per name is " + avgCha +
                                  "\n\nThe array sorted in ascending order is: " + names[i] + "[ ]" +
                                  "Results", JOptionPane.INFORMATION_MESSAGE);
    }
}
