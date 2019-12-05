package database;

import employee.Employee;

import java.sql.ResultSet;
import java.sql.SQLException;

public class EmployeeDatabaseMain {
    public static void main(String[] args) {
        EmployeeConnection employeeConnection =new EmployeeConnection();
        if(employeeConnection.makeConnection())
            System.out.println("Connection Successful");
        else
            System.out.println("Connection not established");

        EmployeeDatabaseHelper employeeDatabaseHelper=new EmployeeDatabaseHelper();
        ResultSet data = employeeDatabaseHelper.getAllEmployee(employeeConnection.getConnection(),"Employee");
        while(true){
            try{
                if(!data.next())break;
            }
            catch (SQLException e){
                System.out.println("Something Gone Wrong At data.next()");
                break;
            }
            catch(Exception e){
                System.out.println("Exception occurred --> Null Connection");
                break;
            }
            try{
                System.out.println("Employee Name-->"+data.getString("empName"));
            }
            catch (SQLException e){
                System.out.println("Something happened at data.getString()");
                break;
            }
            catch (Exception e){
                System.out.println("Exception occurred -->2 ");
                break;
            }
        }

        if(employeeConnection.getConnection()!=null)
            if(employeeConnection.closeConnection())
                System.out.println("Closed Connection");
            else
                System.out.println("Something gone wrong at employeeConnection.closeConnection()");
    }
}
