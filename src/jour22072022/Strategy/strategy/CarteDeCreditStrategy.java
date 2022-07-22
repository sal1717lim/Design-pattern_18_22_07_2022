package jour22072022.Strategy.strategy;

import java.util.Scanner;

public class CarteDeCreditStrategy implements IPaiementStrategy {

    private String numeroDeCarte;
    private String cryptogram;
    private String date;

    public CarteDeCreditStrategy() {
        System.out.println("donner le numero de carte de credit:");
        Scanner sc=new Scanner(System.in);
        this.numeroDeCarte = sc.nextLine();
        System.out.println("donner le cryptogram:");
        this.cryptogram = sc.nextLine();
        System.out.println("donner la date:");
        this.date = sc.nextLine();
    }

    @Override
    public void payer(float p) {
        System.out.println("Vous avez payé : " + p + "avec l'application CARTE DE CREDIT");
    }
}
