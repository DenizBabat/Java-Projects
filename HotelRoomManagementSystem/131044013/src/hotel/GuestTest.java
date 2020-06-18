package hotel;

import org.junit.Test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

import static org.junit.Assert.*;

//Bu test teste test dışında print olan odaları görebilirsiniz
//Nedeni ise fonksiyon içinde kullanıcıyı doğru yönlendirmek için
//output vermemdir. Kodu incelerseniz. görürsünüz.
public class GuestTest {
    @Test
    public void bookReservation() throws Exception {
        Hotel hotel = new Hotel();
        Guest actual = new Guest("123456", "ahmet", "zeki");
        hotel.addRoomToHotel(1);
        hotel.addRoomToHotel(2);
        hotel.addRoomToHotel(3);
        hotel.addRoomToHotel(4);

        Guest expect = new Guest("123456", "ahmet", "zeki", 3, -1, false);

        actual.bookReservation(hotel,3); //3 numaralı odayı şeçmek sorundadır. aksi takdirde test fail eder.

        assertEquals(expect.getBookRoom(),actual.getBookRoom());
    }

    @Test
    public void cancelReservation() throws Exception {
        Hotel hotel = new Hotel();
        Guest expect = new Guest("123456", "ahmet", "zeki");

        Guest actual = new Guest("123456", "ahmet", "zeki", 3, -1, false);

        actual.cancelReservation(hotel,'Y'); //Yes demelidir. Hocam No derse test yanlış olur.
                                                          //Çünkü oda REservationu iptal edilmemiş, olur.
                                                          //

        assertEquals(expect.getBookRoom(),actual.getBookRoom());
    }

    @Test
    public void listOfHotelRooms() throws Exception {
        Hotel hotel = new Hotel();
        Guest guest = new Guest("123456", "ahmet", "zeki");

        hotel.addRoomToHotel(1);
        hotel.addRoomToHotel(2);
        hotel.addRoomToHotel(3);
        hotel.addRoomToHotel(4);

        guest.listOfHotelRooms(hotel);

    }

}