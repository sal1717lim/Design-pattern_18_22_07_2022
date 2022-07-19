package jour18072022;

public class Binarytree {
    public int valeur;
    public boolean racine;
    public Binarytree droite;
    public Binarytree gauche;
    Binarytree(){
        this.droite=null;
        this.gauche=null;
    }
    Binarytree(int i,boolean b){
        this();
        this.racine=b;
        this.valeur=i;

    }
    public static void afficherarbre_largeur(Binarytree r){
        if(r!=null){
            if(r.racine==true){
                System.out.println(r.valeur);
            }
            if(r.gauche!=null){
                System.out.println(r.gauche.valeur);
            }
            if(r.droite!=null){
                System.out.println(r.droite.valeur);
            }
            afficherarbre_largeur(r.gauche);
            afficherarbre_largeur(r.droite);
        }
    }
    public static void afficherarbre_profondeur(Binarytree r){
        if(r!=null){

            System.out.println(r.valeur);

            afficherarbre_profondeur(r.gauche);
            afficherarbre_profondeur(r.droite);
        }
    }
    public static void afficherarbre_profondeur_inverse(Binarytree r){
        if(r!=null){
            afficherarbre_profondeur_inverse(r.gauche);
            afficherarbre_profondeur_inverse(r.droite);
            System.out.println(r.valeur);
        }
    }

}
