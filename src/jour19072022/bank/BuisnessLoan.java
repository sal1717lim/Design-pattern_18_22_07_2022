package jour19072022.bank;

public class BuisnessLoan extends Loan
{

    public BuisnessLoan(double rate) {
        this.rate=rate;
    }

    @Override
    public double calculate(double d) {
        return this.rate*50;
    }
}

