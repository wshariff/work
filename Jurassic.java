/* Author: Waheeda Shariff
   Date: 05/10/2018 */
import java.util.Scanner; 
import java.util.Random; 
import java.util.Arrays;

// This is a program that allows users to look after a variety of dinosaurs by feeding and protecting them whilst in danger. 

class Jurassic {

    public static void main ( String [] args) 
    {
        jurassicWorld();

        Dinosaur dino = new Dinosaur();
        Scanner scanner = new Scanner( System.in );

        System.out.println("Please name the species of your dinosaur."); 
        String name1 = scanner.next();

        setName (dino,name1);
        System.out.println( getName(dino) + " is cool.");
        
        describeDino(dino);
        dino.hungerLevel = setHungerLevel();	
        checkHungerLevel(dino);   
        
    }// END main
	
    public static void jurassicWorld(){

        System.out.println("This is a program that stimulates bio-engineered dinosaurs who need you to look after them.");
        System.out.println(" ");

    }// END JurassicWorld

    //Assigns the name of the dinosaur 
    public static void setName (Dinosaur dino, String name1) 
    {
        dino.name = name1;
    }//END setName

    // Gets the name of the dinosaur
    public static String getName (Dinosaur dino)
    {
        return dino.name;
    }//END getName

    //Describing the dinosaur 
    public static void describeDino(Dinosaur dino) 
    {
    
        //Array for description of dinosaur 
        Scanner scanner = new Scanner(System.in ); 
        String[] adjectives  = new String[3];

        System.out.println("Please enter 3 descriptions of " + dino.name );
        
        // Loop for number of descriptions
        for (int i = 0; i < adjectives.length; i++) 
        {
            adjectives[i] = scanner.nextLine();
            System.out.println(dino.name + " is " + adjectives[i]);
        }//END for loop
    }//END describeDino

    //Setting the hunger level of the dinosaur
    public static int setHungerLevel( ) 
    {
    
        int min = 0;
        int max = 9;
        
        //Random number calculation
        Random rand = new Random();

        int hungerLevel = rand.nextInt((max - min) + 1);
        
        return hungerLevel;
    
    }
    //END setHungerLevel

    //Checking hunger level of dinosaur
    public static void checkHungerLevel(Dinosaur dino)
    {
        // Sets dinosaur's diet
        Scanner newname1 = new Scanner( System.in );
        System.out.println("Is " + dino.name + " a carnivore, herbivore or omnivore?");
        String eatingType = newname1.next( );
    
        //Validating diet input 
        while (true) 
        {
            //Correct diet input
            if((eatingType.contains ("carnivore")) ||(eatingType.contains ("omnivore")) || (eatingType.contains ("herbivore")))
            {
                break;
            }
            
            //Incorrect diet input
            else
            {
                System.out.println("Please enter whether " + dino.name + " is a carnivore, omnivore or herbivore. ");
                eatingType = newname1.next( );
            }
        }// END while loop		

	    //Hungry dinosaur
        if (dino.hungerLevel <=5) 
        {
            //Dinosaur is hunting
            if (eatingType.contains ("carnivore") || eatingType.contains ("omnivore")){
                System.out.println( dino.name + " is hungry, so it is time to go hunting.");
            }

            //Dinosaur is not hunting
            if (eatingType.contains ("herbivore")) {
                System.out.println( dino.name + " is hungry, so it is time to go find plants.");
            }
        } //END if statement

    // Full dinosaur is then under attack 
        else if (dino.hungerLevel >=6) 
        {
            System.out.println( dino.name + " is in danger and needs your help.");
            System.out.println("Tyrannosaurus Rex is looking for its next prey and is ready to attack " + dino.name );
        }
	
     /*ideas 1)dinosaur is full, can go find somewhere to go sleep or go to sleep.
    2) interspecies rivalry or carnivore attack = dinosaur needs to defend themselves 
    3)dinosaur is sick/injured
    4) old dinosaur can't defend itself that well 
    5)ask user how old their dinosaur is

    6) IMPORTANT: Ask user to describe dinosaur (adjectives), description stored in array, for loop limit to 5 adjectives
    6.1) User enters a number, loop for no. of times user to describes animal 
*/
}//END checkHungerLevel
}//END Jurassic class

class Dinosaur {
    String name;
    int hungerLevel; 
}//END Dinosaur class
