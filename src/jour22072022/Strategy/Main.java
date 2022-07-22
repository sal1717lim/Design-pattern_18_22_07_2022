package jour22072022.Strategy;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("choisir l'operation:");
        String s=sc.next();
        System.out.println("la chaine:"+s);
        Context context;
        if(s.equals("add")){
            context =new Context(new Addition());
        } else if (s.equals("sub")) {
            context =new Context(new Substraction());
        } else if (s.equals("mul")) {
            context =new Context(new Multiplication());
        }else{
            context =new Context(new Division());
        }

        try {
            System.out.println(context.executeStrategy(5,20));
        }catch (Exception e){
            System.out.println("division par 0");
        }

    }
}
