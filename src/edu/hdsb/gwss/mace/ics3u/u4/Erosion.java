/*
 * Name:    Mace Barihi
 * Date:    Oct. 31, 2014
 * Version: v0
 * Description:
 *  This program outputs a number of years which represents how many years it take for Canada's topsoil to be
 *  less than 9cm which is how shallow the topsoil has to be for it to not be able to produce crops on a large
 *  scale based off of the information that Canada's topsoil is 30cm and 1% is removed each year.
 */
package edu.hdsb.gwss.mace.ics3u.u4;

/**
 *
 * @author meisambarihi
 */
public class Erosion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // VARIABLES
        int years = 0;
        // INPUT; Ask, Get
        // Introduction
    System.out.print("Topsoil Erosion\n\nCareless land management causes approximately 1% of the topsoil to erode\neach year. It is then lost forever, since it takes nature approximately\n500 years to produce 2.5cm of topsoil. At 9cm, the topsoil is so shallow\nthe crops cannot grow on a large scale. If Canada has about 30cm of\ntopsoil, how many years will it take for the depths to be reduced to 9cm?\n\n");
    
    for ( double topsoil = 30; topsoil > 9; years++){   //topsoil initialized to a value of 30. 1% of the topsoil is removed each year, (years value goes up by one also), until topsoil remains over 9cm
        topsoil = topsoil - topsoil*0.01;
    }
    //How many years it takes for topsoil to be below 9cm is outputted in a complete sentence.
    System.out.print("It will take " + years + " years for the soil to erode to a depth such that crops\nwill not grow.");
     }
    
}
