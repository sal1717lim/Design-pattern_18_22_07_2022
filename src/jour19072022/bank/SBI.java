package jour19072022.bank;

public class SBI extends Bank{
    private String bname;

    public SBI(String bname) {
        this.bname = bname;
    }

    @Override
    public String GetBankName() {
        return this.bname;
    }
}
