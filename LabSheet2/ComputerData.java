package LabSheet2;

import javax.swing.*;

public class ComputerData {
    public static void main(String[] args) {

        float price, cheap=0, expensive=0;
        int i=0, hardDiskSpace=0, totalDiskSpace=0, processedNum=0;
        String serialNum, processor, processorCheap="", hardDiskSpaceAsString, priceAsString;
        boolean valid;

        serialNum = JOptionPane.showInputDialog("Please enter the serial number (<CR> to exit)");

        while(!serialNum.equals(""))
        {
            hardDiskSpaceAsString = JOptionPane.showInputDialog("Please enter the hard-disk space");
            valid=false;

            while(!valid)
            {
                for(i=0; i<hardDiskSpaceAsString.length(); i++)
                    if(!Character.isDigit(hardDiskSpaceAsString.charAt(i)))
                        break;

                if(i<hardDiskSpaceAsString.length())
                    hardDiskSpaceAsString = JOptionPane.showInputDialog("Invalid! Please re-enter hard-disk space");
                else {
                    hardDiskSpace = Integer.parseInt(hardDiskSpaceAsString);

                    if(hardDiskSpace > 50 && hardDiskSpace < 5000)
                        valid=true;
                    else
                        hardDiskSpaceAsString = JOptionPane.showInputDialog("Invalid! Please re-enter hard-disk space");

                }
            }

            processor = JOptionPane.showInputDialog("Please enter the processor type ");

            priceAsString = JOptionPane.showInputDialog("Please enter the price ");

            price = Float.parseFloat(priceAsString);
                processedNum++;

            if(processedNum == 1)
            {
                cheap=price;
                expensive=price;
                processorCheap=processor;
            }
            else if(price<cheap)
            {
                cheap=price;
                processorCheap=processor;
            }
            else if(price>expensive)
                expensive=price;

            totalDiskSpace+=hardDiskSpace;

            serialNum = JOptionPane.showInputDialog("Please enter the serial number (<CR> to exit)");
        }

        if(processedNum>0)
            JOptionPane.showMessageDialog(null, "\nThe average disk space available on the computers processed is: "
                    + String.format("%.0f", averageDiskSpace(totalDiskSpace, processedNum)) + "GB" +
                    "\nThe price range of the computers is from " + String.format("%.2f", cheap) + "to " + String.format("%.2f", expensive) +
                    "\nThe processor type on the cheapest computer is " + processorCheap,
                    "Computer Stats", JOptionPane.INFORMATION_MESSAGE);
        else
            JOptionPane.showMessageDialog(null, "No data entered!",
                                          "Computer Data", JOptionPane.INFORMATION_MESSAGE);

        System.exit(0);

    }

    public static float averageDiskSpace (int totalDiskSpace, int processedNum)
    {
        return (float)totalDiskSpace/processedNum;
    }
}
