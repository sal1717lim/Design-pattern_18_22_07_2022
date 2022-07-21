package jour21072022.Iterator;

public class StackIterator implements Iterator{
    public Stack s;

    public StackIterator(Stack s) {
        this.s = s;
    }

    @Override
    public Object next() {
        if(this.hasnext()){
            this.s=Stack.depiler(s);
            return s;
        }else{
            return null;
        }

    }

    @Override
    public Boolean hasnext() {
        return !Stack.pilevide(s);
    }
}
