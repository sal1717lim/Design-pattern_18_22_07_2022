package computer;

public class ServerFactory extends AbstractFactory{
    public String ram;
    public String hdd;
    public String cpu;

    public ServerFactory(String ram, String hdd, String cpu) {
        this.ram = ram;
        this.hdd = hdd;
        this.cpu = cpu;
    }

    @Override
    public Computer createcomputer() {
        return new Serveur(this.ram,this.hdd,this.cpu);
    }
}
