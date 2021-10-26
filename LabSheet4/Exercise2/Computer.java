package LabSheet4.Exercise2;

        public class Computer {
            private String manufacturer;
            private String type;
            private double speed;
            private int RAM;
            private double price;

            public Computer() {
                manufacturer = "Not available";
                type = "Not available";
                speed = 0;
                RAM = 0;
                price = 0;
            }

            public Computer(String manufacturer,String type,double speed,int RAM,double price) {
                setManufacturer(manufacturer);
                setType(type);
                setSpeed(speed);
                setRAM(RAM);
                setPrice(price);
            }

            public String getManufacturer() {
                return manufacturer;
            }

            public String getType() {
                return type;
            }

            public double getSpeed() {
            return speed; }

        public int getRAM() {
            return RAM; }

        public double getPrice() {
            return price; }

        public void setManufacturer(String manufacturer) {
            setManufacturer(manufacturer); }

        public void setType(String type) {
            setType(type); }

        public void setSpeed(double speed) {
            if(speed>0)
                setSpeed(speed); }

        public void setRAM(int RAM) {
           // if(RAM<0)
               // return 0;
            setRAM(RAM); }

        public void setPrice(double price) {
            //if(price < 0)
                //return 0;
            setPrice(price); }

            public String toString() {
                return "Manufacturer: " + getManufacturer() + " Type: " + getType() + " Speed: " + getSpeed()
                        + " RAM: " + getRAM() + " Price: " + getPrice();
        }
    }