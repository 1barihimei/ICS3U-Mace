/*
 * Name:    Mace Barihi
 * Date:    Oct. 23, 2014
 * Version: v0
 * Description:
 *  This program simulates how much food is availale per animal in a lab. Every hour, the number of animals double
 *  and eat. Each meal is represented as 1 in the food variable. Every hour, the inputted amount of food that is
 *  to be increased is added to the amount of food and the amount of animals subtracted as they eat every hour.
 *  The program will run until the amount of animals is greater than the amount of food, meaning the food ran out.
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
        int population;             //The population of lab animals by the end of the hour
        int lastPopulation = 0;     //The population of lab animals at the start of the hour
        int food;                   //The amount of food by the end of the hour
        int lastFood;               //The amount of food at the start of the hour
        int foodIncrease;           //The amount the food increases by every hour

        // OBJECTS
        Scanner input = new Scanner(System.in);

        // INPUT; Ask, Get
        
        // Introduction
        System.out.print("Lab Animals\n\nAt present there are X animals in the lab and enough food for Y animals.\nAt the end of every hour, the population doubles and enough food is added\nto support Z more animals. During any hour, the animals will eat enough \nfood for only themselves. The program will determine when the population \nwill outgrow the food supply.\n\n");
        
        System.out.print("Enter the initial population  (X) :          ");  //User is asked to unput the starting population
        lastPopulation = input.nextInt();
        System.out.print("Enter the food supply  (Y) :                 ");  //User is asked to input the starting food supply
        lastFood = input.nextInt();
        System.out.print("Enter the amount of food to add every hour : ");  //User is asked to input amount of food increase every hour
        foodIncrease = input.nextInt();

        //The headings of the chart are formatted to be evenly placed out
        System.out.format("\n%-7s | %15s | %13s | %10s | %15s\n", "\nHours", "Animals at Start", "Food at Start", "Food at End", "Animals at End");
        
        food= lastFood;             //The food by the end of the hour is initialized as the food from the beginning of the hour
        population = lastPopulation;//The population by the end of the hour is also initialized as the same population from the beginning of the hour
        
        //The data that will be filling the chart under the headings are formatted to be centered in each column and the first line is printed so the inputted numbers don't interfere with the loop
        System.out.format("  %-4s | %8s         | %7s       |  %6s     | %7s\n", "1", lastPopulation, lastFood, food + foodIncrease - population, population*2);
        lastPopulation = lastPopulation*2;          //lastPopulation is doubled coming into the loop
        food = food - population + foodIncrease;    //food is changed to what it would be by the end of the hour coming into the loop
        lastFood = food;                            //lastFood is changed to food coming into the loop
        
        //hours is initialized and is given a value of 2 as the first hour is already printed above, as long as the population is less than the amount of food...
        for (int hours = 2; population < food; hours++) {   //hours increases by 1
       
            food = food + foodIncrease - lastPopulation;    //food is increased by the inputted amount and decreased by the population
            population = lastPopulation * 2;                //population at the end of the hour becomes double the population at the beginning of the hour 
            
            //The data that will be filling the chart under the headings are formatted to be centered in each column
            System.out.format("  %-4s | %8s         | %7s       |  %6s     | %7s\n", hours, lastPopulation, lastFood, food , population);    
            lastPopulation = population;    //The population at the beginning of the next hour changes to the population at the end of the previous hour
            lastFood = food;                //The food at the beginning of the next hour changes to the food at the end of the previous hour
        }  
    }

}
