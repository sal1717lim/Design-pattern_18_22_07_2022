package jour19072022.bank;

public class BankFactory extends Abstractfactory{

    @Override
    public Bank getBank(String B, String bankname) {
        switch (B){
            case "ICIC": return new ICICI(bankname);

            case "SBI": return new SBI(bankname);

            case "HDFC": return new HDFC(bankname);

            default:return null;

        }
    }

    @Override
    public Loan getLaon(String B, double rate) {
        return null;
    }
}
