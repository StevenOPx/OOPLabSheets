package LabSheet2;

import javax.swing.*;

public class ComputerData {
    public static void main(String[] args) {

        float price=0, cheap=0, expensive=0;
        int i=0, hardDiskSpace=0, totalhardDiskSpace=0, processor=0;
        String snumber, processor, processorCheap="", hardDiskSpaceAsString, priceAsString;
        boolean valid;

        snumber = JOptionPane.showInputDialog("Please enter the serial number (<CR> to exit)");

        while(!snumber.equals(""))
        {
            hardDiskSpaceAsString = JOptionPane.showInputDialog("Please enter the hard-disk space");
            valid=false;

            while(!valid)
            {
                for(i=0; i<hardDiskSpaceAsString.length(); i++)
                    if(character)
            }
        }
    }
}
