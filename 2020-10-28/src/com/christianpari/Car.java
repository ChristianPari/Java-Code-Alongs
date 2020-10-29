
package com.christianpari;

public class Car {
  private String color;
  private String model;
  private String vin;
  private int tireCount;
  private int year;
  private boolean isOn = false;

  public Car(String color, String model, String vin, int tireCount, int year) {
    this.color = color;
    this.model = model;
    this.vin = vin;
    this.tireCount = tireCount;
    this.year = year;
  }

  public Car(String color, String model, String vin, int year) {
    this.color = color;
    this.model = model;
    this.vin = vin;
    this.tireCount = 4;
    this.year = year;
  }

  public void drive() {
    if (!this.isOn) {
      System.out.println("Turn the car on first.");
    } else {
      System.out.println("Moving!");
    }
  }

  public void setOn(boolean on) {
    if (this.isOn && on) {
      System.out.println("Screech");
    } else if (!this.isOn && !on) {
      System.out.println("Radio starting...");
    } else {
      this.isOn = on;
    }
  }

  public void toggleOn(boolean on) {
    this.isOn = !this.isOn;
  }

  public String toString() {
    return "You are driving a " + this.color + " " + this.year + " " + this.model + ".";
  }

  public void displayDetails() {
    System.out.printf("You are driving a %s %s %s", this.color, this.year, this.model);
  }
}
