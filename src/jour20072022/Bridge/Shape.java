package jour20072022.Bridge;

public abstract class Shape {
    private Color couleur;
    private String name;

    @Override
    public String toString() {
        return "Shape{" +
                "couleur=" + couleur +
                ", name='" + name + '\'' +
                '}';
    }

    public Shape(Color couleur, String name) {
        this.couleur = couleur;
        this.name = name;
    }

    public Color getCouleur() {
        return couleur;
    }

    public void setCouleur(Color couleur) {
        this.couleur = couleur;
    }
}
