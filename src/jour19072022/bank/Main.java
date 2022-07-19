package jour19072022.bank;

public class Main {
    public static void main(String[] args){
        Factorycreator f=new Factorycreator();
        Abstractfactory b=f.getFactory("Bank");
        Bank b2=b.getBank("ICIC","paris");
        System.out.println(b2.GetBankName());
        b=f.getFactory("Loan");
        Loan x=b.getLaon("HOME",5);
        System.out.println(x.rate);
    }
}
