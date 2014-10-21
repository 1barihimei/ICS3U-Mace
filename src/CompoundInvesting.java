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
        double investment;
        double interestRate;
        int years;
        double total;
        double amount;
        double interest;

        // OBJECTS
        Scanner input = new Scanner(System.in);

        // INPUT; Ask, Get
        System.out.print("Compound Investing \n\nThis program will print out a little table that will display the \namount of a yearly investment over a period of up to 15 years.\n\n");
        System.out.print("Enter the yearly investment :\t");
        investment = input.nextDouble();
        System.out.print("Enter the interest rate (%) :\t");
        interestRate = input.nextDouble();
        System.out.print("Enter the number of years :\t");
        years = input.nextInt();
        System.out.format("%-15s %15s %15s %13s\n", "\nYear", "Amount in Account", "Interest", "Total");
        amount = investment;

        for (int yearCount = 1; yearCount <= years; yearCount++) {
            total = (interestRate / 100) * amount + amount;
            interest = amount * (interestRate / 100);
            System.out.format("%-15s     $%5.2f \t\t$%1.2f      \t$%5.2f\n", yearCount, amount, interest, total);
            amount = total + investment;

        }
    }
}
