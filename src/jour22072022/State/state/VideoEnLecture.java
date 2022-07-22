package jour22072022.State.state;

public class VideoEnLecture implements IEtatVideo{

    public VideoEnLecture(){
    }

    @Override
    public void action(Video video) {
        System.out.println("play");
    }
}
