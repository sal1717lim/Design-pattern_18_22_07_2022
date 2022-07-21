package jour21072022.Iterator;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;

public class Main2 {
    public static void main(String[] args) {
        List <Integer>e=new ArrayList<>() ;
        e.add(5);
        e.add(7);
        e.add(25);
        e.add(48);
        ListIterator a=e.listIterator();

        while(a.hasNext()){
            System.out.println("index:"+a.nextIndex());
            System.out.println(a.next());

        }


        a=e.listIterator();

        System.out.println("\n\n///boucle avec probleme////");
        try {
            while (a.next()!=null){
                System.out.println(a.next());
            }
        }catch (NoSuchElementException b){

        }

    }
}
