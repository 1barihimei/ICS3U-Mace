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
        // TODO code application logic here

        // VARIABLES
        int lastNumber = 0;

        // INPUT; Ask, Get
        System.out.print("Fibonacci Series\n\nThis program will print the first twenty terms of the Fibonacci Series.\n\n");
        for (int currentNumber = 1; currentNumber <= 10000;) {
            System.out.print(currentNumber + ", ");
            currentNumber = lastNumber + currentNumber;
            lastNumber = currentNumber - lastNumber;
        }
    }

}
