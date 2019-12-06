package citybikes;

import java.util.ArrayList;

public class Station {
    private int sID;
    private String location;
    private ArrayList<Integer> bikesStored;
    private int idCounter = 1;

    public Station(String location, ArrayList<Integer> bikesStored) {
        this.sID = idCounter++;
        this.location = location;
        this.bikesStored = bikesStored;
    }

    public int getsID() {
        return sID;
    }

    public void setsID(int sID) {
        this.sID = sID;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public ArrayList<Integer> getBikesStored() {
        return bikesStored;
    }

    public void setBikesStored(ArrayList<Integer> bikesStored) {
        this.bikesStored = bikesStored;
    }

    public int getIdCounter() {
        return idCounter;
    }

    public void setIdCounter(int idCounter) {
        this.idCounter = idCounter;
    }

    @Override
    public String toString() {
        return "Station{"
                + "sID="
                + sID
                + ", location='"
                + location
                + '\''
                + ", bikesStored="
                + bikesStored
                + ", idCounter="
                + idCounter
                + '}';
    }

    public void addBike(int bID) {
        if ((bikesStored.size() < 5)) {
            this.bikesStored.add(bID);
        } else System.out.println("Station Full!!");
    }

    public void removeBike(int bID) {
        this.bikesStored.remove(bikesStored.indexOf(bID));
    }
}
