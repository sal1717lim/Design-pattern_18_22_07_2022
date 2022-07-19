package jour19072022;

public class Main {
    public static void main(String[] args) {
        Planfactory f1=new Planfactory();
        System.out.println(args[0]);
        Plan p1=f1.getplan(args[0]);
        p1.afficher();
    }
}
