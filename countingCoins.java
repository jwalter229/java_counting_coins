/** ****************************************************************************
 * enumerateCountingCoins.java
 * Programmer: @author Kevin Bell
 * Version: 1.0
 * Course: SDEV 2220
 * Program practices use of enumeration, ternary statements, & for-each loops
 **************************************************************************** */
package javaapplication8;

import java.util.*;

public class JavaApplication8 {

    public enum Coin {
        QUARTER, DIME, NICKEL, PENNY
    } // end enum Coin
//******************************************************************************

    public static void main(String[] args) {
        //creating a new scanner
        Scanner computerKeyboardInput = new Scanner(System.in);
        System.out.println("Chapter 12 Coins by Kevin Bell \n");

        //prompting the user to enter how many Quarters
        System.out.print("How many coins are a QUARTER? ");
        //taking input from a user into the scanner
        double quarters = computerKeyboardInput.nextDouble();

        //prompting the user the enter how many Dimes
        System.out.print("How many coins are a DIME? ");
        //taking input from a user into the scanner
        double dimes = computerKeyboardInput.nextDouble();

        //prompting the user the enter how many Nickels
        System.out.print("How many coins are a NICKEL? ");
        //taking input from a user into the scanner
        double nickels = computerKeyboardInput.nextDouble();

        //prompting the user the enter how many Pennies
        System.out.print("How many coins are a PENNY? ");
        //taking input from a user into the scanner
        double pennies = computerKeyboardInput.nextDouble();

        System.out.print("How much do you think this pile of coins is worth? $");
        double guess = computerKeyboardInput.nextDouble();

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

        /*  for (enum c : Coin){
                System.out.print(c);
        } // end for each loop */
        int[] primes = {2, 3, 5, 7, 11, 13};

        for (int p : primes) {
            System.out.print("");
        } // end for-each loop

        //displaying the total of all coins
        String total_string = String.format("%2.2f", total);

        /*  if (guess == total) {
            System.out.println("You are correct");
        } else {
            System.out.println("You are incorrect");
        } // end if/else statement */
        String ternaryOutput = (guess == total) ? "You are correct" : "You are incorrect";
        System.out.println(ternaryOutput);
        System.out.println("Total worth of those coins is $" + total);
    }//end of main block
}//End Class
