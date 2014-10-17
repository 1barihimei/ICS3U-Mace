/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author meisambarihi
 */
public class OunceGramsGOOD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int oz = 1;

        for (double g = 28.35; oz < 16;) {
            for (; oz < 16; oz++) {
                System.out.format("%7s \t %4.2f\n", oz, g);
                g = g + 28.35;
            }
        }
    }
}
