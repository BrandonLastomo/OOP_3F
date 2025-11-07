/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan11;

/**
 *
 * @author brand
 */

public class Mahasiswa {
    private String nama;
    private double tugas, uts, uas, rata;
    private char grade;
    private String hasil;

    public Mahasiswa(String nama, double tugas, double uts, double uas, double rata, char grade, String hasil) {
        this.nama = nama;
        this.tugas = tugas;
        this.uts = uts;
        this.uas = uas;
        this.rata = rata;
        this.grade = grade;
        this.hasil = hasil;
    }

    public String getNama() { return nama; }
    public double getTugas() { return tugas; }
    public double getUTS() { return uts; }
    public double getUAS() { return uas; }
    public double getRata() { return rata; }
    public char getGrade() { return grade; }
    public String getHasil() { return hasil; }
}

