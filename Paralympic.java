import java.util.Scanner;

class Paralympic {

	public static void main (String[] p) {

		disability();

	}

	public static void disability () {
		
		Scanner scanner = new Scanner (System.in);
		System.out.println ("What is classification (maximum points) of this relay event?");

		int maxpoint = scanner.nextInt();
		int disability= 0;
		int total = 0; 
		
		for (int i = 1; i<=4; i++) {
			
			System.out.println("What is the disability category of the Swimmer " + i); 
			disability= scanner.nextInt();
			total = total + disability;
		}
		
		if( total == maxpoint) {

		System.out.println("That team has " + total + " points so it is legal.");
 
		}
		
		else {
			System.out.println("That team has " + total + "points so it is NOT legal.");
		}	
			
		

	}


	
}

