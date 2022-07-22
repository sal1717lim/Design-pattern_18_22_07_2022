package jour22072022.Strategy.strategy;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choisir votre mode paiement carte ou paypal: ");
        String val = sc.nextLine();
        IPaiementStrategy crt;
        if (val.equals("carte")){
            crt = new CarteDeCreditStrategy();
        }else {
            crt = new PaypalStrategy();
        }

        Article monAticle = new Article("Chaussures",100);


        monAticle.payer(crt);


    }
}
