package jour18072022;

import java.io.File;

public class Filepersonne {
    public String nom;
    public String prenom;
    public Filepersonne suivant;
    Filepersonne(){
        this.suivant=null;
    }
    Filepersonne(String nom,String prenom){
        this.nom=nom;
        this.prenom=prenom;
        this.suivant=null;
    }
    public void enfiler(Filepersonne e){

            Filepersonne e1=this;
            while(e1.suivant!=null){
                /*parcours vers la fin*/
                e1=e1.suivant;
            }
            e1.suivant=e;
            e.suivant=null;
        }
    public static boolean filevide(Filepersonne p1){
        return p1==null;
    }
    public static Filepersonne defiler(Filepersonne p1){


        if (!filevide(p1)){

            System.out.println("la personne defiler:"+p1.nom+" "+p1.prenom);
            p1=p1.suivant;
        }
        return p1;
    }
    public static void consulter(Filepersonne p1){
        if (!filevide(p1)){

            System.out.println("la personne en tete:"+p1.nom+" "+p1.prenom);
        }else{
            System.out.println("la file est vide");
        }

    }
}

