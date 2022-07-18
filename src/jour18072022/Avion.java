package jour18072022;

public class Avion extends Vehicule{
    private int nb_moteur;
    public void decoller(){

        System.out.println(this.marque);
    }

    @Override

    public void demarrer() {
        super.demarrer();
        System.out.println("je demarre a haute vitesse");
    }
    public void demarrer(String s) {
        System.out.println("je demarre a haute vitesse "+s);
    }

    public Avion(String m, String modele, int vitesse, int nb_moteur){
        super(m,modele,vitesse);
        super.demarrer();
        this.nb_moteur=nb_moteur;
    }
}
