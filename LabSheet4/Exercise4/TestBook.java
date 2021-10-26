package LabSheet4.Exercise4;

import LabSheet4.Exercise4.Book;
import javax.swing.*;
import java.awt.*;

public class TestBook {
    public static void main(String[] args) {

        String output="", title, ISBN;
        double price;
        int pages;

        JTextArea textArea = new JTextArea();
        Font font = new Font ("monospaced", Font.PLAIN,12);
        textArea.setFont(font);

        textArea.setText(String.format("%-25s%-9s%-15s%s", "Title", "Price", "ISBN", "Pages"));

        title = JOptionPane.showInputDialog( "Please enter the title of your favorite book");
        price = Double.parseDouble(JOptionPane.showInputDialog( "Please enter the price of your favorite book"));
        ISBN = JOptionPane.showInputDialog( "Please enter the ISBN of your favorite book");
        pages = Integer.parseInt(JOptionPane.showInputDialog( "Please enter the number of pages in your favorite book"));

        Book favoriteBook = new Book(title, price, ISBN, pages);

        output += String.format("\n\n%-25s%-9.5f%-15s%d", favoriteBook.getTitle(), favoriteBook.getPrice(),
                                favoriteBook.getISBN(), favoriteBook.getPages());

        title = JOptionPane.showInputDialog( "Please enter the title of your favorite book");
        price = Double.parseDouble(JOptionPane.showInputDialog( "Please enter the price of your favorite book"));
        ISBN = JOptionPane.showInputDialog( "Please enter the ISBN of your favorite book");
        pages = Integer.parseInt(JOptionPane.showInputDialog( "Please enter the number of pages in your favorite book"));

        Book leastFavoriteBook = new Book(title, price, ISBN, pages);

        output += String.format("\n\n%-25s%-9.5f%-15s%d", leastFavoriteBook.getTitle(), leastFavoriteBook.getPrice(),
                leastFavoriteBook.getISBN(), leastFavoriteBook.getPages());

        textArea.append(output);

        JOptionPane.showMessageDialog(null, textArea, "Book Object Data",
                JOptionPane.INFORMATION_MESSAGE);

        System.exit(0);
    }
}
