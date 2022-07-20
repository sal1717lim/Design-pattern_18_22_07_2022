package jour20072022;

public class CarBuilder implements Builder{
    public Car car;
    CarBuilder(){
            this.reset();
    }
    @Override

    public CarBuilder setEngine(int puissance) {
        car.setPuissance(puissance);
        return this;
    }

    @Override
    public CarBuilder setSeat(int s) {
        car.setSeat(s);
        return this;
    }

    @Override
    public CarBuilder setMarque(String marque) {
       car.setMarque(marque);
       return this;
    }

    @Override
    public CarBuilder setGps(boolean b) {
            car.setGps(b);
            return this;
    }

    @Override
    public void reset() {
            this.car=new Car();
    }
    public Car getResult(){
        return this.car;

    }
}
