package jour21072022.Decorator;

public class Main {
    public static void main(String[] args) {
        Pizza thonmozarella=new Thon(new Mozarella(new SimplePizza()));
        System.out.println(thonmozarella.getDescription());
        System.out.println(thonmozarella.getCost());
    }
}
