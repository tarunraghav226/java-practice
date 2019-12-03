package database;

import java.sql.*;

public class EmployeeConnection {
    private static final String DB_URL="jdbc:mysql://localhost:3306/test";
    private static final String DB_USER="root";
    private static final String pass="";
    Connection connection=null;

    public  Connection getConnection(){return connection;}

    public boolean makeConnection(){
        try{
            connection=DriverManager.getConnection(DB_URL,DB_USER,pass);
            if(connection!=null)
                return true;
        }
        catch (SQLException e){
            System.out.println("Exception while connecting to database");
        }
        return  false;
    }

    public boolean closeConnection(){
        if(connection!=null)
            return false;
        try{
            connection.close();
            return true;
        }
        catch (SQLException e){
            System.out.println("Exception occured while closing connection");
        }
        return false;
    }
}
