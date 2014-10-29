/*
 * Name:    Mace Barihi
 * Date:    Oct. 23, 2014
 * Version: v0
 * Description:
 *
 */
import java.util.Scanner;

public class SlotMachine {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // CONSTANTS
        //VARIABLES
        boolean gameOver = false;
        int slot1, slot2, slot3;
        String playAgain;

        // OBJECTS
        Scanner input = new Scanner(System.in);

        // INPUT; Ask, Get
        System.out.print("Slot Machine\n\nThis program will randomly generate 3 numbers ranging from 1 to 4. \nIf all three numbers are 1's, 2's, 3's, and 4's, \n4, 6, 8, and 10 points are awarded respectively.\n\n");
        System.out.format("Slots         Coins\n");
        for (int coins = 50; gameOver == false; coins = coins - 1) {
            
            slot1 = (int) (Math.random() * 4) + 1;
            slot2 = (int) (Math.random() * 4) + 1;
            slot3 = (int) (Math.random() * 4) + 1;

            if (coins == 0) {
                gameOver = true;
            }
            if (slot1 == 1 && slot2 == 1 && slot3 == 1) {
                coins = coins + 4;
            } else if (slot1 == 2 && slot2 == 2 && slot3 == 2) {
                coins = coins + 6;
            } else if (slot1 == 3 && slot2 == 3 && slot3 == 3) {
                coins = coins + 8;
            } else if (slot1 == 4 && slot2 == 4 && slot3 == 4) {
                coins = coins + 10;
            }
            System.out.print(" " + slot1 + "" + slot2 + "" + slot3 + "");
            System.out.print("           " + coins);
            System.out.print("          Play again? (Type 'yes' or 'no') : ");
            playAgain = input.next();
            if(playAgain.equalsIgnoreCase("no")) {
                gameOver = true;
                System.out.print("\nCongratulations, you finished with " + coins + " coins." );
            }
            
        }

    }

}
