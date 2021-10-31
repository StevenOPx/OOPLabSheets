package LabSheet2;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class NumbersGUI {

    JTextField jTextField;
    JLabel JLargestNum, JSmallestNum;
    float largest=-1e38f;
    float smallest=1e38f;

    public NumbersGUI() {

        JFrame jFrameWindow = new JFrame("Numbers Application");
        FlowLayout flowLayout = new FlowLayout();
        jFrameWindow.setLayout(flowLayout);
        jFrameWindow.setSize(500,150);
        jFrameWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel jLabelPrompt = new JLabel("Please enter your numbers here");
        JLargestNum = new JLabel("No numbers entered yet");
        JSmallestNum = new JLabel();

        jFrameWindow.add(jLabelPrompt);
        jTextField=new JTextField(20);
        jFrameWindow.add(jTextField);
        jFrameWindow.add(JLargestNum);
        jFrameWindow.add(JSmallestNum);

        jTextField.addActionListener(new TextFieldEventHandler());
        jFrameWindow.setVisible(true);
    }

    public static void main(String[] args) {
        NumbersGUI guiApp = new NumbersGUI();
    }

    private class TextFieldEventHandler implements ActionListener {
        public void actionPerformed(ActionEvent e)
        {
            String numberAsString;
            float number;

            if(jTextField.getText().equals(""))
            {
                JOptionPane.showMessageDialog(null, "You must enter something!!!",
                        "Error", JOptionPane.ERROR_MESSAGE);
            }
            else
            {
                numberAsString=jTextField.getText();
                jTextField.setText("");
                number=Float.parseFloat(numberAsString);

                if(number>largest)
                    largest=number;
                if(number<smallest)
                    smallest=number;

                JLargestNum.setText("This is equivalent to " + largest);
                JSmallestNum.setText("This is equivalent to " + largest);
            }
        }
    }
}
