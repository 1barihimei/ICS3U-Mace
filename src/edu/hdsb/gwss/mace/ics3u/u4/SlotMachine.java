package edu.hdsb.gwss.mace.ics3u.u4;

/*
 * Name:    Mace Barihi
 * Date:    Oct. 26, 2014
 * Version: v0
 * Description:
 *  This program is a slot machine simulation. 3 numbers ranging from 1-4 are randomely generated.
 *  If all three numbers are 1's, 2's, 3's, and 4's, 4, 6, 8, and 10 points are awarded respectively.
 *  The user is asked if they want to continue spinning or saving their score at the end of every spin.
 */
import java.util.Scanner;

public class SlotMachine {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //VARIABLES
        boolean gameOver = false;   //boolean that determines if they game continues or not
        int slot1, slot2, slot3;    //the 3 slots that are later given a random value in the for loop
        String playAgain;           //the string that the user inputs when asked if they want to play again

        // OBJECTS
        Scanner input = new Scanner(System.in);

        // INPUT; Ask, Get
        // Introduction
        System.out.print("Slot Machine\n\nThis program will randomly generate 3 numbers ranging from 1 to 4. \nIf all three numbers are 1's, 2's, 3's, and 4's, \n4, 6, 8, and 10 points are awarded respectively.\n\n");
        System.out.format("Slots         Coins\n");                     //headings are printed
        for (int coins = 50; gameOver == false; coins = coins - 1) {    //coins initialized to a value of 50 at the start, as long as gameOver is false the program will run, and each loop coins value goes down by 1 
            
            //random numbers between 1-4 generated for each slot
            slot1 = (int) (Math.random() * 4) + 1;
            slot2 = (int) (Math.random() * 4) + 1;
            slot3 = (int) (Math.random() * 4) + 1;

            if (coins == 0) {       //when coins reaches 0 the game is over
                gameOver = true;
            }
            if (slot1 == 1 && slot2 == 1 && slot3 == 1) {           //if all slots are 1, 4 coins are added
                coins = coins + 4;
            } else if (slot1 == 2 && slot2 == 2 && slot3 == 2) {    //if all slots are 2, 6 coins are added
                coins = coins + 6;
            } else if (slot1 == 3 && slot2 == 3 && slot3 == 3) {    //if all slots are 3, 8 coins are added
                coins = coins + 8;
            } else if (slot1 == 4 && slot2 == 4 && slot3 == 4) {    //if all slots are 4, 10 coins are added
                coins = coins + 10; 
            }
            System.out.print(" " + slot1 + "" + slot2 + "" + slot3 + "");   //each slot is printed side by side under the "slots" heading
            System.out.print("           " + coins);                        //a space is put so the number of coins are printed under the "coins" heading
            System.out.print("          Play again? (Type 'yes' or 'no') : ");  //user is asked if they would like to play again
            playAgain = input.next();                                           //an input is required from the user
            if(playAgain.equalsIgnoreCase("no")) {                              //if the user inputs "no", the game ends. The input isn't case sensitive
                gameOver = true;
                System.out.print("\nCongratulations, you finished with " + coins + " coins." ); //if the user inputs "no", they recieve this message with the amount of coins they finished with
            }
            
        }

    }

}
