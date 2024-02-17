package services;

import database.Database;

public class DatabasePopulateService {
    public static void main(String[] args) {
        Database database = Database.getInstance();
        database.executeUpdate("src/main/java/sql/populate_db.sql");
    }
}
