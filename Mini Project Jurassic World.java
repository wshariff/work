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
    }// END main

    public static void jurassicWorld(){
    
    System.out.println("This is a program that stimulates bio-engineered dinosaurs who need you to look after them.");
    System.out.println(" ");
  
    return;
    }// END JurassicWorld
    
    public static void nameSpecies(){
  
      Scanner newname1 = new Scanner( System.in );
      String dinosaur1;
      System.out.println("Please name the species of your dinosaur below.");
      dinosaur1 = newname1.next( );
      System.out.println( dinosaur1 + " are cool. ");
  
      return;
    }
  
    public static int setHungerLevel() {
    
    int min = 0;
    int max = 9;
    
    Random rand = new Random();
  
    int hungerLevel = rand.nextInt((max - min) + 1) + min;
    
    return hungerLevel;
    }
        
  }
  