package LabSheet5.Exercise3;

import javax.swing.*;

public class TestThermometer {
    public static void main(String[] args) {

        String tempAsString;
        int temp;

        String text;

        text = "Calling the single-argument constructor...setting the temperature of first thermometer to 35°C";
        Thermometer firstThermometer=new Thermometer(35);
        text += "\n\nFirst Thermometer: \n" + firstThermometer;

        text += "\n\nCalling the no-argument constructor...setting the temperature of second thermometer to 0°C";
        Thermometer secondThermometer=new Thermometer(0);
        text += "\n\nSecond Thermometer: \n" + secondThermometer;

        text += "\n\nCalling setTemperature()...setting the temperature of second thermometer to 25°C";
        secondThermometer.setTemperature(25);
        text += "\n\nSecond Thermometer: \n" + secondThermometer;

        JOptionPane.showMessageDialog(null, "*****Thermometer Testing*****\n\n" + text,
                                 "", JOptionPane.INFORMATION_MESSAGE);

        tempAsString=JOptionPane.showInputDialog("Please enter the current temperature of the first thermometer: ");
        temp=Integer.parseInt(tempAsString);

        text="Calling setTemperature()...setting the temperature of first thermometer to " + temp + "°C";
        firstThermometer.setTemperature(temp);

        text+="\nFirst Thermometer: \n" + firstThermometer;

        JOptionPane.showMessageDialog(null, "*****Thermometer Testing*****\n\n" + text,
                                 "", JOptionPane.INFORMATION_MESSAGE);

        System.exit(0);
    }
}
