package jour19072022;

public class Domesticplan extends Plan{

    @Override
    public double calculateBill(int units) {
        return 50;
    }

    @Override
    public void afficher() {
        System.out.println("je suis un Domesticplan");
    }
}
