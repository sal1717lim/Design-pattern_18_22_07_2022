package computer;

public abstract class Computer {


    public abstract String Getram();
    public abstract String GetHdd();
    public abstract String GetCpu();

    public String toString(){
        return "Taille Ram : " + Getram() + " Taille Disque : " + GetHdd() + " Cadence CPU : " + GetCpu();

    }
}
