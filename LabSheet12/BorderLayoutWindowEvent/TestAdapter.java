package LabSheet12.BorderLayoutWindowEvent;

//BorderLayoutWindowEvent.java
/*This program shows how the BorderLayout layout manager and window-events
operate*/

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class TestAdapter extends JFrame {

    private JTextArea textArea;

    public TestAdapter() {
        super("Text Analyser");

        BorderLayout layout = new BorderLayout(6, 8);
        setLayout(layout);

        JLabel promptLabel = new JLabel("Please enter your text on the text-area below");
        add(promptLabel, BorderLayout.NORTH);

        textArea = new JTextArea();
        textArea.setForeground(Color.BLUE);
        textArea.setLineWrap(true);
        add(textArea, BorderLayout.CENTER);

        addWindowListener(new WindowAdapter() {


            public static void main(String args[]) {
                TestAdapter b = new TestAdapter();
            }

            public void windowOpened(WindowEvent e) {
                JOptionPane.showMessageDialog(null, "Welcome to this nify title GUI Application. It is designed to take some user-supplied " +
                                "\ntext entered onto a text-area and when the JFrame window is minimised, it will give" +
                                "\nsome statistical information about the text entered. Then, when the window is " +
                                "\nunminimised, it will clear the text-area for new input",
                        "Program Information", JOptionPane.INFORMATION_MESSAGE);
            }

            //hides the window on closing by default (so application is still actually running in background)
            public void windowClosing(WindowEvent e) {
                JOptionPane.showConfirmDialog(null, "Thanks for using the system!", "Exiting Application",
                        JOptionPane.YES_NO_CANCEL_OPTION);
                dispose();
            }

            //method only called when dispose() is called on the relevant window from elsewhere
            public void windowClosed(WindowEvent e) {
                JOptionPane.showMessageDialog(null, "Window Closed (Disposed)", "Window Closed (Disposed)",
                        JOptionPane.INFORMATION_MESSAGE);
            }


            public void windowIconified(WindowEvent e) {
           /* JOptionPane.showMessageDialog(null, "Window Minimised", "Window Minimised",
                    JOptionPane.INFORMATION_MESSAGE); */
                String text = textArea.getText();
                char cha, nextCha = ' ';

                int vowels = 0, letters = 0, digits = 0, words = 0, sentences = 0, endingD = 0;

                for (int i = 0; i < text.length(); i++) {
                    cha = Character.toLowerCase(text.charAt(i));
                    if (i < text.length() - 1)
                        nextCha = Character.toLowerCase(text.charAt(i + 1));

                    if (cha == 'a' || cha == 'e' || cha == 'i' || cha == 'o' || cha == 'u')
                        vowels++;

                    if (Character.isLetter(cha))
                        letters++;
                    else if (Character.isDigit(cha))
                        digits++;

                    if (cha == ' ')
                        words++;
                    else if (cha == '.' || cha == ',' || cha == '?' || cha == '!')
                        sentences++;

                    if (cha == 'd' || cha == '.' || cha == ',' || cha == '?' || cha == '!')
                        endingD++;
                }

                JOptionPane.showMessageDialog(null, "Statistical Information for Text Entered\n\n" +
                                "\nTotal number of characters: " + text.length() +
                                "\nTotal number of vowels: " + vowels +
                                "\nTotal number of letters: " + letters +
                                "\nTotal number of digits: " + digits +
                                "\nTotal number of words: " + words +
                                "\nTotal number of sentences: " + sentences +
                                "\nTotal number of words ending with 'd': " + endingD,
                        "Program Data", JOptionPane.INFORMATION_MESSAGE);
            }


            public void windowDeiconified(WindowEvent e) {
                textArea.setText("");
            }


            public void windowActivated(WindowEvent e) {
                //better to use console here to prevent logical error
                System.out.println("Window Activated");
            }


            public void windowDeactivated(WindowEvent e) {
                //better to use console here to prevent logical error
                System.out.println("Window Deactivated");
            }
        });
    }
}