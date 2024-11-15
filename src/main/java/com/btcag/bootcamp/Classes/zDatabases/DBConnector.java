package com.btcag.bootcamp.Classes.zDatabases;

import java.sql.*;
import java.sql.ResultSet;

public class DBConnector {
    private static final String URL = "jdbc:sqlite:C:/Users/lucaf/Desktop/sqlite_tools/Bootcamp_DB_2024.db";

    public static Connection connect() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(URL);
            System.out.println("Verbindung zur SQLite-Datenbank hergestellt.");
        } catch (SQLException e) {
            System.out.println("Verbindung zur SQLite-Datenbank fehlgeschlagen.");
            e.printStackTrace();
        }
        return conn;
    }
}