package OOP;

import java.util.Scanner;
import java.util.spi.AbstractResourceBundleProvider;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Car audi = new Car();
        Car bentley = new Car();
        Car range_rover = new Car();
        Car mercedes = new Car();

        audi.setColor("Grey");
        audi.setModel("A4");
        audi.setType("Sedan");
        audi.setTopSpeed(225);
        audi.setYear(2017);

        bentley.setModel("Continental");
        bentley.setTopSpeed(280);
        bentley.setColor("Black");
        bentley.setType("Coupe");
        bentley.setYear(2020);

        range_rover.setModel("Evoque");
        range_rover.setType("SUV");
        range_rover.setColor("White");
        range_rover.setTopSpeed(200);
        range_rover.setYear(2019);

        mercedes.setModel("E300");
        mercedes.setColor("Navy");
        mercedes.setType("Sedan");
        mercedes.setTopSpeed(270);
        mercedes.setYear(2021);

        System.out.println("Available Cars:\n1.Mercedes\n2.Range Rover\n3.Bentley\n4.Audi");
        System.out.println("Select one to get detailed information about the car.");
        int selection = sc.nextInt();
        switch (selection) {
            case 1:
                System.out.println("Model: " + mercedes.getModel());
                System.out.println("Year: " + mercedes.getYear());
                System.out.println("Color: " + mercedes.getColor());
                System.out.println("Type: " + mercedes.getType());
                System.out.println("Top Speed: " + mercedes.getTopSpeed());
                break;
            case 2:
                System.out.println("Model: " + range_rover.getModel());
                System.out.println("Year: " + range_rover.getYear());
                System.out.println("Color: " + range_rover.getColor());
                System.out.println("Type: " + range_rover.getType());
                System.out.println("Top Speed: " + range_rover.getTopSpeed());
                break;
            case 3:
                System.out.println("Model: " + bentley.getModel());
                System.out.println("Year: " + bentley.getYear());
                System.out.println("Color: " + bentley.getColor());
                System.out.println("Type: " + bentley.getType());
                System.out.println("Top Speed: " + bentley.getTopSpeed());
                break;
            case 4:
                System.out.println("Model: " + audi.getModel());
                System.out.println("Year: " + audi.getYear());
                System.out.println("Color: " + audi.getColor());
                System.out.println("Type: " + audi.getType());
                System.out.println("Top Speed: " + audi.getTopSpeed());
                break;
            default:
                System.out.println("You did not make a valid selection");
                break;
        }
    }
}
