package jour19072022;

public class Commercialplan extends Plan{
    @Override
    public double calculateBill(int units) {
        return 80;
    }
    public void afficher() {
        System.out.println("je suis un Commercialplan");
    }
}
