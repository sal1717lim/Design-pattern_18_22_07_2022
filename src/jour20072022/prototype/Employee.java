package jour20072022.prototype;

public class Employee implements Prototype{
    private int id;
    private String name;
    private double salary;
    private String adress;
    private String designation;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public String getAdress() {
        return adress;
    }

    public String getDesignation() {
        return designation;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public Employee() {
    }

    public Employee(int id, String name, double salary, String adress, String designation) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.adress = adress;
        this.designation = designation;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", adress='" + adress + '\'' +
                ", designation='" + designation + '\'' +
                ","+super.toString()+"}";
    }

    public void showRecord(){
        System.out.println(this);
    }

    @Override
    public Prototype getClone() {
        return new Employee(this.id,this.name,this.salary,this.adress,this.designation);
    }
}
