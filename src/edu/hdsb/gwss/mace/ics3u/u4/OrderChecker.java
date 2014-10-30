package edu.hdsb.gwss.mace.ics3u.u4;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author meisambarihi
 */
import java.text.NumberFormat;
import java.util.Scanner;

public class OrderChecker {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        // CONSTANTS
        double boltCost = 0.05;
        double nutCost = 0.03;
        double washerCost = 0.01;

        // VARIABLES
        double washersNumber, boltNumber, nutsNumber, total;
        boolean valid = true;

        // OBJECTS
        Scanner input = new Scanner(System.in);
        NumberFormat moneyFormat = NumberFormat.getCurrencyInstance();

        // INPUT; Ask, Get
        System.out.print("Total number of BOLTS   : ");
        boltNumber = input.nextInt();
        System.out.print("Total number of NUTS    : ");
        nutsNumber = input.nextInt();
        System.out.print("Total number of WASHERS : ");
        washersNumber = input.nextInt();

    }

}
