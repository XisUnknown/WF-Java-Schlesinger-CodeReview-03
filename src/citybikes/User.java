package citybikes;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class User {
    private int uID;
    private String name;
    private String surname;
    private int bID = -1;
    private static int uIDCounter = 1;
    private Rent rent;
    private Calendar calendar;

    public Rent getRent() {
        return this.rent;
    }

    public Calendar getCalendar() {
        return this.calendar;
    }

    public User(String name, String surname, int bID) {
        this.uID = uIDCounter++;
        this.name = name;
        this.surname = surname;
        this.bID = bID;
    }

    public int getuID() {
        return uID;
    }

    public void setuID(int uID) {
        this.uID = uID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getbID() {
        return bID;
    }

    public void setbID(int bID) {
        this.bID = bID;
    }

    public static int getuIDCounter() {
        return uIDCounter;
    }

    public static void setuIDCounter(int uIDCounter) {
        User.uIDCounter = uIDCounter;
    }

    @Override
    public String toString() {
        return "User{"
                + "uID="
                + uID
                + ", name='"
                + name
                + '\''
                + ", surname='"
                + surname
                + '\''
                + ", bID="
                + bID
                + '}';
    }

    public void rentBike(int bID, Station station, String[] status, String bikeStatus) {
        if (bikeStatus.equals(status[0])) {
            calendar = Calendar.getInstance();
            GregorianCalendar gc = (GregorianCalendar) calendar;
            this.bID = bID;
            rent = new Rent(this.bID, gc);
            station.removeBike(bID);
        } else {
            this.bID = -1;
            System.out.println("Bike is not rentable.");
        }
    }

    public void returnBike(int bID, Station station) {
        station.addBike(bID);
        calendar = Calendar.getInstance();
        GregorianCalendar gc = (GregorianCalendar) calendar;
        if (!(station.getBikesStored().size() > 5)) {
            this.bID = -1;
            rent.setRentEnd(gc);
        } else System.out.println("Station is Full!!");
    }
}
