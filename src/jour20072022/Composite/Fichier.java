package jour20072022.Composite;

public class Fichier extends Element{
    private String extension;

    public Fichier(String extension) {
        this.t=0;
        this.extension = extension;
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    @Override
    public Element[] getChild() {
        return null;
    }

    @Override
    public void afficher() {
        System.out.println("fichier"+extension);

    }
}
