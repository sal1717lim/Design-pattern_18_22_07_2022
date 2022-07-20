package jour20072022.Composite;

import java.util.Date;

public abstract class Element {
    private float taille;
    private Date date;
    protected int t;
    public abstract Element[] getChild() ;

    public float getTaille() {
        return taille;
    }

    public void setTaille(float taille) {
        this.taille = taille;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
    public abstract void afficher();
}
