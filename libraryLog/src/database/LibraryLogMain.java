package database;

import java.sql.Connection;
import java.util.Scanner;

public class LibraryLogMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        LibraryLogDatabaseConnection connection=new LibraryLogDatabaseConnection();
        if(connection.makeConnection()){
            LibraryLogDatabaseHelper databaseHelper=new LibraryLogDatabaseHelper();
            System.out.println("Do You Want To Issue Book");
            if(scan.next().charAt(0)=='y') {
                int issueNumber=databaseHelper.addToRelation(connection.getConnection(), 12, 1);
                System.out.println("Your Issue Number Is "+issueNumber+"\nRemember This Number When You Come To Return Book");
            }
            else{
                int issueNumber=scan.nextInt();
                databaseHelper.returnBook(connection.getConnection(),issueNumber);
            }
        }
    }
}
