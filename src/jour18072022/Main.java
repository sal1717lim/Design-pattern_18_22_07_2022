package jour18072022;

public class Main {
    public static int facto(int n){
        int resultat;
        resultat=n;
        for (int i=n-1;i>=1;i--){
            resultat=resultat*i;
        }
        return resultat;
    }
    public static int puissance(int nombre,int puissance){
        if (puissance==1){
            return nombre;
        }else{
            return nombre*puissance(nombre,puissance-1);
        }
    }
    public static int somme(int N){
        if(N==1){
            return 1;
        }else{
            return N+somme(N-1);
        }
    }
    public static int factor(int n){
        if (n==0 || n==1){
            return 1;
        }else{
            return n*factor(n-1);
        }
    }
    public static int cpt=0;
    public static int produit(int nb1,int nb2){
        if(nb1==0 || nb2==0){
            return 0;
        }else{

            if(nb1<nb2){
                int _tmp=nb1;
                nb1=nb2;
                nb2=_tmp;
            }
            Main.cpt++;
            return nb1+produit(nb1,nb2-1);
        }
    }
    public static void main(String[] args) {

        Binarytree racine=new Binarytree(1,true);
        racine.gauche=new Binarytree(2,false);
        racine.droite=new Binarytree(3,false);
        racine.gauche.gauche=new Binarytree(4,false);
        racine.gauche.droite=new Binarytree(5,false);
        racine.droite.gauche=new Binarytree(6,false);
        racine.droite.droite=new Binarytree(7,false);
        racine.droite.gauche.gauche=new Binarytree(8,false);
        racine.droite.gauche.droite=new Binarytree(9,false);
        racine.droite.droite.droite=new Binarytree(10,false);
        Binarytree.afficherarbre_profondeur(racine);
    }
}