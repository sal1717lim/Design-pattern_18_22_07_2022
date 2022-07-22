package jour22072022.Strategy.strategy;

public class Article {
    private String nom;
    private float prix;

    public Article(String nom, float prix) {
        this.nom = nom;
        this.prix = prix;
    }

    public void payer(IPaiementStrategy ip){

        ip.payer(this.prix);
    }
}
