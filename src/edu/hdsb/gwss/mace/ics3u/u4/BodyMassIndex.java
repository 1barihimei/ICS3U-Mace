package edu.hdsb.gwss.mace.ics3u.u4;

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author meisambarihi
 */
public class BodyMassIndex {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // CONSTANTS 

        // VARIABLES
        double weightLbs;
        double weightKgs = 0;
        double heightCm = 0;
        double heightInches;
        double bmi;

// OBJECTS
        Scanner input = new Scanner(System.in);

// INPUT; Ask, Get
        System.out.print("BMI Mass Index Calculator\n\nBody mass index (BMI) is a measure of the weight of a person scaled according to their height.\nBMI is defined as the individual's body weight divided by the square of their height.\nIt is almost always expressed in the unit kg/m2.\n\n");
        System.out.print("You can enter height in either Inches or Centimeters.\nInput '0' for Centimeters to use Inches:\n\nHeight Centimeter  : ");
        heightCm = input.nextInt();
        if (heightCm == 0) {
            System.out.print("Height Inches  : ");
            heightInches = input.nextInt();
            heightCm = heightInches / 2.54;

        }
        System.out.print("\nYou can enter weight in either Kilograms or Pounds.\nInput '0' for Kilograms to use Pounds:\n\nWeight Kilograms  : ");
        weightKgs = input.nextInt();
        if (weightKgs == 0) {
            System.out.print("Weight Pounds  : ");
            weightLbs = input.nextInt();
            weightKgs = weightLbs * 2.2046226;
        }
        bmi = weightKgs / ((heightCm / 100) * (heightCm / 100));
        System.out.print("\n\nYour BMI Mass Index is  : " + bmi + " kg/m²\n");

    }

}
