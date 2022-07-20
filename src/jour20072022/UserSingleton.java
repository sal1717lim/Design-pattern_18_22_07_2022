package jour20072022;

public class UserSingleton {
    private String nom;
    public static int nb=5;
    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getMail() {
        return mail;
    }

    public String getPassword() {
        return password;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    private String prenom;
    private String mail;
    private String password;
    private static UserSingleton singleton=new UserSingleton();
    private
    UserSingleton(){

    }
    private UserSingleton(String nom, String prenom, String mail, String password) {
        this.nom = nom;
        this.prenom = prenom;
        this.mail = mail;
        this.password = password;
    }

    public static UserSingleton getSingleton() {
        return singleton;
    }
}
