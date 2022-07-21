package jour21072022.Iterator;

public class CollectionOfNames implements GetIterator,Iterator{
    public String[] names;
    CollectionOfNames(int i){
        this.names=new String[i];
    }

    @Override
    public Iterator getIterator() {
        return new NamesIterator(this);
    }

    @Override
    public Object next() {
        return null;
    }

    @Override
    public Boolean hasnext() {
        return null;
    }
}
