package jour22072022.Strategy;

public class Context {
    public Stategy s;

    public Context(Stategy s) {
        this.s = s;
    }
    public float executeStrategy(float a,float b) throws Exception {
        return this.s.calculation(a,b);
    }
}
