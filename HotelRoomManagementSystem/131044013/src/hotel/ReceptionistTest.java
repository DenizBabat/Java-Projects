package hotel;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class ReceptionistTest {
    @Test
    public void checkIN() throws Exception {
        Hotel hotel = new Hotel();
        Guest actual = new Guest("123456", "deniz", "babat");
        Receptionist receptionist = new Receptionist("ahmet", "as","456987");


        hotel.addRoomToHotel(1);
        hotel.addRoomToHotel(2);
        hotel.addRoomToHotel(3);
        hotel.addRoomToHotel(4);

        actual.bookReservation(hotel,3);  // olmazmi guest  nuralaralı odayı reserve etti şimdi check in yapacagiz.

        ArrayList<Guest> guests = new ArrayList<>();
        guests.add(actual);
        receptionist.checkIN(guests,hotel,1); //bir olamsının nedeni guest sırasında ilk onun olmasıdır.

        int a = guests.get(0).getBookRoom();
        boolean b = guests.get(0).isConfirmRoom();

        assertEquals(3, a);
        assertEquals(true, b);


    }

    @Test
    public void checkOUT() throws Exception {

        Hotel hotel = new Hotel();
        Guest actual = new Guest("123456", "deniz", "babat");
        Receptionist receptionist = new Receptionist("ahmet", "as","456987");


        hotel.addRoomToHotel(1);
        hotel.addRoomToHotel(2);
        hotel.addRoomToHotel(3);
        hotel.addRoomToHotel(4);

        actual.bookReservation(hotel,3);  // olmazmi guest  nuralaralı odayı reserve etti şimdi check in yapacagiz.

        ArrayList<Guest> guests = new ArrayList<>();
        guests.add(actual);
        receptionist.checkIN(guests,hotel,1); //bir olamsının nedeni guest sırasında ilk onun olmasıdır.

        int a = guests.get(0).getBookRoom();
        boolean b = guests.get(0).isConfirmRoom();

        // buraya kadar check in işemi yapılmıştı şimdide ceck our yapılması gerek.

        guests.get(0).cancelReservation(hotel,'Y');
        receptionist.checkOUT(guests,hotel,1);

         a = guests.get(0).getBookRoom();
         b = guests.get(0).isConfirmRoom();

        assertEquals(-1, a);
        assertEquals(false, b);

    }

    @Test
    public void addRoom() throws Exception {

        Hotel expect = new Hotel();

        Hotel actual = new Hotel();

        actual.getRooms().add(1);
        actual.getRooms().add(2);
        actual.getRooms().add(3);
        actual.getRooms().add(4);


        expect.addRoomToHotel(1);
        expect.addRoomToHotel(2);
        expect.addRoomToHotel(3);
        expect.addRoomToHotel(4);

        assertArrayEquals(expect.getRooms().toArray() , actual.getRooms().toArray());


    }

}