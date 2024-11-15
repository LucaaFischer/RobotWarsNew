package com.btcag.bootcamp.Classes.zDatabases;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DBInserts {

    public static void insertUser(String username, String password, String avatar) {
        String sql = "INSERT INTO User(username, password, avatar) VALUES(?, ?, ?)";

        try (Connection conn = DBConnector.connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, username);
            pstmt.setString(2, password);
            pstmt.setString(3, avatar);
            pstmt.executeUpdate();
            System.out.println("User erfolgreich eingefügt.");

        } catch (SQLException e) {
            System.out.println("Fehler beim Einfügen des Users.");
            e.printStackTrace();
        }
    }
}
