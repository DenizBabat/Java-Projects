package hotel;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;

/**
 * Created by deniz on 04.03.2018.
 */
public class WriteFile {

    /**
     * Write Receptionist datas to file
     * @param recs
     */
    public static void writeFileReceptionist(ArrayList<Receptionist> recs){
        try {
            File file = new File(Receptionist.FILENAMERECS);

            if (!file.exists() ) {
                file.createNewFile();
            }

            FileWriter fw = new FileWriter(file.getAbsoluteFile());
            BufferedWriter bw = new BufferedWriter(fw);

            for (int i = 0; i < recs.size(); i++) {
                StringBuilder builder = new StringBuilder();
                builder.append(recs.get(i).getID()+","+recs.get(i).getName()+","+recs.get(i).getSurname()+","+recs.get(i).getBook());
                bw.write(builder.toString());
                bw.newLine();
            }
            bw.close();

        }
        catch(Exception e){
            System.out.println(e);
        }
    }

    /**
     * Write guests to file
     * @param guests
     */
    public static void writeFileGuests(ArrayList<Guest> guests){
        try {
            File file = new File(Guest.FILENAMEGUESTS);

            if (!file.exists() ) {
                file.createNewFile();
            }

            FileWriter fw = new FileWriter(file.getAbsoluteFile());
            BufferedWriter bw = new BufferedWriter(fw);

            for (int i = 0; i < guests.size(); i++) {
                StringBuilder builder = new StringBuilder();
                builder.append(guests.get(i).getID()+","+guests.get(i).getName()+","+guests.get(i).getSurname()+","+
                guests.get(i).getBookRoom()+","+guests.get(i).getCancelRoom()+","+guests.get(i).isConfirmRoom()+",");
                bw.write(builder.toString());
                bw.newLine();
            }
            bw.close();

        }
        catch(Exception e){
            System.out.println(e);
        }
    }

    /**
     * Write hotel room to file
     * @param hotel
     */
    public static void writeFileRooms(Hotel hotel){
        try {
            File file1 = new File(Hotel.FILENAMEALLROOMS);
            File file2 = new File(Hotel.FILENAMEEMPTYROOMS);
            File file3 = new File(Hotel.FILENAMEFULLROOMS);

            if (!file1.exists() && !file2.exists() && !file3.exists()) {
                file1.createNewFile();
                file2.createNewFile();
                file3.createNewFile();
            }

            FileWriter fw = new FileWriter(file1.getAbsoluteFile());
            BufferedWriter bw = new BufferedWriter(fw);

            StringBuilder builder = new StringBuilder();
            for (int i = 0; i < hotel.getRooms().size(); i++) {
                builder.append(hotel.getRooms().get(i)+",");
            }
            bw.write(builder.toString());
            bw.close();



            fw = new FileWriter(file2.getAbsoluteFile());
            bw = new BufferedWriter(fw);

            builder = new StringBuilder();
            for (int i = 0; i < hotel.getEmptyRooms().size(); i++) {
                builder.append(hotel.getEmptyRooms().get(i)+",");
            }
            bw.write(builder.toString());
            bw.close();

            fw = new FileWriter(file3.getAbsoluteFile());
            bw = new BufferedWriter(fw);

            builder = new StringBuilder();
            for (int i = 0; i < hotel.getFullRooms().size(); i++) {

                builder.append(hotel.getFullRooms().get(i)+",");

            }
            bw.write(builder.toString());
            bw.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
