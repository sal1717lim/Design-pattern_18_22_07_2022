package jour20072022;

public class Car {
    @Override
    public String toString() {
        return "Car{" +
                "puissance=" + puissance +
                ", seat=" + seat +
                ", marque='" + marque + '\'' +
                ", gps=" + gps +
                '}';
    }

    private int puissance;
    private int seat;
    private String marque;
    private boolean gps;

    public int getPuissance() {
        return puissance;
    }

    public void setPuissance(int puissance) {
        this.puissance = puissance;
    }

    public int getSeat() {
        return seat;
    }

    public void setSeat(int seat) {
        this.seat = seat;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public boolean isGps() {
        return gps;
    }

    public void setGps(boolean gps) {
        this.gps = gps;
    }
}
