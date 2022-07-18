package jour18072022;

public class Vecteur2D {
    protected float x;
    protected float y;
    public static int nb_vecteur=0;

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }
    public Vecteur2D(float x,float y){
        this();
        this.x=x;
        this.y=y;

    }
    public Vecteur2D(){
        nb_vecteur++;

    }
    public String toString(){
        return "X = "+this.x+" - Y =" +this.y;
    }
    public Boolean equals(Vecteur2D e){
        return this.x==e.x && this.y==e.y;

    }
    public double norm(){
        return  Math.sqrt(this.x*this.x+this.y*this.y);
    }
    public int compare(Vecteur2D e){
        if(this.norm()>e.norm()) {
            return 1;
        } else if (this.norm()==e.norm()) {
            return 0;

        }else{
            return -1;
        }

    }
    public static int Scompare(Vecteur2D e1,Vecteur2D e2){
        if(e1.norm()>e2.norm()) {
            return 1;
        } else if (e1.norm()==e2.norm()) {
            return 0;

        }else{
            return -1;
        }
    }
}
