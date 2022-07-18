package jour18072022;

public abstract class Animal {
    protected float poid;
    protected String couleur;
    public void afficher(){
        System.out.println("le poid :"+poid+"\nla couleur :"+couleur);
    }
    public abstract void se_deplacer();
    public abstract void manger();
}
