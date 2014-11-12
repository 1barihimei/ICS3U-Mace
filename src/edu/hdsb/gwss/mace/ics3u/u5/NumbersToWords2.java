/*
 * Name:    Mace Barihi
 * Date:    Nov. 11, 2014
 * Version: v0
 * Description:
 *  This program converts a user inputted number into the written format of the number.
 */
package edu.hdsb.gwss.mace.ics3u.u5;

import java.util.Scanner;

public class NumbersToWords2 {

       public static void main(String[] args) {

        // OBJECTS
        Scanner input = new Scanner(System.in);
        
        // VARIABLES
        String number;      //variable number is initialized
        // INPUT; Ask, Get
        System.out.print("Input a number from 0 to 99 that will be transferred to the written version"); //User demanded to input number between 0 and 99
        number = input.next();  //number variable assigned to the inputted number


        for (int i = 0; i <= number.length(); i++) {     //variable i initialized to 0, as long as i is less or equal to number's length (1 or less), i will increase by one each loop

            if (number.length() == 1) { //if the number is a double digit number

                if (i == 0) {           // if i is on the first number
                    if (number.charAt(i) == "1") {              //if the first character is 1
                        if (number.charAt(1) == "0") {          //if the second number is 0 then the number is ten
                            System.out.print("Ten");
                        } else if number.charAt(1) == "1") {    //if the second number is 1 then the number is eleven
                            System.out.print("Eleven");
                        } else if number.charAt(1) == "2") {    //if the second number is 2 then the number is twelve
                            System.out.print("Twelve");
                        } else if number.charAt(1) == "3") {    //if the second number is 3 then the number is thirteen
                            System.out.print("Thirteen");
                        } else if number.charAt(1) == "4") {    //if the second number is 4 then the number is fourteen
                            System.out.print("Fourteen");
                        } else if number.charAt(1) == "5") {    //if the second number is 5 then the number is fifteen
                            System.out.print("Fifteen");
                        } else if number.charAt(1) == "6") {    //if the second number is 6 then the number is sixteen
                            System.out.print("Sixteen");
                        } else if number.charAt(1) == "7") {    //if the second number is 7 then the number is seventeen
                            System.out.print("Seventeen");
                        } else if number.charAt(1) == "8") {    //if the second number is 8 then the number is eighteen
                            System.out.print("Eighteen");
                        } else if number.charAt(1) == "9") {    //if the second number is 9 then the number is nineteen
                            System.out.print("Nineteen");
                        }
                    }
                    if (number.charAt(i) == "2") {              //if the first number is 2 then twenty is written
                        System.out.print("Twenty ");
                    } else if (number.charAt(i) == "3") {       //if the first number is 3 then thirty is written
                        System.out.print("Thirty ");
                    } else if (number.charAt(i) == "4") {       //if the first number is 4 then fourty is written
                        System.out.print("Fourty ");
                    } else if (number.charAt(i) == "5") {       //if the first number is 5 then fifty is written
                        System.out.print("Fifty ");
                    } else if (number.charAt(i) == "6") {       //if the first number is 6 then sixty is written
                        System.out.print("Sixty ");
                    } else if (number.charAt(i) == "7") {       //if the first number is 7 then seventy is written
                        System.out.print("Seventy ");
                    } else if (number.charAt(i) == "8") {       //if the first number is 8 then eighty is written
                        System.out.print("Eighty ");
                    } else if (number.charAt(i) == "9") {       //if the first number is 9 then ninety is written
                        System.out.print("Ninety ");
                    }

                }
            }
            if (number == "0") {            //if the number is 0, it will be written as zero
                System.out.print("Zero");
            }

            if (number.length() == 0 || i == 1) {       //if the number is single digit or i is on the second digit if it's double digit
                if (number.charAt(i) == "1") {          //one is written
                    System.out.print("One ");
                } else if (number.charAt(i) == "2") {   //two is written
                    System.out.print("Two ");
                } else if (number.charAt(i) == "3") {   //three is written
                    System.out.print("Three ");
                } else if (number.charAt(i) == "4") {   //four is written
                    System.out.print("Four ");
                } else if (number.charAt(i) == "5") {   //five is written
                    System.out.print("Five ");
                } else if (number.charAt(i) == "6") {   //six is written
                    System.out.print("Six ");
                } else if (number.charAt(i) == "7") {   //seven is written
                    System.out.print("Seven ");
                } else if (number.charAt(i) == "8") {   //eight is written
                    System.out.print("Eight ");
                } else if (number.charAt(i) == "9") {   //nine is written
                    System.out.print("Nine ");
                }
            }

        }

   
       }
}