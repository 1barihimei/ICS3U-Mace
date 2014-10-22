/*
 * Name:    Mace Barihi
 * Date:    Oct. 20, 2014
 * Version: v0
 * Description:
 *  
 */
public class CloserToTwo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        double lastNumber = 0;
        int divisionNumber = 0;
        
        // INPUT; Ask, Get
        System.out.print("Closer to Two\nThis program demonstrates that the result of adding the number \n1, 1/2, 1/4, 1/16 ... and so on gets closer to 2 without becoming 2.\n\n");

        for (double total = lastNumber + 1 / divisionNumber; total <= 2;) {
            System.out.print(lastNumber + "+" + "1" + divisionNumber + "=" + total + "\n");
            divisionNumber = divisionNumber * 2;
            lastNumber = total;
        }
    }
}