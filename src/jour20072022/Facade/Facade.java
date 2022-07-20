package jour20072022.Facade;

public class Facade {
    private ClassA a;
    private ClassB b;
    private ClassC c;
    private ClassD d;

    Facade(){
        a=new ClassA();
        b=new ClassB();
        c=new ClassC();
        d=new ClassD();

    }
    public void methode1(){
        a.Methode1();
        b.Methode1();
        c.Methode1();
        d.Methode1();

    }
    public void methode2(){
        a.Methode2();
        b.Methode2();
        c.Methode2();
        d.Methode2();
    }

}
