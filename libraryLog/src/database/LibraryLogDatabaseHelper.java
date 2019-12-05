package database;

import java.sql.*;
import java.util.Date;

public class LibraryLogDatabaseHelper {
    public void addToRelation(Connection connection,int id,int studentId,int bookID,String issueDate,String returnDate){
        try{
            Statement statement=connection.createStatement();
            Date IssueDate=new Date(issueDate);
            System.out.println(IssueDate);
            Date ReturnDate = new Date(returnDate);
            String sql="insert into libraryLog values("+id+","+studentId+","+bookID+","+IssueDate+","+ReturnDate+");";
            statement.executeUpdate(sql);
        }
        catch (SQLException e){
            System.out.println("SQLException Occurred");
            e.printStackTrace();
        }
    }
}
