package hotel;

import java.util.Objects;

/**
 * Created by deniz on 25.02.2018.
 */
public interface Hotelinterface {
    /**
     * Rooms list
     * @param hotel
     */
    public void listOfHotelRooms(Hotel hotel);

    /**
     * ToString
     * @return String
     */
    public String toString();

    /**
     * Equals
     * @param object
     * @return boolean
     */
    public boolean equals(Object object);

    /**
     * book Reservation
     * @param hotel
     * @param forTestChoice
     * @return boolean
     */
    public boolean bookReservation(Hotel hotel, int forTestChoice);

    /**
     * cancel reservation
     * @param hotel
     * @param forTestChoice
     * @return boolean
     */
    public boolean cancelReservation(Hotel hotel , char forTestChoice);
}
