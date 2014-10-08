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
public class RightTriangle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

// CONSTANTS 
        // VARIABLES
        double side1;
        double side2;
        double side3;

// OBJECTS
        Scanner input = new Scanner(System.in);

// INPUT; Ask, Get
        System.out.print("Right Triangle\n\nA right-angled triangle has the property that when the values of the lengths of the sides are squared, the sum of \ntwo smaller values is equal to the larger value. This program asks the user to enter three values and then \ndetermines whether the triangle created is a right-triangle or not.\n\n");
        System.out.print("Enter Side 1's Length:   ");
        side1 = input.nextInt();
        System.out.print("Enter Side 2's Length:   ");
        side2 = input.nextInt();
        System.out.print("Enter Side 3's Length:   ");
        side3 = input.nextInt();

        if ((Math.sqrt(side1 * side1 + side2 * side2) == Math.sqrt(side3 * side3)) || (Math.sqrt(side2 * side2 + side3 * side3) == Math.sqrt(side1 * side1)) || (Math.sqrt(side1 * side1 + side3 * side3) == Math.sqrt(side1 * side1))) {
            System.out.print("This triangle is a right triangle.");
        } else {
            System.out.print("The side lengths don't make this triangle right.");
        }

    }
}
