import java.util.Scanner;

/*
 * Name:    Mace Barihi
 * Date:    Oct. 20, 2014
 * Version: v0
 * Description:
 *  This program asks the user to enter the number of years (up to 15 years),
 *  the amount invested per year, and interest rate and creates a total for each year and displays a chart.
 */
public class CompoundInvesting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // VARIABLES
        
        double investment;      //Amount added consistantly each year 
        double interestRate;    //Percentage of total from the previous year added to current year
        int years;              //Period of time
        double total;           //Interest and investment sum
        double amount;          //Total prior to the addition of that year's interest
        double interest;        //Amount of money the percentage is worth

        // OBJECTS
        Scanner input = new Scanner(System.in);

        // INPUT; Ask, Get
        //Introduction
        System.out.print("Compound Investing \n\nThis program will print out a little table that will display the \namount of a yearly investment over a period of up to 15 years.\n\n");
        System.out.print("Enter the yearly investment :\t");    
        investment = input.nextDouble();                        //asking user to unput the yearly investment
        System.out.print("Enter the interest rate (%) :\t");    
        interestRate = input.nextDouble();                      //asking user to input the interest rate
        System.out.print("Enter the number of years :\t");
        years = input.nextInt();                                //asking user to input the amount of years
        System.out.format("%-15s %15s %15s %13s\n", "\nYear", "Amount in Account", "Interest", "Total");    //The header of the chart
        
        amount = investment;    //so the first value for amount in account is 100 and the interest isn't added

        for (int yearCount = 1; yearCount <= years; yearCount++) {  //until the number of years is equal to or less than the inputted year by the user...
            total = (interestRate / 100) * amount + amount;     //the total is equal to the amount plus the interest
            interest = amount * (interestRate / 100);           //interest is equal to the amount mupltiplied by the interest rate as a decimal
            System.out.format("%-15s     $%5.2f \t\t$%1.2f      \t$%5.2f\n", yearCount, amount, interest, total); //the data is outputted in a neat format
            amount = total + investment;    //the new amount is equal to the last total plus the yearly investment

        }
    }
}
