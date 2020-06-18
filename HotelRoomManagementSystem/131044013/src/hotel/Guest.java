package hotel; /**
 * Created by deniz on 23.02.2018.
 */

import com.sun.org.apache.xpath.internal.operations.Equals;
import org.omg.CORBA.PERSIST_STORE;

import javax.security.auth.login.Configuration;
import java.util.Scanner;

/**
 * The management system’s users are receptionist and hotel guests.
 * System users will log in to the system as either receptionist or hotel guests.
 */
public class Guest extends Person implements Hotelinterface {
    /**
     * Book Reservation Room Number
     */
    private int bookRoom;
    /**
     * Cancel Reservation Room Number
     */
    private int cancelRoom;
    /**
     * Confirm Room by the Receptionist.
     */
    private boolean confirmRoom;

    /**
     * Recorder File Name
     */
    public static final String FILENAMEGUESTS = "guest.csv";


    /**
     * Get Book Room
     * @return int
     */
    public int getBookRoom() {
        return bookRoom;
    }

    /**
     * Set Book Room
     * @param bookRoom
     */
    public void setBookRoom(int bookRoom) {
        this.bookRoom = bookRoom;
    }

    /**
     * Get Cancel Book Room
     * @return int
     */
    public int getCancelRoom() {
        return cancelRoom;
    }

    /**
     * Set Cancel Room
     * @param cancelRoom
     */
    public void setCancelRoom(int cancelRoom) {
        this.cancelRoom = cancelRoom;
    }

    /**
     * Is Confirm Rom
     * @return boolean
     */
    public boolean isConfirmRoom() {
        return confirmRoom;
    }

    /**
     * Set Confirm Room
     * @param confirmRoom
     */
    public void setConfirmRoom(boolean confirmRoom) {
        this.confirmRoom = confirmRoom;
    }

    /**
     * Tree Parameter Constructor.
     * @param id
     * @param name
     * @param surname
     */
    public Guest(String id, String name, String surname){
        super(name, surname, id);
        this.bookRoom=-1;
        this.cancelRoom=1;
        this.confirmRoom = false;
    }

    /**
     * Six Parameter Constructor.
     * @param id
     * @param name
     * @param surname
     * @param bookRoom
     * @param cancelRoom
     * @param confirmRoom
     */
    public Guest(String id, String name, String surname, int bookRoom, int cancelRoom, boolean confirmRoom){
        super(name, surname, id);
        this.bookRoom = bookRoom;
        this.cancelRoom = cancelRoom;
        this.confirmRoom = confirmRoom;
    }

    /**
     * Guests Local Execution Function
     * @param hotel
     */
    public void guestExec(Hotel hotel){
        int press = 0;
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;

        do {
            System.out.println("\n------>GUEST<------");
            System.out.println("For book reservation, please select 1\n" +
                    "For cancel reservation, please select 2\n" +
                    "To list of hotel.Hotel room, please select 3\n" +
                    "To view room status, Press 4\n"+
                    "For exit, please select -1\n");
            press = scanner.nextInt();
            if (press == -1 )
            {
                flag = false;
            }
            if (press < 1 && press > 4 && press != -1) {
                System.out.println("Please select different choice");
                flag = false;
            }
            switch (press) {
                case 1: bookReservation(hotel,-1);break;
                case 2: cancelReservation(hotel,'x'); break;
                case 3: listOfHotelRooms(hotel); break;
                case 4:System.out.printf(toString());
                    break;
            }
        } while (flag);
    }

    /**
     * Book Reservation with Function
     * @param hotel
     * @param forTestChoice -1'den büyükse test yapmak için input girilmiştir.test icin kullaniliyor.
     * @return
     */
    @Override
    public boolean bookReservation(Hotel hotel, int forTestChoice ){
        int choice;
        Scanner scanner = new Scanner(System.in);

        if (this.confirmRoom && this.bookRoom>0)
        {
            System.out.println("You have a room. You do not reserve else room");
            return false;
        }
        do {
            listOfHotelRooms(hotel);
            System.out.println("Those rooms is empty. Please! Choice a room number, or for EXIT PRESS -1");
            if (forTestChoice==-1) {
                choice = scanner.nextInt();
            }else
                choice = forTestChoice;
                for (int num : hotel.getEmptyRooms()) {
                    if (num == choice) {
                        bookRoom = choice;
                        System.out.println("Room was reserved.");
                        return true;
                    }
                }
        }while(choice == -1 );
        bookRoom = -1;
        return false;
    }


    /**
     * Cancel Reservation with Function
     * @param hotel
     * @param forTestChoice 'x' characteri değilse test yapmak için input girilmiştir. test icin kullaniliyor.
     * @return
     */
    @Override
    public boolean cancelReservation(Hotel hotel , char forTestChoice){
        char choice;
        if (bookRoom<0 && bookRoom>hotel.getRooms().size()) {
            System.out.printf("\nYou do not have  a reservation");
            return false;
        }
        else {
            System.out.println("You want to cancel room Press 'Y' or not 'N' ");
            if (forTestChoice == 'x') {
                Scanner scanner = new Scanner(System.in);
                choice = scanner.next().charAt(0);
            }else{
                choice = forTestChoice;
            }

            if (choice == 'Y') {
                cancelRoom = 1;
              //  bookRoom = -1;
                System.out.println("Process is going on. Please, Can You wait");
                return true;
            } else {
                cancelRoom = -1;
                return false;
            }
        }
    }

    /**
     * List Of Empty room of Hotel
     * @param hotel
     */
    @Override
    public void listOfHotelRooms(Hotel hotel){

        if (hotel.getRooms().size()==0)
        {
            System.out.println("There is no a empty room in the hotel");
        }
        else System.out.printf("This Rooms is Empty rooms.\nAnd You can only see empty rooms:");

        System.out.println();
        for (int i = 0; i < hotel.getEmptyRooms().size(); i++) {
            System.out.print(hotel.getEmptyRooms().get(i)+", ");
        }
        System.out.println();
    }

    /**
     * Guest ToString
     * @return string
     */
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("ID: "+this.getID()+"\n");
        builder.append("Name Surname: "+this.getName()+" "+this.getSurname()+"\n");

        if (bookRoom != -1 && cancelRoom!=1) {
            builder.append("Room Number: " + this.getBookRoom() + "\n");
            builder.append("Confirm: " + HotelSystem.tik + "\n");
            builder.append("Cancellation request: No\n" );
        }
        else if(bookRoom == -1 && confirmRoom == false){
            builder.append("Room Number: No room\n");
            builder.append("No Confirm: " + HotelSystem.Cross+"\n");
            builder.append("Cancellation request: ,Canceled\n" );
        }
        else {
            builder.append("Room Number: " + this.getBookRoom() + "\n");
            builder.append("Confirm: " + HotelSystem.tik + "\n");
            builder.append("Cancellation request: Yes\n" );
        }
        return builder.toString();
    }

    /**
     * Guests equals
     * @param obj
     * @return boolean
     */
    @Override
    public boolean equals(Object obj) {

        if (equals(obj))
        {
            return  true;
        }
        return false;
    }
}
