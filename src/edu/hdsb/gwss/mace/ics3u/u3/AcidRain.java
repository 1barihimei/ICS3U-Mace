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
public class AcidRain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

// CONSTANTS    
// VARIABLES
        double pH;

// OBJECTS
        Scanner input = new Scanner(System.in);

        // INPUT; Ask, Get
        System.out.print("Acid rain is a very important environmental issue.\nIt is of detriment to not only underwater organisms but to land ones as well such as humans.\nThis program if the given pH level in water is safe for the fish.\n\n");
        System.out.print("Enter pH level:   ");
        pH = input.nextInt();

        if (pH >= 6.5 && pH <= 7.5) {
            System.out.print("NEUTRAL - FISH IN STREAMS, RIVERS AND LAKES WILL SURVIVE.");
        } else if (pH <= 6.5 && pH >= 0) {
            System.out.print("TOO ACIDIC - FISH IN STREAMS, RIVERS AND LAKES WILL NOT SURVIVE.");
        } else if (pH >= 7.5 && pH <= 14) {
            System.out.print("TOO ALKALINE - FISH IN STREAMS, RIVERS AND LAKES WILL NOT SURVIVE.");
        } else if (pH > 14 || pH < 0) {
            System.out.print("Invalid pH level entered. pH must be between 0 and 14");
        }

    }

}
