package jour20072022.Adapter;

public class Main {
    public static void main(String[] args){
        Voiture v=new Voiture();
        Velo vtt=new Velo();
        Adapter a=new Adapter(vtt);
        v.accelerer();
        a.accelerer();
        v.freiner();
        a.freiner();
        v.se_garer();
        a.se_garer();
    }
}
