package jour21072022.Iterator;

public class MainElement {
    public static void main(String[] args) {
        Stack pile=null;
        pile=Stack.empiler("salim",pile);
        pile=Stack.empiler("simon",pile);
        pile=Stack.empiler("karima",pile);
        pile=Stack.empiler("sidy",pile);
        pile=Stack.empiler("josee perec",pile);
        pile=Stack.empiler("dimitri",pile);
        Iterator e=pile.getIterator();
        while (e.hasnext()){
            System.out.println(e.next());
        }
    }
}
