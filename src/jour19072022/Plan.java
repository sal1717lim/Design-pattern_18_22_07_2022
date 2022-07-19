package jour19072022;

public abstract class Plan {
   protected double rate;


    public double getRate() {
        return rate;
    }
    public abstract double calculateBill(int units);
    public abstract void afficher();
}
