package computer;

public class PcFactory extends AbstractFactory{
    protected String ram;
    protected String hdd;
    protected String cpu;

    public PcFactory(String ram, String hdd, String cpu) {
        this.ram = ram;
        this.hdd = hdd;
        this.cpu = cpu;
    }
    @Override
    public Computer createcomputer() {
        return new Pc(this.ram,this.hdd,this.cpu);
    }
}
