package jour20072022;

public class Main {
    public static void main(String[] args){
        Director d=new Director();
        Car sport=d.creerC4GpsSport();
        Car classique=d.creerC4();
        Car f = d.creerC4SW();
        System.out.println(f);
        System.out.println(sport);
        System.out.println(classique);

    }
}
