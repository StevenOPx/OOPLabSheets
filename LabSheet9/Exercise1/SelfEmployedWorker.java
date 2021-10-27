package LabSheet9.Exercise1;

//SelfEmployedWorker.java
/*A subclass of the Employee class*/

public final class SelfEmployedWorker extends Employee {

    private double estimatedIncome;

    public SelfEmployedWorker(String firstName, String lastName) {
        super(firstName, lastName);
        setEstIncome();
    }

    public void setEstIncome() {
        this.estimatedIncome=(int)(Math.random()*(900-400+1)+400);
    }

    public double earnings() {
        return estimatedIncome;
    }

    public String toString() {
        return "Self-employed worker's name is: " + super.toString();
    }
}
