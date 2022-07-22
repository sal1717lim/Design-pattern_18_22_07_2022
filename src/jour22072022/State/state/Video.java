package jour22072022.State.state;

public class Video{

    public IEtatVideo state;

    public void setState(IEtatVideo state) {
        this.state = state;
    }
    public Video() {
        this.state = new VideoEnPause();
    }
    public Video(IEtatVideo state) {
        this.state = state;
    }

    public void changeState(){
        if(this.state instanceof VideoEnLecture){
            this.state =  new VideoEnPause();
        }else if(this.state instanceof VideoEnPause) {
            this.state = new Stop();
        }else {
            this.state=new VideoEnLecture();
        }
    }





    public void action() {
        this.state.action(this);
        changeState();
    }

}
