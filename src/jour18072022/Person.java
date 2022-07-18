package jour18072022;

public class Person {
    public String nom;
    public String prenom;
    public static int nombre=0;
    public Person(){
        this.nom="//";
        this.prenom="//";
        nombre++;
    }
    public Person(String nom,String prenom){
        this.nom=nom;
        this.prenom=prenom;
        nombre++;
    }
    public void afficher(){
        System.out.println("bonjour je suis :"+this.nom+" "+this.prenom);
    }
    public static void afficher_nombre(){
        System.out.println("le nombre d'objets est:"+nombre);

    }
}
