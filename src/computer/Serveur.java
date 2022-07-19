package computer;

public class Serveur  extends Computer {

    protected String ram;
    protected String hdd;
    protected String cpu;

    public Serveur(String ram, String hdd, String cpu) {
        this.ram = ram;
        this.hdd = hdd;
        this.cpu = cpu;
    }
    public String toString(){
        return "server "+super.toString();
    }

    public Serveur() {
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

}
