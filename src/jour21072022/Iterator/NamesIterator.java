package jour21072022.Iterator;

public class NamesIterator implements Iterator{
    public int i;
    public CollectionOfNames c;

    public NamesIterator(CollectionOfNames c) {
        this.c = c;
        i=-1;
    }

    @Override
    public Object next() {
        if(this.hasnext()){
            i++;
            return c.names[i];
        }else{
            return null;
        }

    }

    @Override
    public Boolean hasnext() {
        return this.i!=(c.names.length-1);
    }
}
