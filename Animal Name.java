 import java.util.Scanner; 
  
  public class Jurassic {
  public static void main ( String [] args) {

      showAnimalName();
    }

	public static void showAnimalName() {
  
		Scanner letter = new Scanner(System.in ); 
		String animalLetter;
		System.out.println("Please enter a letter of the alphabet. ");
		animalLetter = letter.next( );
    
		if(animalLetter.equals("a")){
			System.out.println("You are an Aligator! ");}
    
		else if (animalLetter.equals("")){
			System.out.println("You need to enter a letter please. ");
        
		}
    
		else if (animalLetter.equals("b")){
			System.out.println("You are an Bear! ");
		}

		else if (animalLetter.equals("c")){
			System.out.println("You are an Capybara! ");
		}

		else {
			System.out.println("You need to enter a letter please. ");
		} 
	}
}