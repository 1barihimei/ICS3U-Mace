/*
 * Name:    Mace Barihi
 * Date:    Oct. 23, 2014
 * Version: v0
 * Description:
 *  
 */
public class FibinacciSequence {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        // VARIABLES
        int lastNumber = 0;

        // INPUT; Ask, Get
        for (int currentNumber = 1; currentNumber <= 10000;) {
            System.out.print(currentNumber + ", ");
            currentNumber = lastNumber + currentNumber;
            lastNumber = currentNumber - lastNumber;
        }
    }

}
