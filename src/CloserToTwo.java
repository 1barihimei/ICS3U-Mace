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
        double lastNumber = 1;
        double divisionNumber = 2;
        double total = 1;

        // INPUT; Ask, Get
        System.out.print("Closer to Two \nThis program demonstrates that the result of adding the number 1, 1/2, 1/4, 1/16 ...  \nand so on gets closer to 2 without becoming 2.\n\n");
        System.out.print("0.0 + 1/1 = 1.0\n");
        for (; total < 2;) {
            total = total + 1 / divisionNumber;
            System.out.print(lastNumber + " + " + "1/" + divisionNumber + " = " + total + "\n");

            divisionNumber = divisionNumber * 2;
            lastNumber = total;
        }
    }
}
