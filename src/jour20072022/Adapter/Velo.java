package jour20072022.Adapter;

public class Velo implements InterfaceVelo{
    @Override
    public void pedaler() {
        System.out.println("je pedale");
    }

    @Override
    public void double_freinage() {
        System.out.println("je fait un double freinage");
    }

    @Override
    public void tirer_la_bequille() {
        System.out.println("je tire la bequille");
    }
}
