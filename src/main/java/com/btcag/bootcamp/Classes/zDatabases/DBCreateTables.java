package com.btcag.bootcamp.Classes.zDatabases;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class DBCreateTables {
    public static void createTableUsers() {
        String sql = "CREATE TABLE IF NOT EXISTS User (" + "id INTEGER PRIMARY KEY AUTOINCREMENT, " + "username TEXT NOT NULL, " + "password TEXT NOT NULL," + "avatar Text NOT NULL" + ");";

        try (Connection conn = DBConnector.connect(); Statement stmt = conn.createStatement()) {
            stmt.execute(sql);
            System.out.println("Tabelle 'User' wurde erfolgreich erstellt.");

        } catch (SQLException e) {
            System.out.println("Fehler beim Erstellen der Tabelle 'User'.");
            e.printStackTrace();
        }

    }
}
