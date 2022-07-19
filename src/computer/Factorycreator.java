package computer;

public class Factorycreator {
    public AbstractFactory getfactory(String f,String ram,String hdd,String cpu){
        if(f.equals("pc")){
            return new PcFactory(ram,hdd,cpu);
        } else if (f.equals("server")) {
            return new ServerFactory(ram,hdd,cpu);
        }else{
            return null;
        }

    }
}
