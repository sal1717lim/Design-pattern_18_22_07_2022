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
        System.out.println(Main.produit(2,10));
        System.out.println(Main.cpt);

    }
}