package jour19072022.bank;

public class Factorycreator {
    public Abstractfactory getFactory(String b){
        if(b.equals("Bank")){
            return new BankFactory();
        } else if (b.equals("Loan")) {
            return new Loanfactory();

        }else {
            return null;
        }
    }
}
