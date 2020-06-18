package hotel;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by deniz on 25.02.2018.
 */
public class HotelSystem {

    public static String tik = "√";
    public static String Cross = "X";

    /**
     * keeps all rooms variable
     */
    private Hotel hotel = new Hotel();
    /**
     * keeps all receptionists variable
     */
    private ArrayList<Receptionist> receptionists = new ArrayList<>();
    /**
     * keeps all guests variable
     */
    private ArrayList<Guest> guests = new ArrayList<>();


    /**
     * Hotel system default constructor.
     * @throws IOException
     */
    public HotelSystem() throws IOException {
        boolean exit=false;
        int choice = 0;
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;

        /**
         * History Recorder
         */
        try {
            ReadFile.readFileRecs(receptionists);
            ReadFile.readFileGuests(guests);
            ReadFile.readFileHotel(hotel);
        }catch (Exception e){
            System.out.println("Don't read to files or wrong read");
            e.getMessage();
        }

        do {
            /**
             * Chioce Receptionist or Guest
             */
            do{
                System.out.println("If you are hotel.Receptionist, press 1 or \nIf your are hotel.Guest, press 2");
                choice = scanner.nextInt();
                if (choice < 1 || choice > 2) {
                    System.out.println("Wrong choice, try again.");
                    flag = false;
                }
                else flag = true;


            }while (flag == false);


            System.out.println("For Register, press R\nFor Login, press L");
            String temp = scanner.next();
            if (temp.equals("R"))
                register(choice);
            else if (temp.equals("L")) {
                System.out.println("\n==>WELCOME lOGIN<==\n");
                login(choice);
            }else System.out.println("Not be entered system, try again");

            System.out.println("\nTo completely exit, press E or\nFor other choice, press C");
            if (scanner.next().equals("E"))
                exit = true;
            else System.out.println("\nWelcome again\n");

        }while (!exit);

        /**
         * Write History Recorder
         */
        WriteFile.writeFileRooms(hotel);
        WriteFile.writeFileReceptionist(receptionists);
        WriteFile.writeFileGuests(guests);
        System.out.println("To be exited from system.\nBye");

    }

    /**
     * Login Function. Want a user ID
     * @param choice
     * @return boolean
     */
    public boolean login(int choice)
    {
        if (choice == 1)
        {
            System.out.println("FOR EXIT, PRESS 'E' ");
            System.out.print("Enter receptionist of you ID: ");
            Scanner scanner = new Scanner(System.in);
            String id = scanner.next();

            if (id.charAt(0) == 'E')
                return false;

            for (int i = 0; i < receptionists.size() ; i++) {
                if (receptionists.get(i).getID().trim().equals(id))
                {
                    System.out.println("\n==>Entered System of Hotel as a Receptionist<==");
                    receptionists.get(i).ReceptionistExec(hotel, guests);
                    return true;
                }
            }
            System.out.println("Wron ID");
            return false;
        }
        else if (choice == 2) {
            System.out.println("FOR EXIT, PRESS 'E' ");
            System.out.println("Enter guest of you ID");
            Scanner scanner = new Scanner(System.in);
            String id = scanner.next();

            if (id.charAt(0) == 'E')
                return false;

            for (int i = 0; i < guests.size() ; i++) {
                if (guests.get(i).getID().trim().equals(id))
                {
                    System.out.println("\n==>Entered System of Hotel as Guest<==");
                    guests.get(i).guestExec(hotel);
                    return true;
                }
            }
            return false;
        }else System.out.println("Wrong input");
        System.out.println("Wron ID");
        return false;
    }

    /**
     * Register Function
     * @param choice
     * @throws IOException
     */
    public void register(int choice) throws IOException {
        System.out.println("\n==>WELCOME REGISTER<==");
        boolean flag = true;
        String name, surname, ID;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Your name: ");
        name = scanner.next();
        System.out.print("Enter Your Surname: ");
        surname = scanner.next();
        do {
            System.out.print("Select a greater 5 and less 16 number: ");
            int temp = scanner.nextInt();
            ID = String.valueOf(temp);

            if (ID.length() >= 6 && ID.length()<=16) {
                for (int i = 0; i < guests.size(); i++) {
                    if (ID == guests.get(i).getID()) {
                        System.out.println("This ID exists\nSelect different ID");
                        flag = false;
                    }
                }
            }else System.out.println("ID is invalid, try again.");
        }while (!flag);

        if (choice == 2)
            guests.add(new Guest(ID.trim(), name.trim(), surname.trim()));
        else receptionists.add(new Receptionist(name.trim(), surname.trim(), ID.trim()));

        System.out.println("==>Recorded<==");
    }

}
