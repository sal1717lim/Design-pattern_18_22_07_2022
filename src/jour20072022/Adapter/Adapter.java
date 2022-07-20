package jour20072022.Adapter;

public class Adapter implements InterfaceVoiture{
    private Velo v;

    public Adapter(Velo v) {
        this.v = v;
    }

    public Adapter() {
    }

    @Override
    public void accelerer() {
        this.v.pedaler();
    }

    @Override
    public void freiner() {
        this.v.double_freinage();
    }

    @Override
    public void se_garer() {
        this.v.tirer_la_bequille();
    }
}
