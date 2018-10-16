/* Author: Waheeda Shariff
   Date: 05/10/2018 */
    import java.util.Scanner; 
    import java.util.Random; 
    // This is a program that rand number genrator to tell hunger level of dinosaur 
  public class Jurassic {
  public static void main ( String [] args) {

      jurassicWorld();
      nameSpecies();
      setHungerLevel();
      checkHungerLevel();
			
    }// END main

    public static void jurassicWorld(){
    
    System.out.println("This is a program that stimulates bio-engineered dinosaurs who need you to look after them.");
    System.out.println(" ");
  
    return;
    }// END JurassicWorld

//Ask question- what their dinosaur's eating type is? 
//Create if statement for the eating type of the dinosaur- omnivore...
     public static void nameSpecies(){
  
	Scanner newname1 = new Scanner( System.in );
	String dinosaur1;
	System.out.println("Please name the species of your dinosaur below.");
	dinosaur1 = newname1.next( )
	System.out.println(dinosaur1 + " are cool. ");

      	return;
    }
  
    public static int setHungerLevel() {
    
    int min = 0;
    int max = 9;
    
    Random rand = new Random();
  
    int hungerLevel = rand.nextInt((max - min) + 1) + min;
    
    return hungerLevel;
    }
	
	public static void checkHungerLevel(String eatingType){
	
	Scanner newname1 = new Scanner( System.in );
	System.out.println("Is" + dinosaur1 " a carnivore, herbivore or omnivore?");
	String eatingType = newname1.next( );

	//hungry dinosaur needs to go hunting 

	

	
	if (hungerLevels.equals (<=5) {
		if (eatingType.contains ("carnivore") | eatingType.contains ("omnivore"))
		{
			System.out.println( dinosaur1 + " is hungry, so it is time to go hunting.");
		}
		
		else
		{
			System.out.println( dinosaur1 + " is hungry, so it is time to go find plants.");
		}
	
	}

	// 
	else if (hungerLevels.equals (hungerlevels >=6) {
	
	System.out.println( dinosaur1 + "  .");
	}
      /*ideas 1)dinosaur is full, can go find somewhere to go sleep or go to sleep.
	2) interspecies rivalry or carnivore attack = dinosaur needs to defend themselves 
	3)
*/
  }
  
