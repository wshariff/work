
/* Author: Waheeda Shariff
   Date: 05/10/2018 */
import java.util.Scanner; 
import java.util.Random; 
import java.util.Arrays;
import java.io.*;
import java.io.IOException;

// This is a program that allows users to look after a variety of dinosaurs by feeding and protecting them whilst in danger. 

class Jurassic 
{
    public static void main ( String [] args) throws FileNotFoundException
    {
        
        jurassicWorld();

        Dinosaur dino = new Dinosaur();
        Scanner scanner = new Scanner( System.in );

        System.out.println("Please name the species of your dinosaur."); 
        String name1 = scanner.next();
        
        setName (dino,name1);
        System.out.println( getName(dino) + " is cool.");
        
        describeDino(dino);
        setHungerLevel(dino);
        getHungerLevel(dino);	
        setHealthLevel(dino);
        getHealthLevel(dino);
        checkHungerLevel(dino);  

        System.out.println("Would you like to save the Dinosaur?");
        Scanner save = new Scanner( System.in );
        String saveAnswer = save.next().toLowerCase();


        //save Dinosaur 
        if (saveAnswer.equals("yes"))
        {
            write(dino);
            read();
        }

        //Exit program
        if (saveAnswer.equals ("no"))
        {
            System.exit (0);
        }
    }

    //Writes the information to the file 
    public static void write(Dinosaur dino)
    {

        //in order to aviod problems with file input and output we need to use try and catch

        try
        {
            FileWriter fw = new FileWriter("hello.txt");    //create a file called hello.txt
            PrintWriter pw = new PrintWriter(fw);         //Printwriter allows us to write to the file which is miniproject.it takes in filewriter object

            String name = getName(dino);
            int healthLevel  = getHealthLevel(dino);
            int hungerLevel = getHungerLevel(dino); 


            // Prints message
            pw.println("Data saved");
            pw.println(name);
            pw.println(hungerLevel);
            pw.println(healthLevel);
            pw.close();            // must close it, after printing it out 
        }

        catch(Exception e)
        {
            System.out.println("Error! File not found" );
        }
        
    }

    //Reads the information to the file 
    public static void read()
    {
        try
        {
            FileReader fr = new FileReader("hello.txt");
            BufferedReader br = new BufferedReader (fr);
            
            String message;

            while((message = br.readLine())!=null)
            {
                System.out.println(message);
            }
            br.close();
        }

        catch(Exception e)
        {
            System.out.println("File is not Found");
        }
    }

    //Introducing the game message
    public static void jurassicWorld()
    {
        System.out.println("This is a program that stimulates bio-engineered dinosaurs who need you to look after them.");
        System.out.println(" ");
    }

    //Sets the name of the dinosaur 
    public static void setName (Dinosaur dino, String name1) 
    {
        dino.name = name1;
    }

    // Gets the name of the dinosaur
    public static String getName (Dinosaur dino)
    {
        return dino.name;
    }

    //Describing the dinosaur 
    public static void describeDino(Dinosaur dino) 
    {
        //Array for description of dinosaur 
        Scanner scanner = new Scanner(System.in ); 
        String[] adjectives  = new String[3];
        
        // Loop for number of descriptions
        for (int i = 0; i < adjectives.length; i++) 
        {
            System.out.println(" ");
            System.out.println("Please enter a descriptions of " + dino.name );
            adjectives[i] = scanner.nextLine();
            
        }
        sortDescription(dino, adjectives);
    }

    //Sorts the description of dinosaur
    public static void sortDescription(Dinosaur dino, String[] adjectives)
    {
        //Sorting dino adjectives in alphabetic order
        System.out.println(" ");
        Arrays.sort(adjectives);
        System.out.println(dino.name + " is " + Arrays.toString(adjectives));
    }

    //Setting the hunger level of the dinosaur
    public static void setHungerLevel(Dinosaur dino) 
    {
        int min = 0;
        int max = 9;
        
        //Random number calculation
        Random rand = new Random();

        int hungerLevel = rand.nextInt((max - min) + 1);
        dino.hungerLevel = hungerLevel;
    }
    
    // Getting hunger level of dinosaur 
    public static int getHungerLevel(Dinosaur dino) 
    {
        return dino.hungerLevel;
    }

    //  Setting health level of dinosaur 
    public static void setHealthLevel(Dinosaur dino)
    {
        int highHealth = 10;
        dino.healthLevel = highHealth; 
    }

    //Getting health level of dinosaur 
    public static int getHealthLevel(Dinosaur dino)
    { 
        return dino.healthLevel;
    }

    //Checking hunger level of dinosaur
    public static void checkHungerLevel(Dinosaur dino)
    {
        // Sets dinosaur's diet
        Scanner newname1 = new Scanner( System.in );
        System.out.println(" ");
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
        }	

        //Hungry dinosaur
        if (dino.hungerLevel <=5) 
        {
            System.out.println("Hunger level is "+ dino.hungerLevel); 

            //Dinosaur can go hunting
            if (eatingType.contains ("carnivore") || eatingType.contains ("omnivore"))
            {
                System.out.println( dino.name + " is hungry.");

                System.out.println("Would " + dino.name + " like to hunt?");
                Scanner scanner = new Scanner(System.in ); 
                String answer = scanner.nextLine().toLowerCase();
                
                //Dinosaur wants to go hunting
                if (answer.contains ("yes"))
                {
                    while (answer.contains("yes"))
                    {
                        System.out.println("Get ready in");
                    
                            //Countdown loop
                            for(int i = 5; i>0; i--) 
                            {
                                System.out.println(i);
                            }

                            System.out.println("GO!");
                            System.out.println(dino.name + " has eaten the T-rex!");

                            //Full dinosaur
                            System.out.println("Hunger Level is " + (dino.hungerLevel + 2));
                            System.out.println(dino.name + " is now full.");
                            break;   
                    }
                }

                //Sick dinosaur
                else if (answer.contains ("no"))
                {
                    dino.healthLevel = 3;
                    System.out.println("Health Level is " + dino.healthLevel);
                    System.out.println(dino.name + " is sick.");
                }

                //Invalid answer
                else {
                    System.out.println("Please enter whether " + dino.name + " ready for a hunt. ");
                    eatingType = newname1.next( );
                }
                
        }
        

        //Dinosaur eats plants
        if (eatingType.contains ("herbivore")) 
        {
            System.out.println( dino.name + " is hungry, so it is time to go find plants.");
            System.out.println("That was quick!" + dino.name + " is eating plants.");

            //Full dinosaur 
            System.out.println("Hunger Level is " + (dino.hungerLevel + 1)); 
        }
    }

// Full dinosaur is then under attack 
    else if (dino.hungerLevel >=6) 
    {
        System.out.println("Hunger level is " + dino.hungerLevel); 
        System.out.println(dino.name + " is not hungry.");
        System.out.println( "But " + dino.name + " is in danger and needs your help.");
        System.out.println("T-Rex is looking for its next prey. ");

        //Continue loop
        while (true) 
        {
            //Asking dino to attack loop
            for (int j=0; j<=4; j++)
            {
                System.out.println("Do you want to attack?");
                Scanner scanner = new Scanner(System.in ); 
                String answer = scanner.nextLine().toLowerCase(); 

                //Game over
                if (dino.healthLevel<=0)
                {
                    System.out.println("Health Level is " + dino.healthLevel);
                    System.out.println("GAME OVER");
                } 

                    //Decrease health level
                    int value = dino.healthLevel-1;
                    System.out.print(value);

                    //Checking dino wants to attack loop
                    for (int k= 0; k<=dino.healthLevel; k++)
                    {
                        System.out.println("Do you want to attack?");

                        //Dino attacks 
                        if(answer.contains("yes"))
                        {
                            answer = scanner.nextLine().toLowerCase();
                            System.out.println("Health Level is " + value--);
                        }

                        //Dino doesn't attack 
                        else if (answer.contains("no")) 
                        {
                            System.out.println("Health Level is " + value);
                            System.out.println(dino.name + " is healthy.");
                            break;
                        }
                        
                        
                    } break;
                } break;
            }
        }
    }
}

//Dinosaur record 
class Dinosaur 
{
    String name;
    int hungerLevel; 
    int healthLevel;
}
