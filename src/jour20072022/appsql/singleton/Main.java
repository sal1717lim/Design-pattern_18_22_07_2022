package jour20072022.appsql.singleton;

public class Main {

    public static void main(String[] args) {

        Sql x1 = Sql.getInstance();
        Sql x2 = Sql.getInstance();
        Sql x3 = Sql.getInstance();

        System.out.println(x1);
        System.out.println(x2);
        System.out.println(x3);

    }
}
