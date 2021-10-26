package LabSheet8.Exercise1;

public class Bicycle extends Vehicle {
    private int gearCount;
    private boolean hasBell;

    public Bicycle() {
        setGearCount(0);
        setHasBell(false);
    }

    public Bicycle(double price, double length, double height, double weight, String manufacturer, String model, int gearCount, boolean hasBell) {
        super(price, length, weight, height, manufacturer, model);
        setGearCount(gearCount);
        setHasBell(hasBell);
    }

    public int getGearCount() {
        return gearCount;
    }
    public void setGearCount(int gearCount) {
        this.gearCount=gearCount;
    }

    public boolean getHasBell() {
        return hasBell;
    }
    public void setHasBell(boolean hasBell) {
        this.hasBell=hasBell;
    }

    public String toString() {
        String str = super.toString() + "\nHas Bell: ";

        if(getHasBell())
            str+="Yes";
        else
            str+="No";

        str+="\nGear Count: " + getGearCount();

        return str;
    }
}
