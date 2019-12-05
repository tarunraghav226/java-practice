package database;

import java.sql.*;
import java.time.LocalDate;
import java.util.Date;

public class LibraryLogDatabaseHelper {
    public int addToRelation(Connection connection,int studentId,int bookID){
        try{
            Statement statement=connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select count(*) from libraryLog;");

            int count=0;
            while(resultSet.next()) {
                count = resultSet.getInt(1);
            }

            String IssueDate=java.time.LocalDate.now().toString();
            StringBuffer sql=new StringBuffer("insert into libraryLog (id,Student_ID,Book_No,Issue_Date) values(");
            sql.append(Integer.valueOf(++count).toString()+",");
            sql.append(Integer.valueOf(studentId).toString()+",");
            sql.append(Integer.valueOf(bookID).toString()+",");
            sql.append("'"+IssueDate+"');");
            statement.executeUpdate(sql.toString());
            return count;
        }
        catch (SQLException e){
            System.out.println("SQLException Occurred");
            e.printStackTrace();
            return 0;
        }
    }

    public void returnBook(Connection connection,int issueNumber){
        try{
            Statement statement=connection.createStatement();
            String returnDate=java.time.LocalDate.now().toString();
            StringBuffer sql=new StringBuffer("update libraryLog set Return_Date=");
            sql.append("'"+returnDate+"' where ID=");
            sql.append(Integer.valueOf(issueNumber).toString()+";");
            statement.executeUpdate(sql.toString());
        }
        catch (SQLException e){
            System.out.println("SQLException Occurred");
            e.printStackTrace();
        }
    }
}