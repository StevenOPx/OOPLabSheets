package LabSheet5.Exericse1;

public class Book {
    private String title;
    private double price;
    private String ISBN;
    private int pages;
    private int ID;
    private static int count;

    public Book() {
        this("Title Not Available", 0.00, "ISBN Not Available", 0);
    }

    public Book(String title, double price, String ISBN, int pages) {
        setTitle(title);
        setPrice(price);
        setISBN(ISBN);
        setPages(pages);
        setID(count);
        incrementCount();
    }

    private static void incrementCount() {
        count++;
    }
    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    public String getISBN() {
        return ISBN;
    }

    public int getPages() {
        return pages;
    }

    public int getID() {
        return ID;
    }

    public static int getCount() { return count; }

    public void setTitle(String title) {
        this.title=title;
    }

    public void setPrice(double price) {
        this.price=price;
    }

    public void setISBN(String ISBN) {
        this.ISBN=ISBN;
    }

    public void setPages(int pages) {
        this.pages=pages;
    }

    public void setID(int ID) { this.ID=ID; }

    public String toString() {
        return "Title: " + getTitle() + "   Price: " + getPrice() + "   ISBN: " + getISBN() +
                "   Pages: " + getPages() + "   ID: " + getID();
        }
}
