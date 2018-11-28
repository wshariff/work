
/* Author: Waheeda Shariff
   Date: 05/10/2018 */
import java.util.Scanner; 
import java.util.Random; 
import java.util.Arrays;

// This is a program that allows users to look after a variety of dinosaurs by feeding and protecting them whilst in danger. 

class Jurassic 
{

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
        //setHealthLevel(dino)
        
    }// END main

    public static void jurassicWorld()
    {
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
        int highHealth = 10;
        dino.healthLevel = highHealth; 
        System.out.println("Health Level is " + dino.healthLevel); 
        System.out.println(dino.name + " is healthy."); 

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
            //Correct input for dinosaur's diet 
            if((eatingType.contains ("carnivore")) ||(eatingType.contains ("omnivore")) || (eatingType.contains ("herbivore")))
            {
                break;
            }
            
            //Error message for incorrect input for dinosaur's diet 
            else
            {
                System.out.println("Please enter whether " + dino.name + " is a carnivore, omnivore or herbivore. ");
                eatingType = newname1.next( );
            }
        }// END while loop		

        //Hungry dinosaur
        if (dino.hungerLevel <=5) 
        {
            System.out.println("Hunger level is "+ dino.hungerLevel); 
            //Dinosaur is hunting
            if (eatingType.contains ("carnivore") || eatingType.contains ("omnivore"))
            {
                System.out.println( dino.name + " is hungry.");
                System.out.println("Would " + dino.name + " like to hunt?");
                Scanner scanner = new Scanner(System.in ); 
                String answer = scanner.nextLine().toLowerCase();
                
                    if (answer.contains ("yes"))
                    {
                        while (answer.contains("yes"))
                        {
                            System.out.println("Get ready in");
                        
                                for(int i = 5; i>0; i--) 
                                {
                                    System.out.println(i);
                                }
                                System.out.println("GO!");
                                System.out.println(dino.name + " has eaten the T-rex!");
                                System.out.println("Hunger Level is " + (dino.hungerLevel + 2));
                                System.out.println(dino.name + " is now full.");
                                break;   
                        }
                    }

                    else if (answer.contains ("no"))
                    {
                        dino.healthLevel = 3;
                        System.out.println("Health Level is " + dino.healthLevel);
                        System.out.println(dino.name + " is sick.");
                    }

                    else {
                        System.out.println("Please enter whether " + dino.name + " ready for a hunt. ");
                        eatingType = newname1.next( );
                    }
                    
            }//END if statement
            

            //Dinosaur is not hunting
            if (eatingType.contains ("herbivore")) 
            {
                System.out.println( dino.name + " is hungry, so it is time to go find plants.");
                System.out.println("That was quick!" + dino.name + " is eating plants.");

                System.out.println("Hunger Level is " + (dino.hungerLevel + 1)); 
            }
        } //END if statement

    // Full dinosaur is then under attack 
        else if (dino.hungerLevel >=6) 
        {
            System.out.println("Hunger level is " + dino.hungerLevel); 
            System.out.println(dino.name + " is not hungry.");
            System.out.println( "But " + dino.name + " is in danger and needs your help.");
            System.out.println("T-Rex is looking for its next prey. ");

            while (true) 
            {
                for (int j=0; j<=4; j++)
                {
                    System.out.println("Do you want to attack?");
                    Scanner scanner = new Scanner(System.in ); 
                    String answer = scanner.nextLine().toLowerCase(); 

                    if (dino.healthLevel<=0)
                    {
                        System.out.println("Health Level is " + dino.healthLevel);
                        System.out.println("GAME OVER");
                    } 

                        int value = dino.healthLevel-1;
                        System.out.print(value);
                        for (int k= 0; k<=dino.healthLevel; k++)
                        {
                            System.out.println("Do you want to attack?");

                            if(answer.contains("yes")){
            
                    
                                answer = scanner.nextLine().toLowerCase();
                                System.out.println("Health Level is " + value--);
                            }
                            else if (answer.contains("no")) {
                                System.out.println("Health Level is " + value);
                                System.out.println(dino.name + " is healthy.");
                                break;
                            }
                            
                            
                        }
                        break;
            }//END while loop
            break;
        }//End else if

            //
            
            
            //Error message for incorrect input for dinosaur's diet 
            /*else
            {
                System.out.println("Please enter whether " + dino.name + " is a carnivore, omnivore or herbivore. ");
                eatingType = newname1.next( );
            }*/ 
    } //END checkHungerLevel
}//END Jurassic
}


        /*ideas 1)dinosaur is full, can go find somewhere to go sleep or go to sleep.
    2) interspecies rivalry or carnivore attack = dinosaur needs to defend themselves 
    3)dinosaur is sick/injured
    4) old dinosaur can't defend itself that well 
    5)ask user how old their dinosaur is

    6) IMPORTANT: Ask user to describe dinosaur (adjectives), description stored in array, for loop limit to 5 adjectives
    6.1) User enters a number, loop for no. of times user to describes dinosaur
    7)Level 7: dino hungry, want to go for a hunt? while (yes), get ready, in ... for loop 5, 4, 3, 2,1,, system.out " Go!"
    7.1) Hungry dino, doesn't want to hunt = sick dino, low healthlevel 
*/

    /*public static int setHealthLevel (Dinosaur dino) 
    {
        Scanner scanner = new Scanner(System.in );
        System.out.println("How old is " + dino.name + " ?")
        dino.age = scanner.nextInt() 
    
        return healthLevel; 
    }//END setHealthLevel*/

class Dinosaur {
    String name;
    int hungerLevel; 
    int age;
    int healthLevel;
}//END Dinosaur class
