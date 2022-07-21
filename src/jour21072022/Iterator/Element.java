package jour21072022.Iterator;

public class Element {
    public int valeur;
    Element suivant;
    public Element(){
        this.suivant=null;
    }
    public IteratorElement getIterator(){
        return new IteratorElement(this);
    }
    public Element(int v){
        this.valeur=v;
        this.suivant=null;
    }
    public void ajoutfin(Element e){
        if (this.suivant==null){
            this.suivant=e;
            e.suivant=null;
        }
        else{
            Element e1=this;
            while(e1.suivant!=null){
                e1=e1.suivant;
            }
            e1.suivant=e;
            e.suivant=null;
        }
    }
    public void afficher(){
        Element e1=this;
        while(e1!=null){
            System.out.println(e1.valeur);
            e1=e1.suivant;
        }
    }

    @Override
    public String toString() {
        return "Element{" +
                "valeur=" + valeur +
                '}';
    }
}
