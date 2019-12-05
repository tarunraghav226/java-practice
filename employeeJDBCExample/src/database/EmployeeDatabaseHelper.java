package database;

import java.sql.*;

public class EmployeeDatabaseHelper {

    public void createDatabase(Connection connection,String databaseName){
        String sql="CREATE DATABASE "+databaseName;
        try {
            Statement statement = connection.createStatement();
            statement.executeUpdate(sql);
        }
        catch (SQLException e){
            System.out.println("Exception Occured while creating database");
        }
    }

    public void createTable(Connection connection,String tableName){
        String sql="create table "+tableName;
        try {
            Statement statement = connection.createStatement();
            statement.executeUpdate(sql);
        }
        catch (SQLException e){
            System.out.println("Exception occured while creating table");
        }
    }

    public void enterIntoTable(Connection connection,String tableName,int empID,String name){
        String sql="insert into "+tableName+" values("+empID+","+name+");";
        try{
            Statement statement=connection.createStatement();
            statement.executeUpdate(sql);
        }
        catch(SQLException e){
            System.out.println("Exception occured while entering into database");
        }
    }

    public ResultSet getAllEmployee(Connection connection,String tableName){
        String sql="SELECT * FROM "+tableName;
        try{
            Statement statement=connection.createStatement();
            return statement.executeQuery(sql);
        }
        catch (SQLException e){
            System.out.println("Exception occurred while fetching data");
        }
        catch (Exception e){
            System.out.println("Exception occurred in database helper --> Null Connection");
        }
        return null;
    }
}
