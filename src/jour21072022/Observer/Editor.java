package jour21072022.Observer;

public class Editor {
    EventManager eventManager;
    Editor(){
        this.eventManager= new EventManager(5);
    }
    public void openmail(){
        this.eventManager.notify("Ouverture");
    }
    public void savemail(){
        this.eventManager.notify("Save");
    }
    public void connect(){
        this.eventManager.notify("Connexion");
    }
    public void disconnect(){
        this.eventManager.notify("Deconnexion");
    }

}
