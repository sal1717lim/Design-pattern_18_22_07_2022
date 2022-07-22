package jour22072022.Strategy.strategy;

import java.util.Scanner;

public class PaypalStrategy implements IPaiementStrategy {
    private String email;
    private String password;

    PaypalStrategy(){
        System.out.println("donner le mail:");
        Scanner sc=new Scanner(System.in);
        this.email = sc.nextLine();
        System.out.println("donner le mot de passe:");
        this.password = sc.nextLine();
    }

    @Override
    public void payer(float p) {
        System.out.println("Vous avez payé : " + p + "avec l'application PAYPAL");
    }
}
