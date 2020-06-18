package hotel;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

/**
 * Created by deniz on 04.03.2018.
 */
public class ReadFile {
    /**
     * Read receptionist file
     * @param recs
     * @throws IOException
     */
    public static void readFileRecs(ArrayList<Receptionist> recs) throws IOException {
        // Open the file
        FileInputStream fstream = new FileInputStream(Receptionist.FILENAMERECS);
        BufferedReader br = new BufferedReader(new InputStreamReader(fstream));

        String line;
        while ((line = br.readLine()) != null) {
            StringTokenizer token = new StringTokenizer(line,",");
            String id = token.nextToken();
            String name = token.nextToken();
            String surname = token.nextToken();
            int book = Integer.parseInt(token.nextToken());
            recs.add(new Receptionist(name, surname,id, book));
        }
        br.close();
    }

    /**
     * Read guests file
     * @param guests
     * @throws IOException
     */
    public static void readFileGuests(ArrayList<Guest> guests) throws IOException{
        // Open the file
        FileInputStream fstream = new FileInputStream(Guest.FILENAMEGUESTS);
        BufferedReader br = new BufferedReader(new InputStreamReader(fstream));

        String line;
        while ((line = br.readLine()) != null) {
            StringTokenizer token = new StringTokenizer(line,",");

            guests.add(new Guest(token.nextToken(),token.nextToken(), token.nextToken(), Integer.parseInt(token.nextToken()),
                    Integer.parseInt(token.nextToken()),Boolean.parseBoolean(token.nextToken()) ));

        }
        br.close();
    }

    /**
     * Read Hotel Rooms
     * @param hotel
     * @throws IOException
     */
    public static void readFileHotel(Hotel hotel) throws IOException{
        // Open the file
        // Open the file
        FileInputStream fstream = new FileInputStream(Hotel.FILENAMEALLROOMS);
        BufferedReader br = new BufferedReader(new InputStreamReader(fstream));

        String line;
        String r="";
        while ((line = br.readLine()) != null){
            r += line;
        }
        br.close();
        StringTokenizer token = new StringTokenizer(r,",");
        while (token.hasMoreTokens()){
            hotel.getRooms().add(Integer.parseInt(token.nextToken()));
        }

        //--------------------------------------------------------------------------------------------------------------
        fstream = new FileInputStream(Hotel.FILENAMEEMPTYROOMS);
        br = new BufferedReader(new InputStreamReader(fstream));

         line=new String();
         r="";
        while ((line = br.readLine()) != null){
            r += line;
        }
        br.close();
        token = new StringTokenizer(r,",");
        while (token.hasMoreTokens()){
            hotel.getEmptyRooms().add(new Integer(Integer.parseInt(token.nextToken())));
        }

        //--------------------------------------------------------------------------------------------------------------
        fstream = new FileInputStream(Hotel.FILENAMEFULLROOMS);
        br = new BufferedReader(new InputStreamReader(fstream));

        line=new String();;
         r="";
        while ((line = br.readLine()) != null){
            r += line;
        }
        br.close();
        token = new StringTokenizer(r,",");
        while (token.hasMoreTokens()) {
            hotel.getFullRooms().add(new Integer(Integer.parseInt(token.nextToken())));
        }
        //--------------------------------------------------------------------------------------------------------------

    }
}
