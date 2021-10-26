package LabSheet8.Exercise2;

public class Vehicle {
    private double price;
    private double length;
    private double height;
    private double weight;
    private String manufacturer;
    private String model;

    public Vehicle() {
        this (0, 0, 0, 0, "No manufacturer specified", "No model specified");
    }

    public Vehicle(double price, double length, double height, double weight, String manufacturer, String model) {
        setPrice(price);
        setLength(length);
        setHeight(height);
        setWeight(weight);
        setManufacturer(manufacturer);
        setModel(model);
    }

    public Double getPrice() {
        return price;
    }
    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getLength() {
        return length;
    }
    public void setLength(Double length) {
        this.length = length;
    }

    public Double getHeight() {
        return height;
    }
    public void setHeight(Double height) {
        this.height = height;
    }

    public Double getWeight() {
        return weight;
    }
    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public String getManufacturer() {
        return manufacturer;
    }
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }

    public String toString() {
        return "\nPrice: " + getPrice() + "\nLength: " + getLength() + "\nHeight: " + getHeight() +
                "\nWeight: " + getWeight() + "\nManufacturer: " + getManufacturer() + "\nModel: " + getModel();
    }
}
