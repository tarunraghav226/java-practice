package databaseHelper;

import employee.Employee;

public class EmployeeCRUD {
    private Employee employee;
    public Employee createEmployee(int empID,String name,double salary){
        return employee=new Employee(empID,name,salary);
    }

    public int getEmployeeID(){return employee.getEmpID();}
    public String getEmployeeName(){return employee.getName();}
    public double getEmployeeSalary(){return employee.getSalary();}

    public void updateEmployee(int empID){employee.setEmpID(empID);}
    public void updateEmployeeName(String name){employee.setName(name);}
    public void updateEmployeeSalary(double salary){employee.setSalary(salary);}

    public boolean deleteEmployee(Employee emp){
        //delete employee
        return false;
    }
}
