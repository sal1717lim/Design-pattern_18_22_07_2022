package jour21072022.Decorator;

public class Mozarella extends DecoratorPizza{
    public Mozarella(Pizza p) {
        super(p);
    }

    @Override
    public String getDescription() {
        return this.p.getDescription()+",Mozarella";
    }

    @Override
    public double getCost() {
        return this.p.getCost()+0.75;
    }
}
