/*counting the coins in a jar 
prompting the user to enter the number of 
quarters, dimes, nickels, and pennins in a jar.
then finding the total amount of dollars in each and their
combined total
*/   
   //importing a scanner
   import java.util.Scanner;

//Name of the Class
public class Practice_2_5 {

   //Main Method
   public static void main(String[] args) {
   
      //creating a new scanner
      Scanner input = new Scanner(System.in);
      
      //prompting the user to enter how many Quarters
      System.out.println("Enter how many quarters are in the jar: ");
      //taking input from a user into the scanner
      double quarters = input.nextDouble();
      
      //prompting the user the enter how many Dimes
      System.out.println("Enter how many dimes are in the jar: ");
      //taking input from a user into the scanner
      double dimes = input.nextDouble();
      
      //prompting the user the enter how many Nickels
      System.out.println("Enter how many nickels are in the jar: ");
      //taking input from a user into the scanner
      double nickels = input.nextDouble();
      
      //prompting the user the enter how many Pennies
      System.out.println("Enter how many pennies are in the jar: ");
      //taking input from a user into the scanner
      double pennies = input.nextDouble();
      
      //displaying how many Quarters, Dimes,
      //Nickels and pennies are in the jar
      System.out.println("Quarters:  " + (int)quarters);
      System.out.println("Dimes: " + (int)dimes);
      System.out.println("Nickels:  " + (int)nickels);
      System.out.println("Pennies:  " + (int)pennies);
      
      
      //using the inputs to calculate value of each group of coin
      double quartVal = quarters * .25;//calculating value of all quarters
      String quartVal_string = String.format("%2.2f", quartVal);
      
      double dimeVal = dimes * .10;//calculating value of all dimes
      String dimeVal_string = String.format("%2.2f", dimeVal);
      
      double nickVal = nickels * .05;//calculating value of all nickels
      String nickVal_string = String.format("%2.2f", nickVal);
      
      double pennyVal = pennies * .01;//calculating value of all pennies              
      String pennyVal_string = String.format("%2.2f", pennyVal);
      
      //displaying the value of each group of coin
      System.out.println("Value of quarters: $" + quartVal_string);
      System.out.println("Value of dimes:  $" + dimeVal_string);
      System.out.println("Value of nickels: $" + nickVal_string);
      System.out.println("Value of pennies: $" + pennyVal_string);
      
      //calculating the total value of all coin
      double total = quartVal + dimeVal + nickVal + pennyVal;
      int total_dollars = (int) total;
      int total_cents = (int)((total % 1) * 100);      
            
      //displaying the total of all coins
      String total_string = String.format("%2.2f", total);
      System.out.println("Total: $" + total);
      System.out.println("Total: " + total_dollars + " dollars and " + total_cents + " cents");      
   
   }//end of main block
   
}//End Class Practice_2_5   
