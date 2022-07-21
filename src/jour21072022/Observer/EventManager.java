package jour21072022.Observer;

public class EventManager {
    public Event[] list;
    public int place;
    public int taille;
    EventManager(int i){
        this.place=i-1;
        this.taille=i;
        list=new Event[i];
    }
    public void subscribe(Event e){
        if (this.place>=0){
            this.list[this.place]=e;
            this.place--;
        }
    }
    public void unsubscribe(){
        this.list[this.place]=null;
        this.place++;
    }
    public void notify(String message){
        for(int i=this.place+1;i<this.taille;i++){
            this.list[i].update(message);
        }
    }

}
