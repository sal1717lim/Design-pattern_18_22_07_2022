package jour21072022.Iterator;

public class Main {
    public static void main(String[] args) {
        CollectionOfNames c=new CollectionOfNames(5);
        c.names[0]="salim";
        c.names[1]="simon";
        c.names[2]="roger";
        c.names[3]="karim";
        c.names[4]="sidy";
        Iterator i=c.getIterator();
        while (i.hasnext()){
            System.out.println(i.next());
        }

    }
}
