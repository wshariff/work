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
        String[] song = new String[4];
        int[] downloads = new int[4];


        int compare = 0;
        String downloadSong =  " ";


        for (int i = 0; i<song.length; i++) 
        {       

            System.out.println("What is the name of track " + (i +1) );
            song[i] = scanner.nextLine();

            System.out.println("How many times in thousands, has it been downloaded?\n");           
            downloads[i] = scan.nextInt();
						total = total + downloads[i];
						
						//
            
            if (compare <= downloads[i]) 
            {
                compare = downloads[i];
                downloadSong = song[i];
            }
        }
        
        System.out.println("The song downloaded the most is " + downloadSong); //declare variable for song name with highest download
        System.out.println("The total number of downloads of these 4 songs are " + total*1000); //declare variable for the total downloads
				System.out.println("The details of the downloads are: ");

        for(int i = 0; i<song.length;i++){
            
            System.out.println(song[i] + ", " + downloads[i]);
        }
    

    



    }
    
}
