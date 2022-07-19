package computer;

public class ComputerFactory {
    public  Computer GetComputer(String ram, String hdd, String cpu, String type){
        if(type.equals("serveur")){
            return new Serveur(ram,hdd,cpu);
        } else if(type.equals("pc")){
            return new Pc(ram,hdd,cpu);
        } else {
            return null;
        }
    }
}
