/*
 * Name:    Mace Barihi
 * Date:    Oct. 20, 2014
 * Version: v1
 * Description:
 *  This code prints numbers 1 to 15 on the left which represent weight in ounces and converts the unit to grams
 *  which are located on the right.
 */

public class OunceGramsGOOD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int oz = 1;    //* Initialized that each ounce is worth 1

        //* each oz is 28.35 grams, until oz is less than 16 the statement will run
        for (double g = 28.35; oz < 16;) {       
            for (; oz < 16; oz++) {     //* until oz is less than 16, oz go up by 1 looping iterate
                
                /* formatted so grams only has two decimal places, 
                 * a tab between the ounces and grams and new line
                */
                System.out.format("%7s \t %4.2f\n", oz, g); 
                
                g = g + 28.35;  /* grams goes up by 28.35 each time
            }
        }
    }
}
