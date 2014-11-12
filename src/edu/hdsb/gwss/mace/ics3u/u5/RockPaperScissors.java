/*
 * Name:    Mace Barihi
 * Date:    Nov. 11, 2014
 * Version: v0
 * Description:
 *  This program allows the user to compete against the computer in a game of rock paper scissors
 */
package edu.hdsb.gwss.mace.ics3u.u5;

import java.util.Scanner;

/**
 *
 * @author meisambarihi
 */
public class RockPaperScissors {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // VARIABLES
        String playAgain;
        String move;

        // OBJECTS
        Scanner input = new Scanner(System.in);

        // INPUT; Ask, Get
        System.out.println("Make your move by typing in either rock, paper, or scissors.\n");   //Instruction

        for (boolean playOn = true; playOn = true;) {   //boolean playOn declaired, it is used to see if the for loop will continue

            move = input.next();                        //the move string will be changed to what the user types in

            int compMove = (int) (Math.random() * 3) + 1;      //random integer between 1 and 3 is chosen and assigned to variable compMove

            if (compMove == 1) {                        //if the assigned integer is 1
                System.out.println("Rock\n");           //"Rock" will be printed
            } else if (compMove == 2) {                 //if the assigned integer is 1
                System.out.println("Paper\n");          //"Paper" will be printed
            } else if (compMove == 3) {                 //if the assigned integer is 1
                System.out.println("Scissors\n");       //"Scissors" will be printed
            }
            if (move.equalsIgnoreCase("rock")) {        //If the player chose rock...
                if (compMove == 1) {                    //and the computer chose rock...
                    System.out.println("Tie");          //"Tie" is printed.
                } else if (compMove == 2) {             //If the computer chose paper...
                    System.out.println("You lose");     //"You lose" is printed.
                } else if (compMove == 3) {             //If the computer chose scissors...
                    System.out.println("You win");      //"You win" is printed.
                }
            }
            if (move.equalsIgnoreCase("paper")) {       //If the player chose paper...
                if (compMove == 1) {                    //and the computer chose rock...
                    System.out.println("You win");      //"You win" is printed.
                } else if (compMove == 2) {             //If the computer chose paper...
                    System.out.println("Tie");          //"Tie" is printed.
                } else if (compMove == 3) {             //If the computer chose scissors...
                    System.out.println("You lose");     //"You lose" is printed.
                }
            }
            if (move.equalsIgnoreCase("scissors")) {    //If the player chose scissors...
                if (compMove == 1) {                    //and the computer chose rock...
                    System.out.println("You lose");     //"You lose" is printed.
                } else if (compMove == 2) {             //If the computer chose paper...
                    System.out.println("You win");      //"You win" is printed.
                } else if (compMove == 3) {             //If the computer chose scissors...
                    System.out.println("Tie");          //"Tie" is printed.
                }
            }

            System.out.println("\nDo you want to play again? (yes/no)");    //user is asked if they want to play again and demanded to input yes or no
            playAgain = input.next();

            if (playAgain.equalsIgnoreCase("no")) {     //If they say no, playOn will be false and the loop will end
                playOn = false;
            } else {                //Otherwise, the player is demanded for their next move
                System.out.println("Please enter Rock, Paper, or Scissors.\n");

            }

        }
        System.out.println("\nThank you for playing."); //if the playOn is false meaning the loop ends, the user will recieve this message
    }

}
