package jour20072022;

public class Main {
    public static void main(String[] args){
        System.out.println("hello world!");
        Employee e1=new Employee(1278,"Aissi",1000,"doranco","formateur");
        Employee e2=new Employee(e1.getId(),e1.getName(),e1.getSalary(), e1.getAdress(), e1.getDesignation());

        Employee copy= (Employee) e1.getClone();
        copy.setId(1279);
        System.out.println(copy);
    }
}
