/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan12;

import java.sql.Connection; // nampung data sql/database
import java.sql.DriverManager; // ngelola/ngurus data
import java.sql.SQLException; // handle eror

public class DBConn{
    private static final String URL = "jdbc:mysql://localhost:3306/data_mahasiswa";
    private static final String USER = "root";
    private static final String PASS = "";

    public static Connection getConnection() throws SQLException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); // panggil driver
        } catch (ClassNotFoundException e) {
            // jika tidak ada driver
            System.err.println("Driver MySQL tidak ditemukan: " + e.getMessage());
        }
        // jika ada, ambil koneksi ke db
        return DriverManager.getConnection(URL, USER, PASS);
    }
}
