package jour22072022.Strategy;

public class Division implements Stategy{

    @Override
    public float calculation(float a, float b) throws Exception {
        if(b!=0){
            return a/b;
        }else{
            throw new Exception();
        }

    }
}
