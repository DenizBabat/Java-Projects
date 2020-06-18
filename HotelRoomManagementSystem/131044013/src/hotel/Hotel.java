package hotel; /**
 * Created by deniz on 23.02.2018.
 */

import java.util.ArrayList;

/**
 * The hotel holds only rooms.
 */
public class Hotel {
    /**
     * Oda listesi
     */
    private ArrayList<Integer> rooms = new ArrayList<>();
    /**
     * bos oda listesi
     */
    private ArrayList<Integer> emptyRooms = new ArrayList<>();
    /**,
     * dolu oda listesi
     */
    private ArrayList<Integer> fullRooms = new ArrayList<>();

    /**
     * Recoder file for all rooms
     */
    public static final String FILENAMEALLROOMS = "hotelRooms.csv";
    /**
     * Recoder file for empty rooms
     */
    public static final String FILENAMEEMPTYROOMS = "emptyhotelRooms.csv";
    /**
     * Recoder file for full rooms
     */
    public static final String FILENAMEFULLROOMS = "fullhotelRooms.csv";

    /**
     * default constructor.
     */
    public Hotel(){}

    /**
     * get rooms
     * @return book
     */
    public ArrayList<Integer> getRooms() {
        return rooms;
    }

    /**
     * Get Empty Rooms
     * @return Empty rooms
     */
    public ArrayList<Integer> getEmptyRooms() {
        return emptyRooms;
    }

    /**
     * Get Full Rooms
     * @return Full rooms
     */
    public ArrayList<Integer> getFullRooms() {
        return fullRooms;
    }

    /**
     * Set Rooms
     * @param rooms
     */
    public void setRooms(ArrayList<Integer> rooms) {
        this.rooms = rooms;
    }

    /**
     * Set empty room
     * @param emptyRooms
     */
    public void setEmptyRooms(ArrayList<Integer> emptyRooms) {
        this.emptyRooms = emptyRooms;
    }

    /**
     * Set full rooms
     * @param fullRooms
     */
    public void setFullRooms(ArrayList<Integer> fullRooms) {
        this.fullRooms = fullRooms;
    }

    /**
     * Rooms size
     * @return
     */
    public int size(){
        return rooms.size();
    }

    /**
     * Add room
     * @param num
     * @return boolean
     */
    public boolean addRoomToHotel(int num)
    {
        if (num<0 && num>rooms.get(size())+1 && num < rooms.get(size()))
        {
            return false;
        }
        else {
            rooms.add(new Integer(num));
            emptyRooms.add(new Integer(num));
            sortRooms(rooms);
            sortRooms(emptyRooms);
            return true;
        }
    }

    /**
     * Add Full Room
     * @param num
     */
    public void addFullRoom(int num){
        fullRooms.add(new Integer(num));
        emptyRooms.remove(new Integer(num));
        sortRooms(emptyRooms);
        sortRooms(fullRooms);
    }

    /**
     * Add empty room
     * @param num
     */
    public void addEmptyRoom(int num){
        emptyRooms.add(new Integer(num));
        fullRooms.remove(new Integer(num));

        sortRooms(emptyRooms);
        sortRooms(fullRooms);
    }

    /**
     * Sort Rooms number
     * @param rooms
     */
    private void sortRooms(ArrayList<Integer> rooms){
        int temp;
        for (int i = 1; i < rooms.size(); i++) {
            for(int j = i ; j > 0 ; j--){
                if(rooms.get(j) < rooms.get(j-1)){
                    temp = rooms.get(j);
                    rooms.set(j,rooms.get(j-1));
                    rooms.set(j-1,temp);
                }
            }
        }
    }

    /**
     * Hotel equals Function
     * @param obj
     * @return
     */
    @Override
    public boolean equals(Object obj) {
        Hotel hotel = (Hotel) obj;

        if (this.getRooms().size()==hotel.getRooms().size()){
            for (int i = 0; i <this.getRooms().size() ; i++) {
                if (this.getRooms().get(i)!=hotel.getRooms().get(i)){
                    return false;
                }
            }
            return true;
        }else{
            return false;
        }
    }

    /**
     * Hotel toString
     * @return string
     */
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < this.getRooms().size(); i++) {
            builder.append(this.getRooms().get(i)+",");
        }
        return builder.toString();
    }
}
