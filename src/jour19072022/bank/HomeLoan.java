package jour19072022.bank;

public class HomeLoan extends Loan{
    public HomeLoan(double rate) {
        this.rate=rate;
    }

    @Override
    public double calculate(double d) {
        return this.rate*100;
    }
}
