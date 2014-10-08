/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.mace.ics3u.u3;

import java.util.Scanner;

/**
 *
 * @author meisambarihi
 */
public class Triangle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

// CONSTANTS 
        boolean side1Largest = false;
        boolean side2Largest = false;
        boolean side3Largest = false;
// VARIABLES
        double side1;
        double side2;
        double side3;

// OBJECTS
        Scanner input = new Scanner(System.in);

// INPUT; Ask, Get
        System.out.print("Triangle\n\nThree numbers represent the sides of a triangle when the sum of any two sides is greater than the third side.\nThis program has the user enter three lengths of sides and determines whether the figure is a possible triangle \nor not.\n\n");
        System.out.print("Enter Side 1's Length:   ");
        side1 = input.nextInt();
        System.out.print("Enter Side 2's Length:   ");
        side2 = input.nextInt();
        System.out.print("Enter Side 3's Length:   ");
        side3 = input.nextInt();

        if (side1 > side2 && side1 > side3) {
            side1Largest = true;
        } else if (side2 > side3 && side2 > side3) {
            side2Largest = true;
        } else if (side3 > side1 && side3 > side2) {
            side3Largest = true;
        }
        if ((side1Largest == true && side2 + side3 > side1) || (side2Largest == true && side1 + side3 > side2) || (side3Largest == true && side2 + side1 > side3)) {
            System.out.print("These sides can make a triangle.");
        } else {
            System.out.print("These sides cannot make a triangle.");
        }
    }

}
