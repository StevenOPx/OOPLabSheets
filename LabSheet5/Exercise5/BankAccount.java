package LabSheet5.Exercise5;
//A person class with the age attribute defined as static would not make sense because
//If you declare any member as a non-static member, you will get an error.

public class BankAccount {
    private String owner;
    private int number;
    private static double interestRate;
    private static int count;

    public BankAccount() {
        this ("Owner not Available", 0);
    }

    public BankAccount(String owner, double interestRate) {
        setOwner(owner);
        setNumber(count);
        setInterestRate(interestRate);
        incrementCount();
    }
    private static void incrementCount() {
        count++;
    }
    public String getOwner() {
        return owner;
    }
    public int getNumber() {
        return number;
    }
    public static double getInterestRate() {
        return interestRate;
    }
    public static int getCount() {
        return count;
    }

    public void setOwner(String owner) {
        this.owner=owner;
    }
    public void setNumber(int number) {
        this.number=number;
    }
    public static void setInterestRate(double interestRate) {
        BankAccount.interestRate=interestRate;
    }

    public String toString() {
        return "Owner: " + getOwner() +
                "  Account Number: " + getNumber() +
                "  Interest Rate: " + getInterestRate();
    }

}
