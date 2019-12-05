package database;

import java.sql.*;

public class LibraryLogDatabaseConnection {
    private static final String DB_URL="jdbc:mysql://localhost:3306/Library";
    private static final String DB_USER="root";
    private static final String PASSWORD="";
    Connection connection=null;

    public Connection getConnection(){return this.connection;}

    public boolean makeConnection(){
        boolean isConnected=false;
        try{
            connection=DriverManager.getConnection(DB_URL,DB_USER,PASSWORD);
            if(connection!=null)
                isConnected=true;
        }
        catch (SQLException e){
            System.out.println("Connection Not Setup");
            isConnected=false;
        }
        return isConnected;
    }

    public boolean closeConnection(){
        if(connection==null)
            return false;
        try{
            this.getConnection().close();
            return true;
        }
        catch (SQLException e){
            System.out.println("Connection Not Closed");
            return false;
        }
    }
}
