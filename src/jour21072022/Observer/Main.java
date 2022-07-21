package jour21072022.Observer;

public class Main {
    public static void main(String[] args) {
        Editor edit=new Editor();
        EmailListener e1=new EmailListener("e1");
        EmailListener e2=new EmailListener("e2");
        LoggingListener e3=new LoggingListener("e3");
        LoggingListener e4=new LoggingListener("e4");
        edit.eventManager.subscribe(e1);
        edit.eventManager.subscribe(e2);
        edit.eventManager.subscribe(e3);
        edit.eventManager.subscribe(e4);
        edit.openmail();
        edit.connect();
        edit.disconnect();
    }
}
