/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS;

/**
 *
 * @author Administrator
 */
public class Car {
    private String brand;
    private String model;
    private int year;

    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public void startEngine() {
        System.out.println("Car engine started");
    }

    public void stopEngine() {
        System.out.println("Car engine stopped");
    }

    public static void main(String[] args) {
        Car myCar = new Car("Toyota", "Corolla", 20223);
        myCar.startEngine();
        myCar.stopEngine();
    }
}

