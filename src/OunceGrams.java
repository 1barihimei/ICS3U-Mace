/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author meisambarihi
 */
public class OunceGrams {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int oz = 1;
        double g = 28.35;
        while (oz <= 15) {
            System.out.print(oz + "\t" + g + "\n");
            oz++;
            g = g + 28.35;
        }

    }

}