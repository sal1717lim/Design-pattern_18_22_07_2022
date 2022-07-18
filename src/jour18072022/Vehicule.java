package jour18072022;

public class Vehicule {
    public String marque;
    public String modele;
    public int vitesse;
    public void demarrer(){
        System.out.println("je demarre");
    }
    public Vehicule(){

    }
    public Vehicule(String m,String modele,int v){
        this.marque=m;
        this.modele=modele;
        this.vitesse=v;
    }

}
