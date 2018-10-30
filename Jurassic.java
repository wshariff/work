/* Author: Waheeda Shariff
   Date: 05/10/2018 */
import java.util.Scanner; 
import java.util.Random; 
// This is a program that rand number genrator to tell hunger level of dinosaur 
public class Jurassic {
    public static void main ( String [] args) {

        jurassicWorld();
        String dinoName = nameSpecies();
        int hungerLevel = setHungerLevel();
        checkHungerLevel(dinoName , hungerLevel);
            
    }// END main

    public static void jurassicWorld(){

        System.out.println("This is a program that stimulates bio-engineered dinosaurs who need you to look after them.");
        System.out.println(" ");

        return;
    }// END JurassicWorld

//Ask question- what their dinosaur's eating type is? 
//Create if statement for the eating type of the dinosaur- omnivore...
    public static String nameSpecies(){

        Scanner newname1 = new Scanner( System.in );
        String dinosaur1;
        System.out.println("Please name the species of your dinosaur below.");
        dinosaur1 = newname1.next( );
        System.out.println(dinosaur1 + " are cool. ");

        return dinosaur1;
    }

    public static int setHungerLevel( ) {
    
    
        int min = 0;
        int max = 9;
        
        Random rand = new Random();

        int hungerLevel = rand.nextInt((max - min) + 1) + min;
        
        return hungerLevel;
    
    }
    
    public static void checkHungerLevel(String dinoName,int hungerLevel){
    
        Scanner newname1 = new Scanner( System.in );
        System.out.println("Is " + dinoName + " a carnivore, herbivore or omnivore?");
        String eatingType = newname1.next( );

    //hungry dinosaur needs to go hunting 

    // commit changes for herbivore from uni to create loop until correct eating type is entered
	
	// create while loop
        if (hungerLevel <=5) {
            System.out.println (hungerLevel <=5);
            if (eatingType.contains ("carnivore") | eatingType.contains ("omnivore")){
                System.out.println( dinoName + "is hungry, so it is time to go hunting.");
            }

            if (eatingType.contains ("herbivore")) {
                System.out.println( dinoName + " is hungry, so it is time to go find plants.");
            }
                
            else {
                System.out.println("Please enter whether " + dinoName + " is a carnivore, omnivore or herbivore. ");	
            }

        }

    // 
        else if (hungerLevel >=6) {

            System.out.println( dinoName + " is in danger and needs your help.");
            System.out.println("Tyrannosaurus Rex is looking for its next prey and is ready to attack " + dinoName );
        }
     /*ideas 1)dinosaur is full, can go find somewhere to go sleep or go to sleep.
    2) interspecies rivalry or carnivore attack = dinosaur needs to defend themselves 
    3)dinosaur is sick/injured
    4) old dinosaur can't defend itself that well 
    5)ask user how old their dinosaur is
*/
}
}
