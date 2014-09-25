/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author meisambarihi
 */
public class RestaurantTab {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double subtotal = 1.99;
        double tax = 0.13;
        double total = ((1 + tax) * subtotal);

        System.out.println("Subtotal:" + subtotal);
        System.out.println("Tax:" + tax);
        System.out.println("\t ____________");
        System.out.println("\t Total:" + total);

    }

}
