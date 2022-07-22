package jour22072022.State.state;

public class Stop implements IEtatVideo{
    @Override
    public void action(Video video) {
        System.out.println("STOP");
    }
}
