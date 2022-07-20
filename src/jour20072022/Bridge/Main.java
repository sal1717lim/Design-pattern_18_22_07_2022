package jour20072022.Bridge;

public class Main {
    public static void main(String[] args) {
        Triangle trianglerouge=new Triangle(new Red());
        Triangle trianglebleu=new Triangle(new Blue());
        Pentagon pentagonrouge=new Pentagon(new Red());
        Pentagon pentagonbleu=new Pentagon(new Blue());
        System.out.println(trianglerouge);
        System.out.println(trianglebleu);
        System.out.println(pentagonbleu);
        System.out.println(pentagonrouge);
        Pentagon pentagonvert=new Pentagon(new Green());
        Triangle trianglevert=new Triangle(new Green());
        System.out.println(pentagonvert);
        System.out.println(trianglevert);
        Caree squaregreen=new Caree(new Green());
        Caree squarered=new Caree(new Red());
        System.out.println(squaregreen);
        System.out.println(squarered);

    }
}
