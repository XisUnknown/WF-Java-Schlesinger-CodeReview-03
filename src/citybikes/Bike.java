package citybikes;

public class Bike {

    private int bID = 1;
    private String color;
    private String bikeStatus;
    // private static int stationCounter = 1;
    private static int buff = 1;

    public Bike(String color, String bikeStatus) {
        this.bID = buff++;
        this.color = color;
        this.bikeStatus = bikeStatus;
    }

    public int getbID() {
        return bID;
    }

    public void setbID(int bID) {
        this.bID = bID;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBikeStatus() {
        return bikeStatus;
    }

    public void setBikeStatus(String bikeStatus) {
        this.bikeStatus = bikeStatus;
    }

    public static int getBuff() {
        return buff;
    }

    public static void setBuff(int buff) {
        Bike.buff = buff;
    }

    @Override
    public String toString() {
        return "Bike{"
                + "bID="
                + bID
                + ", color='"
                + color
                + '\''
                + ", bikeStatus='"
                + bikeStatus
                + '\''
                + '}';
    }
}
