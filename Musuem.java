/* Author: Waheeda Shariff
Date: 08/11/2018
*/

import java.util.Scanner;

class Musuem {

  public static void main (String [] p) {

    /* visitor types in room letter = object name, approx year, short description
      Museum Object created new record type : store name, year, description in seperate field of record
      Seperate method: when room letter is provided (A-C), prints correct info about room - to be called by main.

      MuseumObject B = new MuseumObject();
      MuseumObject C = new MuseumObject();
    */

    String Letter = askRoom ();
    MuseumObject objectA = new MuseumObject();
    objectA.name = "The main item in this room is the Qur'an.";
    objectA.year="The colophon of the Qur'an indicates it was written in 1190.";
    objectA.description="This is an 800-year-old Quran which is the oldest written work being exhibited at the Torkat Museum in Anatolia.This Qur'an was found in Tokay.";

    MuseumObject objectB = new MuseumObject();
    objectB.name="The main item in this room is the Seljuk rug.";
    objectB.year="This Seljuk rug dates from the 13th century";
    objectB.description="The fragment was found in Alaeddin Keykubad Mosque in Konya. ";

    MuseumObject objectC = new MuseumObject();
    objectC.name="The main item in this room is the Astrolobe.";
    objectC.year="It was constructed in 1291.";
    objectC.description="The Yemeni Sultan Al-Ashraf Umar from 1295 to 1296 constructed an astrolobe which is now in the Metropolitian Museum in New York. ";
    
    roomInfo (Letter, objectA, objectB, objectC); 
  }

  public static String askRoom () {
    
    Scanner scanner = new Scanner( System.in );
    System.out.println("What room are you in?");
    String roomLetter = scanner.nextLine();
    
    return roomLetter;
  }

  public static void roomInfo(String Letter, MuseumObject objectA, MuseumObject objectB, MuseumObject objectC){

    switch (Letter) {
      case "A": 
        System.out.println(objectA.name);
        System.out.println(objectA.year);
        System.out.println(objectA.description);
      break;
      
      case "B": 
        System.out.println(objectB.name);
        System.out.println(objectB.year);
        System.out.println(objectB.description);
      break;

      case "C": 
        System.out.println(objectC.name);
        System.out.println(objectC.year);
        System.out.println(objectC.description);
      break;

      default: 
        System.out.println("This is not a room that is open to the public in the Museum. Please try again.");
      break;
    }

  }
}


class MuseumObject {

  String name;
  String year;
  String description;

}