package LabSheet5.Exercise4;
//A person class with the age attribute defined as static would not make sense because
//If you declare any member as a non-static member, you will get an error.

public class BankAccount {
    private String owner;
    private int number;
    private static double interestRate;

    public BankAccount() {
        this ("Owner not Available", 0, 0);
    }

    public BankAccount(String owner, int number, double interestRate) {
        setOwner(owner);
        setNumber(number);
        setInterestRate(interestRate);
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
