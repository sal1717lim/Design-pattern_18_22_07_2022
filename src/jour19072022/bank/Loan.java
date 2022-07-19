package jour19072022.bank;

public abstract class Loan {
    protected double rate;
    public double getinteret(double d){
        return this.rate*d;
    }
    public abstract double calculate(double d);
}
