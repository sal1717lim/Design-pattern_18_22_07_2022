package computer;

public class Pc extends Computer {
    protected String ram;
    protected String hdd;
    protected String cpu;

    public Pc(String ram, String hdd, String cpu) {
        this.ram = ram;
        this.cpu = cpu;
        this.hdd = hdd;
    }

    public Pc() {
    }

    @Override
    public String Getram() {
        return this.ram;
    }

    @Override
    public String GetHdd() {
        return this.hdd;
    }

    @Override
    public String GetCpu() {
        return this.cpu;
    }
    public String toString(){
        return "pc "+super.toString();
    }
}
