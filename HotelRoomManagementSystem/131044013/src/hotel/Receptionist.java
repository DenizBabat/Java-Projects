package hotel;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by deniz on 24.02.2018.
 */
public class Receptionist extends Person implements Hotelinterface {

    private int book;

    public static final String FILENAMERECS = "receptionist.csv";



    /**
     * Default Constructor
     */
    public Receptionist(){}

    /**
     * Three paremeter  Constructor.
     * @param name
     * @param surname
     * @param ID
     */
    public Receptionist(String name, String surname, String ID){
        super(name, surname, ID);
        book = -1;
    }

    /**
     * Four paremeter  Constructor.
     * @param name
     * @param surname
     * @param ID
     */
    public Receptionist(String name, String surname, String ID, int book){
        super(name, surname, ID);
        this.book = book;
    }
    /**
     * Receptionist Execution Function
     * @param hotel
     * @param guests
     */
    public void ReceptionistExec(Hotel hotel, ArrayList<Guest> guests)
    {
        int press = 0;
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;

        do {
            System.out.println("\nFor Check in, please select 1\n" +
                    "For Check out, please select 2\n" +"" +
                    "For book reservation, please select 3\n" +
                    "For cancel reservation, please select 4\n" +
                    "For add room, please select 5\n" +
                    "For Give list of Room in hotel.Hotel, please select 6\n" +
                    "For List State of Guest, Please select 7\n"+
                    "For List State of Own Receptionist, Please select 8\n"+
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
                case 1: checkIN(guests, hotel,-1);break;
                case 2: checkOUT(guests, hotel,-1); break;
                case 3: bookReservation(hotel, -1); break;
                case 4: cancelReservation(hotel, 'x'); break;
                case 5: addRoom(hotel); System.out.println("Hotel Room was added."); break;
                case 6: listOfHotelRooms(hotel); break;
                case 7: listStateGuests(guests); break;
                case 8:
                    System.out.println(this.toString()); break;
            }
        } while (flag);
    }

    /**
     * Bool reservation for receptionist
     * @param hotel
     * @param forTestChoice
     * @return boolean
     */
    @Override
    public boolean bookReservation(Hotel hotel, int forTestChoice){
        int choice=0;
        if (book<0) {
            System.out.printf("Empty Room: ");
            for (int i = 0; i < hotel.getEmptyRooms().size(); i++) {
                System.out.print(hotel.getEmptyRooms().get(i) + ", ");
            }
            System.out.println();
            Scanner scanner = new Scanner(System.in);
            if (forTestChoice==-1){
                System.out.println("Select a empty room: ");
                choice = scanner.nextInt();
            }
            else {
                choice = forTestChoice;
            }
            for (int num : hotel.getEmptyRooms()) {
                if (num == choice) {
                    this.book = choice;
                    hotel.addFullRoom(book);
                    System.out.println("Room was reserved.");
                    return true;
                }
            }
            return false;
        }
        else System.out.println("You already have a room.");

        return false;
    }
    /**
     * Cancel Reservation with Function
     * @param hotel
     * @param forTestChoice 'x' characteri değilse test yapmak için input girilmiştir. test icin kullaniliyor.
     * @return boolean
     */
    @Override
    public boolean cancelReservation(Hotel hotel , char forTestChoice){
        char choice;
        if (book<0 && book>hotel.getRooms().size()) {
            System.out.printf("\nYou do not have  a reservation");
            return false;
        }else {
            System.out.println("You want to cancel room Press 'Y' or not 'N' ");
            if (forTestChoice == 'x') {
                Scanner scanner = new Scanner(System.in);
                choice = scanner.next().charAt(0);
            }else{
                choice = forTestChoice;
            }

            if (choice == 'Y') {
                hotel.addEmptyRoom(book);
                book = -1;
                System.out.println("Your room was canceled.");
                return true;
            } else {
                return false;
            }
        }
    }

    /**
     * The receptionist check in with this function.
     * @param guests
     * @param hotel
     * @param forTestChoice -1'den büyükse test yapmak için input girilmiştir.test icin kullaniliyor.
     * @return success true or false;
     */
    public boolean checkIN(ArrayList<Guest> guests, Hotel hotel, int forTestChoice){
        ArrayList<Integer> waitToConfirmNum = new ArrayList<>();
        int confirmcounter=0;
        System.out.println("------->GUESTS EXPECTING APPROVAL and THEIR ORDER<-------\n");
        for (int i = 0; i < guests.size(); i++) {
            if (guests.get(i).getBookRoom() != -1 && guests.get(i).isConfirmRoom()==false) {

                System.out.println("------->"+(i+1)+". hotel Guest"+"<-------");
                System.out.println("Name Surname             :"+guests.get(i).getName() + " " + guests.get(i).getSurname());
                System.out.println("Reservation Room Number  :"+guests.get(i).getBookRoom()+". room");
                System.out.println("Confirm                  :"+ HotelSystem.Cross);
                waitToConfirmNum.add(i);

            }
        }
        System.out.println();
        Scanner scanner = new Scanner(System.in);
        int choice =0;
        if (waitToConfirmNum.size()!= 0) {
            do {
                if (forTestChoice == -1) {
                    System.out.println("Choose what you want to approve or Press -1 for EXIT");
                    choice = scanner.nextInt();
                }else {
                    choice = forTestChoice;
                }
                if (choice-1 >= waitToConfirmNum.size() || choice-1<0){
                    System.out.println("Wrong Choice, Choice else a number");
                }
                else {
                    guests.get(choice-1).setConfirmRoom(true);
                    guests.get(choice-1).setCancelRoom(-1);
                    hotel.addFullRoom(guests.get(choice-1).getBookRoom());
                    ++confirmcounter;
                    System.out.printf("Room "+ choice+" has been approved by the receptionist.");
                }

            }while (choice != -1 && forTestChoice ==-1);
            System.out.println("You confirmed "+confirmcounter+" guest. Thanks.");
            if (confirmcounter>0){
                return true;
            }
        }
        System.out.println("There is no anyone to wait confirmation");
        return false;
    }

    /**
     * The receptionist check out with this function.
     * @param guests
     * @param hotel
     * @param forTestChoice -1'den büyükse test yapmak için input girilmiştir.test icin kullaniliyor.
     * @return
     */
    public boolean checkOUT(ArrayList<Guest> guests, Hotel hotel, int forTestChoice){
        ArrayList<Integer> waitToCancelNum = new ArrayList<>();
        System.out.println("------->GUESTS WAITING FOR CANCELATION and THEIR ORDER<-------\n");
        int cancelCounter = 0;

        for (int i = 0; i < guests.size(); i++) {
            if (guests.get(i).getCancelRoom() != -1 && guests.get(i).isConfirmRoom()==true) {
                System.out.println("------->"+(i+1)+". hotel.Guest"+"<-------");
                System.out.println("Name Surname : "+guests.get(i).getName() + " " + guests.get(i).getSurname());
                System.out.println("Room Number  :"+guests.get(i).getBookRoom());
                System.out.println("Confirm      : " + HotelSystem.tik);
                waitToCancelNum.add(i);
            }
        }
        Scanner scanner = new Scanner(System.in);
        int choice =0;
        if (waitToCancelNum.size()!= 0) {
            do {
                if (forTestChoice==-1) {
                    System.out.println("Choose what you want for cancelation or Press -1 for EXIT");
                    choice = scanner.nextInt();
                }else{
                    choice = forTestChoice;
                }
                if ((choice-1 >= waitToCancelNum.size() || choice-1<0) && choice!=1){
                    System.out.println("Wrong Choice, Choice else a number");
                }

                else {
                    hotel.addEmptyRoom(guests.get(choice-1).getBookRoom());
                    guests.get(choice-1).setConfirmRoom(false);
                    guests.get(choice-1).setCancelRoom(1);
                    guests.get(choice-1).setBookRoom(-1);
                    System.out.printf("Room "+ choice+" has been canceled by the receptionist.\n");
                    ++cancelCounter;
                    if (cancelCounter == waitToCancelNum.size()){
                        System.out.println("No more guests");
                        break;
                    }
                }
            }while (choice != -1);
            System.out.println("You canceled "+cancelCounter+" guest room. Thanks.");
            if (cancelCounter>0)
                return true;
        }
        System.out.println("There is no anyone to wait for cancelation");
        return false;
    }


    /**
     * Receptionist can add rooms to the Hotel
     * @param rooms
     */
    public void addRoom(Hotel rooms){
        if(rooms.getEmptyRooms().size() == 0) {
            rooms.addRoomToHotel(1);
        }else {
            rooms.addRoomToHotel(rooms.getRooms().get(rooms.getRooms().size() - 1) + 1);
        }
    }

    /**
     * List of Hotel Rooms
     * @param hotel
     */
    @Override
    public void listOfHotelRooms(Hotel hotel){
        System.out.print("All ROOMS: ");
        for (int num:hotel.getRooms()){
            System.out.print(num+",");
        }
        System.out.print("\nEMPTY ROOMS: ");
        for (int num:hotel.getEmptyRooms()){
            System.out.print(num+",");
        }
        System.out.print("\nFULL ROOMS: ");
        for (int num:hotel.getFullRooms()){
            System.out.print(num+",");
        }
        System.out.printf("\n");
    }

    /**
     * List of Guests
     * @param guests
     */
    public void listStateGuests(ArrayList<Guest> guests){
        for (int i = 0; i < guests.size(); i++) {
            System.out.println("------->"+(i+1)+". hotel.Guest"+"<-------");
            System.out.println(guests.get(i).toString());
            System.out.println();
        }
    }

    /**
     * Receptionist toString
     * @return string
     */
    @Override
    public String toString() {
        return "\nID: "+getID() +"\nName: "+getName()+"\nSurname"+getSurname()+"\n"+"Room Number: "+getBook()+"\n";
    }

    /**
     * Receptionist equals Funciton
     * @param obj
     * @return
     */
    @Override
    public boolean equals(Object obj) {

        if (equals(obj))
        {
            return  true;
        }
        return false;
    }

    /**
     * get Book
     * @return int
     */
    public int getBook() {
        return book;
    }

    /**
     * set book
     * @param book
     */
    public void setBook(int book) {
        this.book = book;
    }

}
