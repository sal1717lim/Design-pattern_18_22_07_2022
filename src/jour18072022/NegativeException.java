package jour18072022;

public class NegativeException extends Exception{
    NegativeException(int i){
        System.out.println("le nombre "+i+" est negative");
    }
}
