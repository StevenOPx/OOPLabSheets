package LabSheet2;

import javax.swing.*;
import java.util.Arrays;

public class RandomArray {
    public static void main(String[] args) {

        int numbers[] = new int[10];
        int num100Plus=0;

        populateArray(numbers);

        String output = "The initial contents of the array is: " + Arrays.toString(numbers);

        Arrays.sort(numbers);

        for(int i=0; i<10; i++)
            if(numbers[i]>100)
                num100Plus++;

        output += "\nThe percentage of values that exceed 100 is " + num100Plus*10 + "%" +
                  "\nThe contents of the array after sorting is: " + Arrays.toString(numbers);

        JOptionPane.showMessageDialog(null, output,
                                      "Array Stats", JOptionPane.INFORMATION_MESSAGE);

        System.exit(0);
    }

    public static void populateArray(int[] numbers) {
        for(int i=0; i<10; i++)
            numbers[i] = (int)(Math.random()*1000) + 1;
    }
}
