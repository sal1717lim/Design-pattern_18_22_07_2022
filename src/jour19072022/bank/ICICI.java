package jour19072022.bank;

import jour19072022.bank.Bank;

public class ICICI extends Bank {
    private String bname;

    public ICICI(String bname) {
        this.bname = bname;
    }

    @Override
    public String GetBankName() {
        return this.bname;
    }
}
