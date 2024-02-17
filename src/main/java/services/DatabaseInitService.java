package services;

import database.Database;

public class DatabaseInitService {
    public static void main(String[] args) {
        Database database = Database.getInstance();
        database.executeUpdate("src/main/java/sql/init_db.sql");
    }
}
