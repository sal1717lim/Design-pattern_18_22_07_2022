package jour18072022;

public class Stack {
    public String mot;
    public Stack suivant;
    public static boolean pilevide(Stack p1){
        return p1==null;
    }
    public static void consulter(Stack p1){
        if (!pilevide(p1)){
            System.out.println(p1.mot);
        }
    }
    public static Stack empiler(String mot,Stack s){
        Stack e =new Stack();
        e.mot=mot;
        e.suivant=s;
        return e;
    }
    public static Stack depiler(Stack p1){
        String val="";
        if (!pilevide(p1)){
            val=p1.mot;
            p1=p1.suivant;
            System.out.println("l'element depiler:"+val);
        }
        return p1;

    }

}
