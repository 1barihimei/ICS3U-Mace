/*
 * Name:    Mace Barihi
 * Date:    Oct. 20, 2014
 * Version: v0
 * Description:
 *  This program demonstrates that the result of adding the numbers 1, 1/2, 1/4, 1/16, ... 
 *  and so on gets closer to 2 without becoming 2.
 */
public class CloserToTwo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // VARIABLES
        double lastNumber = 1;      //The previous total which will be added to the fraction to create the new total
        double divisionNumber = 2;  //The number that increases by multiples of 2 
        double total = 1;           //The total at the right of the outputted text

        // INPUT; Ask, Get
        //Introduction
        System.out.print("Closer to Two \nThis program demonstrates that the result of adding the number 1, 1/2, 1/4, 1/16 ...  \nand so on gets closer to 2 without becoming 2.\n\n");
        //First line printed out manually so it wouldn't interfere with programming
        System.out.print("0.0 + 1/1.0 = 1.0\n");
        for (; total < 2;) {                        //As long as the total is less than 2...
            total = total + 1 / divisionNumber;     //Total is added by 1 divided by the current multiple of 2 as the division denominator 
            System.out.print(lastNumber + " + " + "1/" + divisionNumber + " = " + total + "\n");    //A line will be printed in the format of "previous number + 1/current multiple of 2 = total"

            divisionNumber = divisionNumber * 2;    //Division number increases by a 2 times each time
            lastNumber = total;                     //The "previous number" changes to the last total
        }
    }
}
