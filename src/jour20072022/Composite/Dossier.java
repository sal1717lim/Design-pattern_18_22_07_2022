package jour20072022.Composite;

public class Dossier extends Element{
    private Element[] child;

    public int getT() {
        return this.t;
    }

    public void setT(int t) {
        this.t = t;
    }


    Dossier(int i){
        child=new Element[i];
        this.t=i;
    }
    public Element[] getChild() {
        return child;
    }

    public void setChild(Element[] child) {
        this.child = child;
    }

    @Override
    public void afficher() {
        System.out.println("dossier");
        for(int i=0;i<this.getT();i++){
            if (child[i]!=null){
                child[i].afficher();
            }

        }

    }
}
