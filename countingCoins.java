/** ****************************************************************************
 * enumerateCountingCoins.java
 * Programmer: @author Kevin Bell
 * Version: 1.0
 * Course: SDEV 2220
 * This program practices the use of enumeration
 **************************************************************************** */
package javaapplication8;

import java.util.*;

public class JavaApplication8 {

    public static void main(String[] args) {
        //creating a new scanner
        Scanner input = new Scanner(System.in);
        System.out.println("Chapter 12 Coins by Kevin Bell \n");

        //prompting the user to enter how many Quarters
        System.out.print("How many coins are a QUARTER? ");
        //taking input from a user into the scanner
        double quarters = input.nextDouble();

        //prompting the user the enter how many Dimes
        System.out.print("How many coins are a DIME? ");
        //taking input from a user into the scanner
        double dimes = input.nextDouble();

        //prompting the user the enter how many Nickels
        System.out.print("How many coins are a NICKEL? ");
        //taking input from a user into the scanner
        double nickels = input.nextDouble();

        //prompting the user the enter how many Pennies
        System.out.print("How many coins are a PENNY? ");
        //taking input from a user into the scanner
        double pennies = input.nextDouble();

        System.out.print("How much do you think this pile of coins is worth? $");
        double guess = input.nextDouble();

        quarters = (int) quarters;
        dimes = (int) dimes;
        nickels = (int) nickels;
        pennies = (int) pennies;

        //using the inputs to calculate value of each group of coin
        double quartVal = quarters * .25;//calculating value of all quarters
        String quartVal_string = String.format("%2.2f", quartVal);

        double dimeVal = dimes * .10;//calculating value of all dimes
        String dimeVal_string = String.format("%2.2f", dimeVal);

        double nickVal = nickels * .05;//calculating value of all nickels
        String nickVal_string = String.format("%2.2f", nickVal);

        double pennyVal = pennies * .01;//calculating value of all pennies              
        String pennyVal_string = String.format("%2.2f", pennyVal);

        /*
        //displaying the value of each group of coin
        System.out.println("Value of quarters: $" + quartVal_string);
        System.out.println("Value of dimes:  $" + dimeVal_string);
        System.out.println("Value of nickels: $" + nickVal_string);
        System.out.println("Value of pennies: $" + pennyVal_string); 
         */
        
        //calculating the total value of all coin
        double total = quartVal + dimeVal + nickVal + pennyVal;
        int total_dollars = (int) total;
        int total_cents = (int) ((total % 1) * 100);

        //displaying the total of all coins
        String total_string = String.format("%2.2f", total);

        if (guess == total) {
            System.out.println("You are correct");
        } else {
            System.out.println("You are incorrect");
        } // end if/else statement

        System.out.println("Total worth of those coins is $" + total);
    }//end of main block
}//End Class 
