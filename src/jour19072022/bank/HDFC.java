package jour19072022.bank;

import jour19072022.bank.Bank;

public class HDFC extends Bank {
    private String bname;

    public HDFC(String bname) {
        this.bname = bname;
    }

    @Override
    public String GetBankName() {
        return this.bname;
    }
}
