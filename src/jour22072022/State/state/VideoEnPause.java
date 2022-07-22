package jour22072022.State.state;

public class VideoEnPause implements IEtatVideo{

    public VideoEnPause() {
    }

    @Override
    public void action(Video video) {
        System.out.println("Pause");
    }
}
