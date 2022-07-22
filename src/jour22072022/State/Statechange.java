package jour22072022.State;

public class Statechange {
    public State etat;

    public Statechange(State etat) {
        this.etat = etat;
    }

    public void changeState(){
        if(this.etat instanceof Poor){
            this.etat=new Rich();
        }else{
            this.etat=new Poor();
        }
    }
    public String checkState(){
        if(this.etat instanceof Poor){
            return "Poor";
        }else{
            return "Rich";
        }
    }
    public void saystate(){
        etat.saysomethink();
        changeState();
    }
}
