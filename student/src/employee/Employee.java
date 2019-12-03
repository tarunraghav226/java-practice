package employee;

public class Employee {
    private int empID;
    private  String name;
    private double salary;

    public Employee(){
        this.empID=0;
        this.name="dummy";
        this.salary=0;
    }

    public Employee(int empID,String name,double salary){
        this.empID=empID;
        this.name=name;
        this.salary=salary;
    }

    public int getEmpID() {return this.empID;}
    public String getName() {return this.name;}
    public double getSalary(){return this.salary;}

    public void setEmpID(int empID) {this.empID = empID;}
    public void setName(String name) {this.name = name;}
    public void setSalary(double salary) {this.salary = salary;}

    @Override
    public String toString(){
        return this.getEmpID()+":"+this.getName()+":"+this.getSalary();
    }
}
