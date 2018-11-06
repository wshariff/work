/* Author: Waheeda Shariff
   Date: 04/10/2018 */

import java.util.Scanner;

public class BodyAge {

public static void main (String[] args) {
	Scanner scanner = new Scanner ( System.in );
	String age;
	System.out.println("What is your age?");
	age = scanner.nextLine( );

	// Stores the input value in the variable loanPaid  
	String heartRate;
	System.out.println("What is your resting heart rate??");
	heartRate = scanner.nextLine( );

	// Stores the input value in the variable loanPaid  
	String stretch;
	System.out.println("How far can you stretch?");
	stretch = scanner.nextLine( );

	double dAge = Double.parseDouble(age); 
	double dHeartRate = Double.parseDouble(heartRate); 
	double dStretch = Double.parseDouble(stretch); 
	
	if (dHeartRate < 60) {
		dAge= dAge-4;
		//System.out.println(dAge);
	}

	else if (dHeartRate <=60 && dHeartRate <=64) {
		dAge= dAge-2;
		//System.out.println(dAge);
	}
	
	else if (dHeartRate <=65 && dHeartRate<=75) {
    		dAge= dAge+1;
		//System.out.println(dAge);
	}
 
	else if (dHeartRate >=73) {
		dAge= dAge+2;
		//System.out.println(dAge);
	}

	if (dStretch < 25) {
		dAge= dAge+3;
		//System.out.println(dAge);
	}

    	else if (dStretch <=25 && dStretch <=36) {
		dAge= dAge+2;
		//System.out.println(dAge);
	}

	else if (dStretch == 37) {
		dAge= dAge+0;
		//System.out.println(dAge);
	}
	
	System.out.println("Your body's age is " + +dAge);

}









}

    
