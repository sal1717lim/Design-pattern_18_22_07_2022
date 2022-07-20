package jour20072022;

public interface Builder {
    public CarBuilder setEngine(int puissance);
    public CarBuilder setSeat(int s);
    public CarBuilder setMarque(String marque);
    public CarBuilder setGps(boolean b);
    public void reset();
}
