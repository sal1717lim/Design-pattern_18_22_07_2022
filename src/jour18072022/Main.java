package jour18072022;

public class Main {
    public static void numbers(int i) throws NegativeException{
        if (i>=0){
            System.out.println("le nombre est positive");
        }else {
        throw new NegativeException(i);
        }
    }
    public static void main(String[] args) {
        Stack p1=new Stack();
        p1=Stack.empiler("Simon",p1);
        p1=Stack.empiler("Karima",p1);
        p1=Stack.empiler("Sidy",p1);
        Stack.consulter(p1);
        p1=Stack.depiler(p1);
        Stack.consulter(p1);
        p1=Stack.depiler(p1);
        Stack.consulter(p1);
    }
}