/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javagrantnagy.database;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author sqlitetutorial.net
 */
public class App {

    private Connection connect() {
        Connection conn = null;
        try {

            String url = "jdbc:sqlite:C:/Users/Grant/Projects/java-grantnagy/database/sqlite/dbtest.db";
            conn = DriverManager.getConnection(url);
            System.out.println("Connection to SQLite has been established.");

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }

        }
        return conn;
    }

    public static void createNewDatabase(String fileName) {

        String url = "jdbc:sqlite:C:/Users/Grant/Projects/java-grantnagy/database/sqlite/test.db";

        try (Connection conn = DriverManager.getConnection(url)) {
            if (conn != null) {
                DatabaseMetaData meta = conn.getMetaData();
                System.out.println("The driver name is " + meta.getDriverName());
                System.out.println("A new database has been created.");
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void insert(String Project, String Classname, String Status) {
        String sql = "INSERT INTO Proejcts(Project, Classname Status) VALUES(?,?)";

        try (Connection conn = this.connect();
                PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, Project);
            pstmt.setString(2, Classname);
            pstmt.setString(3, Status);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void createNewTable() {
        // SQL statement for creating a new table
        String sql = "CREATE TABLE IF NOT EXISTS Projects (\n"
                + "	id integer PRIMARY KEY,\n"
                + "	name text NOT NULL,\n"
                + "	capacity real\n"
                + ");";

        try (Connection conn = connect();
                Statement stmt = conn.createStatement()) {
            // create a new table
            stmt.execute(sql);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new App().run();

    }

    void run() {
        createNewDatabase("test.db");
        createNewTable();
        insert("Hello World", "Java", "Completed");
        insert("Kattis #1", "Java", "Completed");
        insert("Collections", "Java", "Completed");
        insert("Threads", "Java", "Completed");
        insert("Database", "Java", "In Progress");
       
    }
}
