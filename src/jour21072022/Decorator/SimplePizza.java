package jour21072022.Decorator;

public class SimplePizza implements Pizza{

    @Override
    public String getDescription() {
        return "Tomate,fromage";
    }

    @Override
    public double getCost() {
        return 2;
    }
}
