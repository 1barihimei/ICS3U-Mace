/*
 * Name:    Mace Barihi
 * Date:    Sept. 18, 2014
 * Version: v0
 * Description:
 *  This code prints "Hello World" to the output window.
 */

package edu.hdsb.gwss.mace.ics3u.u3;

/**
 *^
 * @author meisambarihi
 */
public class HelloWorld {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   
    System.out.format("%-20s | %5s | %7s | %6s", "Team Name", "Wins", "Losses", "Draws \n \n");
    System.out.println("----------------------------------------------");
    System.out.format("%-20s | %5s | %7s | %6s", "Toronto" , "20" , "2" , "2\n"); 
 System.out.format("%-20s | %5s | %7s | %6s", "Chicago" , "12" , "7" , "4\n");
 System.out.format("%-20s | %5s | %7s | %6s", "Boston" , "14" , "5" , "2\n");
 System.out.format("%-20s | %5s | %7s | %6s", "New York" , "16" , "11" , "1\n");
 System.out.format("%-20s | %5s | %7s | %6s", "Brooklyn" , "5" , "18" , "0\n");
    }
    
}
