import java.util.Scanner; 
import java.util.Arrays;

public class Animal {
    public static void main ( String [] args) {

        showAnimalName();
        alphabeticAnimal();
        System.out.println("Finished Main");
    }

    public static void showAnimalName() {

        Scanner letter = new Scanner(System.in ); 
        String animalLetter;
        System.out.println("Please enter a letter of the alphabet. ");
        animalLetter = letter.next( );

        // change case letters as "a"

      	switch (letter) {
        	case a:  animalLetter = "You are an Aligator!";
            break;
        	
        	case b:  animalLetter = "You are an Bear";
          	break;
            
        	case c:  animalLetter = "You are an Capybara!";
			break;
            
        	case d:  animalLetter = "You are an Donkey!";
			break;
            
        	case e:  animalLetter = "You are an Elephant!";
            break;
       
			case f:  animalLetter = "You are an Fox! ";            
         
           
          case g:  animalLetter = "You are an Gorilla! ";
            break;
       
        	case h:  animalLetter = "You are an Horse! ";
            break;
         
            case h:  animalLetter = "You are an Iguana!";
		    break;
          
            case h:  animalLetter = "You are an Jaguar!";
		    break;

            case h:  animalLetter ="You are an Kakapoo!";
		    break;
            
            case h:  animalLetter ="You are an Lemming! ";
            break;

            case h:  animalLetter ="You are an Macaw!";
            break;
                
            case h:  animalLetter ="You are an Newt!";
            break;

            case h:  animalLetter ="You are an Olm!";
            break;

            case h:  animalLetter ="You are an Pademelon! ";
            break;

            case h:  animalLetter ="You are an Quoll! ";
            break;
                
            case h:  animalLetter ="You are an Ragdoll! ";
            break;           

            case h:  animalLetter ="You are an Salamander! ";
            break;

            case h:  animalLetter ="You are an Thorny Devil! ";
            break;
                
            case h:  animalLetter ="You are an Uakari! ";
            break;
                
            case h:  animalLetter ="You are an Vulture! ";
            break;
                
            case h:  animalLetter ="You are an Warthog! ";
            break;

            case h:  animalLetter ="You are an X-Ray Tetra! ";
            break;
                
            case h:  animalLetter ="You are an Yak! ";
            break;
                
            case h:  animalLetter ="You are an Zebu! ";
            break;

            default: animalLetter = "You need to enter a letter between a to z, please.";
            break;

    }

    public static void alphabeticAnimal() {
    
      
      	
        Scanner number = new Scanner(System.in ); 
        System.out.println("Please enter a number between 1 to 5. ");
        String animalNumber = number.next( );

        int iAnimalNumber = Integer.parseInt(animalNumber); 
        
        /* create for loop for the number of times the user will need to enter the animal name. 
        ask them in the loop to enter animal name */


        //Array for the animal names 
        String[] animals = new String[iAnimalNumber];
        
        number.nextLine();

        
        for(int i=0; i<iAnimalNumber; i++){
            System.out.println("Enter an animal ");
            animals[i] = number.nextLine();
        }
      
      	Arrays.sort(animals);
        System.out.print("Your animals are: "+ Arrays.toString(animals));
        
        System.out.println();
    }
}