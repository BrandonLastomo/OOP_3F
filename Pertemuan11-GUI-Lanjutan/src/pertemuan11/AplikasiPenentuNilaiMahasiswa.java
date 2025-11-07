package pertemuan11;

import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.io.*;
import java.util.ArrayList;

public class AplikasiPenentuNilaiMahasiswa extends javax.swing.JFrame {
    NilaiMhs2 nm = new NilaiMhs2();
    DefaultTableModel model;

    public AplikasiPenentuNilaiMahasiswa() {
        initComponents();
        setLocationRelativeTo(null);
        initTable();
    }

    private void initTable() {
        model = new DefaultTableModel(new String[]{"Nama", "Tugas", "UTS", "UAS", "Rata", "Grade", "Hasil"}, 0);
        jTable1.setModel(model);
    }

    private void muatData() {
        model.setRowCount(0);
        for (Mahasiswa m : MahasiswaData.getAll()) {
            model.addRow(new Object[]{
                m.getNama(), m.getTugas(), m.getUTS(), m.getUAS(),
                m.getRata(), m.getGrade(), m.getHasil()
            });
        }
    }

    private void tambahData() {
        try {
            nm.tugas = Double.parseDouble(tugasInput.getText());
            nm.uts = Double.parseDouble(utsInput.getText());
            nm.uas = Double.parseDouble(uasInput.getText());
            double rata = nm.nilaiRata();
            char grade = nm.gradeMhs();
            String hasil = nm.hasil();

            Mahasiswa m = new Mahasiswa(
                nameInput.getText(),
                nm.tugas, nm.uts, nm.uas, rata, grade, hasil
            );
            MahasiswaData.tambah(m);
            muatData();
            bersihkanForm();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Pastikan semua input angka benar!");
        }
    }

    private void updateData() {
        int row = jTable1.getSelectedRow();
        if (row == -1) {
            JOptionPane.showMessageDialog(this, "Pilih data yang ingin diupdate!");
            return;
        }

        nm.tugas = Double.parseDouble(tugasInput.getText());
        nm.uts = Double.parseDouble(utsInput.getText());
        nm.uas = Double.parseDouble(uasInput.getText());
        double rata = nm.nilaiRata();
        char grade = nm.gradeMhs();
        String hasil = nm.hasil();

        Mahasiswa m = new Mahasiswa(
            nameInput.getText(),
            nm.tugas, nm.uts, nm.uas, rata, grade, hasil
        );
        MahasiswaData.update(row, m);
        muatData();
        bersihkanForm();
    }

    private void hapusData() {
        int row = jTable1.getSelectedRow();
        if (row == -1) {
            JOptionPane.showMessageDialog(this, "Pilih data yang ingin dihapus!");
            return;
        }
        MahasiswaData.hapus(row);
        muatData();
        bersihkanForm();
    }

    private void bersihkanForm() {
        nameInput.setText("");
        tugasInput.setText("");
        utsInput.setText("");
        uasInput.setText("");
    }

    private void simpanKeFile() {
        try (BufferedWriter out = new BufferedWriter(new FileWriter("dataMahasiswa.txt"))) {
            for (Mahasiswa m : MahasiswaData.getAll()) {
                out.write(m.getNama() + "," + m.getTugas() + "," + m.getUTS() + "," +
                          m.getUAS() + "," + m.getRata() + "," + m.getGrade() + "," +
                          m.getHasil());
                out.newLine();
            }
            JOptionPane.showMessageDialog(this, "Data berhasil disimpan ke file!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Gagal menyimpan file!");
        }
    }

    // --- Kode GUI (bisa dibuat manual atau lewat NetBeans GUI Builder)
    // Untuk ringkas, saya hanya jelaskan bagian tombol utama:
    // Tombol Tambah, Update, Hapus, Simpan, Keluar

    private void hitungBtnActionPerformed(java.awt.event.ActionEvent evt) {
        tambahData();
    }

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {
        updateData();
    }

    private void hapusBtnActionPerformed(java.awt.event.ActionEvent evt) {
        hapusData();
    }

    private void simpanBtnActionPerformed(java.awt.event.ActionEvent evt) {
        simpanKeFile();
    }

    private void keluarBtnActionPerformed(java.awt.event.ActionEvent evt) {
        int reply = JOptionPane.showConfirmDialog(null, "Yakin ingin keluar?", "Konfirmasi", JOptionPane.YES_NO_OPTION);
        if (reply == JOptionPane.YES_OPTION) System.exit(0);
    }
}
