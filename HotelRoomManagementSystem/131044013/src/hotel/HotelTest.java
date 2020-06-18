package hotel;

import org.junit.Test;

import static org.junit.Assert.*;

public class HotelTest {
    @Test
    public void addRoomToHotel() throws Exception {
        Hotel actual = new Hotel();
        Hotel expect = new Hotel();

        actual.addRoomToHotel(1);/*Hotele oda ekleme*/
        actual.addRoomToHotel(2);
        actual.addRoomToHotel(3);
        actual.addRoomToHotel(4);

        expect.getRooms().add(1); /*arraya oda ekleme */
        expect.getRooms().add(2); /*arraya oda ekleme */
        expect.getRooms().add(3); /*arraya oda ekleme */
        expect.getRooms().add(4); /*arraya oda ekleme */

        assertArrayEquals(expect.getRooms().toArray(), actual.getRooms().toArray());
    }

    @Test
    public void addEmptyRoom() throws Exception {
        Hotel actual = new Hotel();
        Hotel expect = new Hotel();

        actual.addEmptyRoom(1);
        actual.addEmptyRoom(2);
        actual.addEmptyRoom(3);
        actual.addEmptyRoom(4);

        expect.getEmptyRooms().add(1);
        expect.getEmptyRooms().add(2);
        expect.getEmptyRooms().add(3);
        expect.getEmptyRooms().add(4);

        assertArrayEquals(expect.getEmptyRooms().toArray(), actual.getEmptyRooms().toArray());
    }

    @Test
    public void addFullRoom() throws Exception {
        Hotel actual = new Hotel();
        Hotel expect = new Hotel();

        actual.addFullRoom(1);
        actual.addFullRoom(2);
        actual.addFullRoom(3);
        actual.addFullRoom(4);

        expect.getFullRooms().add(1);
        expect.getFullRooms().add(2);
        expect.getFullRooms().add(3);
        expect.getFullRooms().add(4);

        assertArrayEquals(expect.getFullRooms().toArray(), actual.getFullRooms().toArray());
    }

}