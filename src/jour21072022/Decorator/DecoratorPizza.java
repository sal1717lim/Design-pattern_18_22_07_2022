package jour21072022.Decorator;

public abstract class DecoratorPizza implements Pizza{
    protected Pizza p;

    public DecoratorPizza(Pizza p) {
        this.p = p;
    }
}
