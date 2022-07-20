package jour20072022.appsql.singleton;

public class Sql {
    private static final String URL = "https://wwww.google.fr";
    private static Sql instance = null;

    public static Sql getInstance(){
        if(instance == null){
            instance = new Sql();
        }
        return instance;
    }

    private Sql() {
    }

}
