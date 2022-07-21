package jour21072022.Observer;

public class LoggingListener implements Event{
    public String name;

    public LoggingListener(String name) {
        this.name = name;
    }

    @Override
    public void update(String fileEvent) {
        if (fileEvent.equals("Connexion")){
            System.out.println(this.name+":connexion a l'utilisateur");
        }else if(fileEvent.equals("Deconnexion")){
            System.out.println(this.name+":deconnexion a l'utilisateur");
        }
    }
}
