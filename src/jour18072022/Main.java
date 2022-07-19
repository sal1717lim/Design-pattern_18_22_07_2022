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

    public static void main(String[] args) {
        System.out.println(Main.puissance(5,10));

    }
}