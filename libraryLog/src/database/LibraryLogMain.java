package database;

public class LibraryLogMain {
    public static void main(String[] args) {
        LibraryLogDatabaseConnection connection=new LibraryLogDatabaseConnection();
        if(connection.makeConnection()){
            LibraryLogDatabaseHelper databaseHelper=new LibraryLogDatabaseHelper();
            databaseHelper.addToRelation(connection.getConnection(),1,1,1,"5/12/2019","6/12/2019");

        }
    }
}
