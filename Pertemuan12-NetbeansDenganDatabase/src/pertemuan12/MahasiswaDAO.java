/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan12;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MahasiswaDAO {

    public static void insert(Mahasiswa m) throws SQLException {
        String sql = "INSERT INTO mahasiswa (nama, tugas, uts, uas, rata, grade, hasil) VALUES (?, ?, ?, ?, ?, ?, ?)";
        try (Connection conn = DBConn.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, m.getNama());
            ps.setDouble(2, m.getTugas());
            ps.setDouble(3, m.getUTS());
            ps.setDouble(4, m.getUAS());
            ps.setDouble(5, m.getRata());
            ps.setString(6, String.valueOf(m.getGrade()));
            ps.setString(7, m.getHasil());
            ps.executeUpdate();
        }
    }

    public static void update(int id, Mahasiswa m) throws SQLException {
        String sql = "UPDATE mahasiswa SET nama=?, tugas=?, uts=?, uas=?, rata=?, grade=?, hasil=? WHERE id=?";
        try (Connection conn = DBConn.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, m.getNama());
            ps.setDouble(2, m.getTugas());
            ps.setDouble(3, m.getUTS());
            ps.setDouble(4, m.getUAS());
            ps.setDouble(5, m.getRata());
            ps.setString(6, String.valueOf(m.getGrade()));
            ps.setString(7, m.getHasil());
            ps.setInt(8, id);
            ps.executeUpdate();
        }
    }

    public static void delete(int id) throws SQLException {
        String sql = "DELETE FROM mahasiswa WHERE id=?";
        try (Connection conn = DBConn.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, id);
            ps.executeUpdate();
        }
    }

    public static List<Mahasiswa> getAll() throws SQLException {
        List<Mahasiswa> list = new ArrayList<>();
        String sql = "SELECT id, nama, tugas, uts, uas, rata, grade, hasil FROM mahasiswa";
        try (Connection conn = DBConn.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
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
                list.add(m);
            }
        }
        return list;
    }
}
