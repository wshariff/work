/* Author: Waheeda Shariff
   Date: 05/10/2018 */
import java.util.Scanner; 
// This is a program that rand number genrator to tell hunger level of dinosaur 
  class jurassic {
       public static void main ( String [] args) {


	JurassicWorld();
	NameSpecies();
	System.exit(0);

	}// END main

	public static void JurassicWorld()
        {
	
	System.out.println("This is a program that stimulates bio-engineered dinosaurs who need you to look after them.");
	System.out.println(" ");
	
	return;
        }// END JurassicWorld
	
	public static void NameSpecies()
        {

        Scanner newname1 = new Scanner( System.in );
        String dinosaur1;
        System.out.println("Please name the species of your dinosaur.");
        dinosaur1 = newname1.next( );
        System.out.println( dinosaur1 + " are cool. ");
	
	return;
	}// END JurassicWorld
               }// END jurassic
