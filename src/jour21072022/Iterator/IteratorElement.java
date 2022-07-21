package jour21072022.Iterator;

public class IteratorElement implements Iterator{
    Element s;
    IteratorElement(Element s){
        this.s=s;

    }
    @Override

    public Object next() {
        Element x=s;
        s=s.suivant;
        return x;
    }

    @Override
    public Boolean hasnext() {
        return s!=null;
    }
}
