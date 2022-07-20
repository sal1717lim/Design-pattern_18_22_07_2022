package jour20072022.Adapter;

public class Voiture implements InterfaceVoiture{
    @Override
    public void accelerer() {
        System.out.println("j'accelere");
    }

    @Override
    public void freiner() {
        System.out.println("je freine");
    }

    @Override
    public void se_garer() {
        System.out.println("je suis garé");
    }
}
