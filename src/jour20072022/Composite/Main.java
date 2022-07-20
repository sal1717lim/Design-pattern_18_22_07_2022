package jour20072022.Composite;

public class Main {
    public static void main(String[] args) {
        Dossier d=new Dossier(3);
        d.getChild()[0]=new Fichier("png");
        d.getChild()[1]=new Fichier("mp3");
        d.getChild()[2]=new Dossier(2);
        d.getChild()[2].getChild()[0]=new Fichier("mp4");
        d.getChild()[2].getChild()[1]=new Fichier("jpg");
        d.afficher();
    }
}
