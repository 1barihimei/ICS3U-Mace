package edu.hdsb.gwss.mace.ics3u.u3;

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
public class LetterCost {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        // TODO code application logic here
        // CONSTANTS 
        // VARIABLES
        double firstClassLetterPrice;
        double firstClassLetterWeight = 0;
        double secondClassLetterPrice;
        double secondClassLetterWeight = 0;
        int firstOrSecond;
        int every50GramsAbove = 50;

// OBJECTS
        Scanner input = new Scanner(System.in);

// INPUT; Ask, Get
        System.out.print("Cost of Mailing a Letter\n\nThis program will calculate the cost of sending a first class or second class letter depending on the mass of\nthe letter.\n\nEnter Letter Class (1 for First Class, 2 for Second Class) :  ");
        firstOrSecond = input.nextInt();
        if (firstOrSecond == 1) {
            System.out.print("Enter the mass of the letter (in grams)  : ");
            firstClassLetterWeight = input.nextInt();
        } else if (firstOrSecond == 2) {
            System.out.print("Enter the mass of the letter (in grams)  : ");
            secondClassLetterWeight = input.nextInt();
        }
        if (firstClassLetterWeight > 0 && firstClassLetterWeight <= 30) {
            System.out.print("The cost of sending a letter is: $0.40");
        } else if (firstClassLetterWeight > 30 && firstClassLetterWeight <= 50) {
            System.out.print("The cost of sending a letter is: $0.60");
        } else if (firstClassLetterWeight > 50 && firstClassLetterWeight <= 100) {
            System.out.print("The cost of sending a letter is: $0.80");
        } else if (firstClassLetterWeight > 100) {
            firstClassLetterPrice = 0.80 + ((firstClassLetterWeight - 100) / every50GramsAbove) * 1.29;
            System.out.print("The cost of sending a letter is: $" + firstClassLetterPrice);
        }
        if (secondClassLetterWeight > 0 && secondClassLetterWeight <= 30) {
            System.out.print("The cost of sending a letter is: $0.30");
        } else if (secondClassLetterWeight > 30 && secondClassLetterWeight <= 50) {
            System.out.print("The cost of sending a letter is: $0.50");
        } else if (secondClassLetterWeight > 50 && secondClassLetterWeight <= 100) {
            System.out.print("The cost of sending a letter is: $0.60");
        } else if (secondClassLetterWeight > 100) {
            secondClassLetterPrice = 0.80 + ((secondClassLetterWeight - 100) / every50GramsAbove) * 1.19;
            System.out.print("The cost of sending a letter is: $" + secondClassLetterPrice);
        }
    }
}
