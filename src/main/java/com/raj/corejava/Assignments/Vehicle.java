package com.raj.corejava.Assignments;

public class Vehicle {
    String model;
    String engine_type;

    Vehicle(String model, String engine_type) {
        this.engine_type = engine_type;
        this.model = model;
    }

    public void printData() {
        System.out.println("The Details are as follows: ");
        System.out.println("Model: " + this.model);
        System.out.println("Engine Type: " + this.engine_type);
    }
}

class TwoWheeler extends Vehicle {
    String twoWheeler_type;

    TwoWheeler(String model, String engine_type, String twoWheeler_type) {
        super(model, engine_type);
        this.twoWheeler_type = twoWheeler_type;
    }

    public void printData() {
        super.printData();
        System.out.println("Type of Two Wheeler: " + this.twoWheeler_type);
    }

    public void setTwoWheelerPrint() {
        System.out.println("This is print method of twoWheeler");
    }

}

class FourWheeler extends Vehicle {
    String fourWheeler_type;

    FourWheeler(String model, String engine_type, String fourWheeler_type) {
        super(model, engine_type);
        this.fourWheeler_type = this.fourWheeler_type;
    }

    public void printData() {
        super.printData();
        System.out.println("Type of Four Wheeler: " + this.fourWheeler_type);
    }
}

class test {
    public static void main(String[] args) {
        TwoWheeler bike = new TwoWheeler("Hero Honda Glamour", "1.8 liter", "Motor Bike");
        bike.printData();

        FourWheeler car = new FourWheeler("Toyota Supra", "2JZ", "Coupe");
        car.printData();
    }
}
