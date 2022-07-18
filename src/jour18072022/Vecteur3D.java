package jour18072022;

public class Vecteur3D extends Vecteur2D{
    protected float z;

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        z = z;
    }
    public Vecteur3D(){
        super(); /*si on l'oublie c'est pas grave*/
    }
    public Vecteur3D(float x,float y,float z){
        super(x,y);
        this.z=z;
    }
    public String toString(){
        return super.toString()+" - Z ="+this.z;
            /*"X = "+this.x+" - Y =" +this.y*/
    }
    public Boolean equals(Vecteur3D e){
        return super.equals(e) && this.z==e.z;
            /*this.x==e.x && this.y==e.y;*/

    }
    public double norm(){
        return  Math.sqrt(this.x*this.x+this.y*this.y+this.z*this.z);
    }
}
