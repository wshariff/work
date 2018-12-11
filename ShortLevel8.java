import java.util.Scanner;

class ShortLevel8 
{
    public static void main(String[] args) 
    {
        railwayStation();
        System.exit(0);
    }

    //About Station 
    public static void railwayStation()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("What station do you need to know about? ");
        String stationName = scan.next().toLowerCase();

        //Array for station information 
        Station[] stationinfo = new Station[3];
        stationinfo[0] = setDescription("Bristol is operated by Great Western and  " + test(false), false);
        stationinfo[1] = setDescription("Reading is operated by Great Western and " + test(true), true);
        stationinfo[2] = setDescription("York is operated by Great Eastern and " + test(true), true);

        //Bristol station 
        if(stationName.equals("bristol"))
        {
            System.out.println(getDescription(stationinfo[0]));
        }

        //reading station
        else if(stationName.equals("reading"))
        {
            System.out.println(getDescription(stationinfo[1]));
        }

        //york station 
        else if(stationName.equals("york"))
        {
            System.out.println(getDescription(stationinfo[2]));
        }

        //Unknown station 
        else
        {
            System.out.println("I don't know that station.");
        }
    }
        //Checking step free access 
       public static String test(boolean value)
       {
           String check = " ";

           //step free access 
           if(value)
           {
               check = "has step free access ";
               return check;
           }

           //lack of step free access
           else
           {
               check = "doesn't have step free access ";
               return check;
           }
       }

    
    //Setting station information 
    public static Station setDescription(String description, boolean access)
    {
        Station temp = new Station();
        temp.description = description;
        temp.wheelchairAccess = access;
            return temp;
    }

    //Getting station information 
    public static String getDescription(Station Description)
    {
        
        return Description.description;
    }
  
    
}

//Station record
class Station 
{
    String description;
    Boolean wheelchairAccess;
}