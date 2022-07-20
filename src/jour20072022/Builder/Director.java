package jour20072022.Builder;

public class Director {
    public CarBuilder b1;
    public Car creerC4Gps(){
        b1=new CarBuilder();
        return b1.setGps(true).setMarque("Citreon").setSeat(5).setEngine(70).getResult();


    }
    public void testbuilder(){
        b1=new CarBuilder();
        System.out.println(b1);
        b1=b1.setEngine(5);
        System.out.println(b1);
    }
    public Car creerC4SW(){
        b1=new CarBuilder();
        return b1.setGps(true).setMarque("Citreon").setSeat(7).setEngine(100).getResult();


    }
    public Car creerC4GpsSport(){
        b1=new CarBuilder();
        return b1.setGps(true).setMarque("Citreon").setSeat(5).setEngine(150).getResult();


    }
    public Car creerC4(){
        return b1.setGps(false).setMarque("Citreon").setSeat(5).setEngine(70).getResult();


    }
}
