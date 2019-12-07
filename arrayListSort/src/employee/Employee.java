package employee;

public class Employee implements  Comparable<Employee>{
    private int rollNo;
    private String name;

    public Employee(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public String getName() {
        return name;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "rollNo=" + rollNo +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Employee obj){
        return this.name.compareTo(obj.name);
    }

}
