/* Author: Waheeda Shariff
   Date: 03/10/2018 */


import java.util.Scanner; 
import java.lang.Math;

public class StudentLoan {

    public static void main (String[] args) {
        Scanner input1 = new Scanner( System.in );
        String loanStart;
        System.out.println("How much do you owe at the start of the year? ");
        loanStart = input1.next( );

        String loanPaid;
        System.out.println("How much have you paid off this year?");
        loanPaid = input1.next( );

        double dloanStart = Double.parseDouble(loanStart); 
        double dloanPaid = Double.parseDouble(loanPaid); 
        
        //Calculating the interest 
        Double yearTotal;
        yearTotal = (dloanStart-dloanPaid)*0.063; 

        //Applying the interest 
        Double newTotal;
        newTotal = yearTotal+(dloanStart-dloanPaid);

        //Rounding the value to 2 decimal places 
        Double rounded = Math.round (newTotal*100.0) /100.0; 
        System.out.println("The new loan amount is " + rounded );


    }

}
