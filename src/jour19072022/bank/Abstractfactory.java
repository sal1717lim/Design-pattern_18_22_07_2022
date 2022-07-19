package jour19072022.bank;

public abstract class Abstractfactory {
    public abstract Bank getBank(String B,String bankname);
    public abstract Loan getLaon(String B,double rate);
}
