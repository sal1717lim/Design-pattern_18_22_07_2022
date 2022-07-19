package jour19072022.bank;

public class Loanfactory extends Abstractfactory{
    @Override
    public Bank getBank(String B, String bankname) {
        return null;
    }

    @Override
    public Loan getLaon(String B, double rate) {
        switch (B){
            case "HOME": return new HomeLoan(rate);

            case "Buisness": return new BuisnessLoan(rate);


            default:return null;

        }
    }
}
