package computer;

public class Main {
    public static void main(String[] args) {
        Factorycreator f=new Factorycreator();
        AbstractFactory pc=f.getfactory("pc","16go","500go","3Ghz");
        Computer x=pc.createcomputer();
        Computer y=pc.createcomputer();
        System.out.println(x);
        System.out.println(y);
        pc=f.getfactory("server","16go","500go","3Ghz");
        Computer x2=pc.createcomputer();
        Computer y2=pc.createcomputer();
        System.out.println(x2);
        System.out.println(y2);

        pc=f.getfactory("server","64go","2To","8Ghz");
        Computer x3=pc.createcomputer();
        Computer y3=pc.createcomputer();
        System.out.println(x3);
        System.out.println(y3);
    }
}
