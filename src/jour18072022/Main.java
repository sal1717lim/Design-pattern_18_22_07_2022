package jour18072022;

public class Main {
    public static void numbers(int i) throws NegativeException{
        if (i>=0){
            System.out.println("le nombre est positive");
        }else {
        throw new NegativeException(i);
        }
    }
    public static void main(String[] args) {
        Filepersonne p1=new Filepersonne("Aissi","Salim");

        p1.enfiler(new Filepersonne("Maaroufi","Karima"));
        p1.enfiler(new Filepersonne("DIAKHATE","Sidy"));
        Filepersonne.consulter(p1);
        p1=Filepersonne.defiler(p1);
        Filepersonne.consulter(p1);
        p1=Filepersonne.defiler(p1);
        Filepersonne.consulter(p1);
        p1=Filepersonne.defiler(p1);
        Filepersonne.consulter(p1);


    }
}