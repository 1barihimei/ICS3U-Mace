package edu.hdsb.gwss.mace.ics3u.u4;

/*
 * Name:    Mace Barihi
 * Date:    Oct. 23, 2014
 * Version: v0
 * Description:
 *  This program prints the first twenty terms of the Fibonacci Series.
 */
public class FibonacciSequence {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // VARIABLES
        int lastNumber = 0; //Last number initialized and kept at 0 so number 1 of the series is repeated

        // INPUT; Ask, Get
        //Introduction
        System.out.print("Fibonacci Series\n\nThis program will print the first twenty terms of the Fibonacci Series.\n\n");

        for (int currentNumber = 1; currentNumber <= 10000;) {  //currentNumber which is 1 is introduced, as long as the currentNumber is less than or equal to 10000 (before the 20th number in the series)...
            System.out.print(currentNumber + ", ");             //The currentNumber and a comma and space are outputted
            currentNumber = lastNumber + currentNumber;         //currentNumber is added to the lastNumber
            lastNumber = currentNumber - lastNumber;            //lastNumber becomes the currentNumber minus the lastNumber so it doesnt equal the actual current number, but the previous number
        }
    }

}
