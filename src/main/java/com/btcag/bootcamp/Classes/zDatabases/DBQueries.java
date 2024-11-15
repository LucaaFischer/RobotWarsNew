package com.btcag.bootcamp.Classes.zDatabases;

import java.sql.*;

public class DBQueries {
    public static boolean tryLoggingIn(String userNameInput, String passwordInput) {
        String sql = "SELECT * FROM User WHERE username = ? AND password = ?";

        try (Connection conn = DBConnector.connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, userNameInput);
            pstmt.setString(2, passwordInput);
            ResultSet rs = pstmt.executeQuery();

            if (rs.isBeforeFirst()) {
                System.out.println("Willkommen " + userNameInput);
                return true;
            } else {
                System.out.println("Username oder Passwort falsch");
                return false;
            }

        } catch (SQLException e) {
            System.out.println("Fehler beim einloggen.");
            e.printStackTrace();
        }
        return false;
    }

    public static void selectAllUsers() {
        String sql = "SELECT * FROM User";
        try (Connection conn = DBConnector.connect();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("id") + "\t" +
                        "Username: " + rs.getString("username") + "\t" +
                        "Password: " + rs.getString("password"));
            }
        } catch (SQLException e) {
            System.out.println("Fehler beim Abrufen der Users.");
            e.printStackTrace();
        }
    }

    public static String selectAvatar(String username) {
        String sql = "SELECT * FROM User WHERE username = ?";

        try (Connection conn = DBConnector.connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, username);
            ResultSet rs = pstmt.executeQuery();

            if (rs.isBeforeFirst()) {
                return rs.getString("avatar");
            } else {
                return null;
            }

        } catch (SQLException e) {
            System.out.println("Fehler beim einloggen.");
            e.printStackTrace();
        }
        return null;
    }
}
