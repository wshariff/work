import java.util.Scanner;
import java.util.Arrays;

class Music 
{ 
	public static void main (String [] p)
	{
		topMusic();
	}
	

	public static void topMusic()
	{
		Scanner scanner = new Scanner (System.in);
		Scanner scan = new Scanner (System.in);
		int total = 0;

		int compare = 0;
		String downloadSong =  " ";


		for (int i = 0; i<=3; i++) 
		{		

			System.out.println("What is the name of track " + (i +1) );
			String song = scanner.nextLine();

			System.out.println("How many times in thousands, has it been downloaded?\n");			
			int downloads = scan.nextInt();
			total = total + downloads;
			
			if (compare <= downloads) 
			{
				compare = downloads;
				downloadSong = song;
			}
		}
		
		System.out.println("The song downloaded the most is " + downloadSong); //declare variable for song name with highest download
		System.out.println("The total number of downloads of these 4 songs are " + total*1000); //declare variable for the total downloads
	

	// Array for the song names
	
	//CREATE ARRAY FOR SONG NAMES + DOWNLOAD
	
        String[] songName = new String[4];
        
        number.nextLine();
        
        for(int i=0; i<iAnimalNumber; i++){
            System.out.println("Enter an animal ");
            animals[i] = number.nextLine();
        }
      
      	Arrays.sort(animals);
        System.out.print("Your animals are: "+ Arrays.toString(animals));
	

	//Array for the songs number of downloads




	}
	
}
