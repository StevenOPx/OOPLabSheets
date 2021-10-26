package LabSheet1;

import javax.swing.*;

public class CyclistSponsor {
    public static void main(String[] args) {

        String name;
        int distance;
        final double HIGH_RATE=2.50, LOW_RATE=1.75;
        double sponsor;

        name = JOptionPane.showInputDialog("Please enter your name");
        distance = Integer.parseInt(JOptionPane.showInputDialog("Please enter the number of kilometers cycled"));

        if(distance<=10)
            sponsor=LOW_RATE*distance;
        else//(distance=>10)
            sponsor=HIGH_RATE*(distance-10)+LOW_RATE*10;

        JOptionPane.showMessageDialog(null, "Name: " + name +
                                    "\nDistance cycled: " + distance + "km" +
                                    "\nSponsorship amount due: €" + String.format("%.2f",sponsor),
                                    "Receipt", JOptionPane.INFORMATION_MESSAGE);

        System.exit(0);
    }
}
