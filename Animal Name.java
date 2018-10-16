import java.util.Scanner; 

public class Animal_Name {
public static void main ( String [] args) {

showAnimalName();
}

public static void showAnimalName() {

    Scanner letter = new Scanner(System.in ); 
    String animalLetter;
    System.out.println("Please enter a letter of the alphabet. ");
    animalLetter = letter.next( );

    if(animalLetter.equals("a")){
        System.out.println("You are an Aligator! ");
    }

    else if (animalLetter.equals("")){
        System.out.println("You need to enter a letter first. ");

    }

    else if (animalLetter.equals("b")){
        System.out.println("You are an Bear! ");
    }

    else if (animalLetter.equals("c")){
        System.out.println("You are an Capybara! ");
    }

    else if (animalLetter.equals("d")){
        System.out.println("You are an Donkey! ");
    }

    else if (animalLetter.equals("e")){
        System.out.println("You are an Elephant! ");
    }

    else if (animalLetter.equals("f")){
        System.out.println("You are an Fox! ");
    }

    else if (animalLetter.equals("g")){
        System.out.println("You are an Gorilla! ");
    }

    else if (animalLetter.equals("h")){
        System.out.println("You are an Horse! ");
    }

    else if (animalLetter.equals("i")){
        System.out.println("You are an Iguana! ");
    }

    else if (animalLetter.equals("j")){
        System.out.println("You are an Jaguar! ");
    }

    else if (animalLetter.equals("k")){
        System.out.println("You are an Kakapoo! ");
    }

    else if (animalLetter.equals("l")){
        System.out.println("You are an Lemming! ");
    }

    else if (animalLetter.equals("m")){
        System.out.println("You are an Macaw! ");
    }

    else if (animalLetter.equals("n")){
        System.out.println("You are an Newt! ");
    }

    else if (animalLetter.equals("o")){
        System.out.println("You are an Olm! ");
    }

    else if (animalLetter.equals("p")){
        System.out.println("You are an Pademelon! ");
    }

    else if (animalLetter.equals("q")){
        System.out.println("You are an Quoll! ");
    }

    else if (animalLetter.equals("r")){
        System.out.println("You are an Ragdoll! ");
    }

    else if (animalLetter.equals("s")){
        System.out.println("You are an Salamander! ");
    }

    else if (animalLetter.equals("t")){
        System.out.println("You are an Thorny Devil! ");
    }

    else if (animalLetter.equals("u")){
        System.out.println("You are an Uakari! ");
    }

    else if (animalLetter.equals("v")){
        System.out.println("You are an Vulture! ");
    }

    else if (animalLetter.equals("w")){
        System.out.println("You are an Warthog! ");
    }

    else if (animalLetter.equals("x")){
        System.out.println("You are an X-Ray Tetra! ");
    }

    else if (animalLetter.equals("y")){
        System.out.println("You are an Yak! ");
    }

    else if (animalLetter.equals("z")){
        System.out.println("You are an Zebu! ");
    }

    else {
        System.out.println("You need to enter a letter between a to z, please. ");
    } 
}
}