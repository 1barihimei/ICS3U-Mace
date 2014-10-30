/*
 * Name:    Mace Barihi
 * Date:    Oct. 23, 2014
 * Version: v0
 * Description:
 *  This program is a slot machine simulation. 3 numbers ranging from 1-4 are randomely generated.
 *  If all three numbers are 1's, 2's, 3's, and 4's, 4, 6, 8, and 10 points are awarded respectively.
 *  The user is asked if they want to continue spinning or saving their score at the end of every spin.
 */
package edu.hdsb.gwss.mace.ics3u.u4;

import java.util.Scanner;

/**
 *
 * @author meisambarihi
 */
public class LabAnimals {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //VARIABLES
        int population;
        int food;
        int foodIncrease;

        // OBJECTS
        Scanner input = new Scanner(System.in);

        // INPUT; Ask, Get
        // Introduction
        System.out.print("Lab Animals\n\nAt present there are X animals in the lab and enough food for Y animals.\nAt the end of every hour, the population doubles and enough food is added\nto support Z more animals. During any hour, the animals will eat enough \nfood for only themselves. The program will determine when the population \nwill outgrow the food supply.\n\n");
        
        System.out.print("Enter the initial population  (X) :          ");
        population = input.nextInt();
        System.out.print("Enter the food supply  (Y) :                 ");
        food = input.nextInt();
        System.out.print("Enter the amount of food to add every hour : ");
        foodIncrease = input.nextInt();

        System.out.format("%-7s | %15s | %13s | %10s | %15s\n", "\nHours", "Animals at Start", "Food at Start", "Food at End", "Animals at End");
        for (int hours = 1; population < food; hours++) {  
            
            
        }  
    }

}
