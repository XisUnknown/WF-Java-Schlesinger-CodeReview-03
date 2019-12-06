package citybikes;

import java.util.Calendar;

public class Rent {
    private int BikeID;
    private Calendar RentBegin;
    private Calendar RentEnd;
    private static int BikeIDCounter = 1;

    public Rent(int BikeID, Calendar rentBegin) {
        this.BikeID = BikeID;
        this.RentBegin = rentBegin;
    }

    public int getBikeID() {
        return this.BikeID;
    }

    public void setBikeID(int bikeID) {
        this.BikeID = bikeID;
    }

    public Calendar getRentBegin() {
        return this.RentBegin;
    }

    public void setRentBegin(Calendar rentBegin) {
        this.RentBegin = rentBegin;
    }

    public Calendar getRentEnd() {
        return this.RentEnd;
    }

    public void setRentEnd(Calendar rentEnd) {
        this.RentEnd = rentEnd;
    }

    @Override
    public String toString() {
        return "Rent{"
                + "BikeID="
                + this.BikeID
                + ", RentBegin="
                + this.RentBegin
                + ", RentEnd="
                + this.RentEnd
                + '}';
    }
}
