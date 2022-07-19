package jour19072022;

public class Institutionalplan extends Plan{
    @Override
    public double calculateBill(int units) {
        return 150;
    }
    public void afficher() {
        System.out.println("je suis un Institutionalplan");
    }
}
