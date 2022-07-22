package jour22072022.State;

public class Main {
    public static void main(String[] args) {
        Statechange s=new Statechange(new Rich());
        System.out.println(s.checkState());
        s.saystate();
        System.out.println(s.checkState());
        s.saystate();
        System.out.println(s.checkState());

    }
}
