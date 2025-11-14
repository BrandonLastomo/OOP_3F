/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan12;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MahasiswaDAO { // crud ke database

    // create
    public static void insert(Mahasiswa m) throws SQLException {
        // bikin command sql buat insert (sesuain jumlah ? dan statement)
        String sql = "INSERT INTO mahasiswa (nama, tugas, uts, uas, rata, grade, hasil) VALUES (?, ?, ?, ?, ?, ?, ?)";
        try (Connection conn = DBConn.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            // data yang mau dimasukin
            ps.setString(1, m.getNama());
            ps.setDouble(2, m.getTugas());
            ps.setDouble(3, m.getUTS());
            ps.setDouble(4, m.getUAS());
            ps.setDouble(5, m.getRata());
            ps.setString(6, String.valueOf(m.getGrade()));
            ps.setString(7, m.getHasil());
            // jalanin command sql
            ps.executeUpdate();
        }
    }

    // update
    public static void update(int id, Mahasiswa m) throws SQLException {
        // bikin command sql
        String sql = "UPDATE mahasiswa SET nama=?, tugas=?, uts=?, uas=?, rata=?, grade=?, hasil=? WHERE id=?";
        try (Connection conn = DBConn.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            // data yang mau diupdate
            ps.setString(1, m.getNama());
            ps.setDouble(2, m.getTugas());
            ps.setDouble(3, m.getUTS());
            ps.setDouble(4, m.getUAS());
            ps.setDouble(5, m.getRata());
            ps.setString(6, String.valueOf(m.getGrade()));
            ps.setString(7, m.getHasil());
            ps.setInt(8, id);
            // jalanin command
            ps.executeUpdate();
        }
    }

    // delete
    public static void delete(int id) throws SQLException {
        // bikin command
        String sql = "DELETE FROM mahasiswa WHERE id=?";
        try (Connection conn = DBConn.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            // data yang mau dihapus
            ps.setInt(1, id);
            // jalanin command
            ps.executeUpdate();
        }
    }

    // read
    public static List<Mahasiswa> getAll() throws SQLException {
        List<Mahasiswa> list = new ArrayList<>();
        // bikin command
        String sql = "SELECT id, nama, tugas, uts, uas, rata, grade, hasil FROM mahasiswa";
        try (Connection conn = DBConn.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                // data yang mau diambil
                Mahasiswa m = new Mahasiswa();
                m.setId(rs.getInt("id"));
                m.setNama(rs.getString("nama"));
                m.setTugas(rs.getDouble("tugas"));
                m.setUTS(rs.getDouble("uts"));
                m.setUAS(rs.getDouble("uas"));
                m.setRata(rs.getDouble("rata"));
                String g = rs.getString("grade");
                m.setGrade((g != null && g.length() > 0) ? g.charAt(0) : ' ');
                m.setHasil(rs.getString("hasil"));
                // masukin data dari db ke arraylist
                list.add(m);
            }
        }
        // ambil arraylistnya
        return list;
    }
}
