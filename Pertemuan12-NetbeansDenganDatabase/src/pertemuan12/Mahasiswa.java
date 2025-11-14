/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan12;

public class Mahasiswa {
    private int id;
    private String nama;
    private double tugas, uts, uas, rata;
    private char grade;
    private String hasil;

    public Mahasiswa() {}

    public Mahasiswa(int id, String nama, double tugas, double uts, double uas, double rata, char grade, String hasil) {
        this.id = id;
        this.nama = nama;
        this.tugas = tugas;
        this.uts = uts;
        this.uas = uas;
        this.rata = rata;
        this.grade = grade;
        this.hasil = hasil;
    }

    public Mahasiswa(String nama, double tugas, double uts, double uas, double rata, char grade, String hasil) {
        this(0, nama, tugas, uts, uas, rata, grade, hasil);
    }

    // getters & setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getNama() { return nama; }
    public void setNama(String nama) { this.nama = nama; }
    public double getTugas() { return tugas; }
    public void setTugas(double tugas) { this.tugas = tugas; }
    public double getUTS() { return uts; }
    public void setUTS(double uts) { this.uts = uts; }
    public double getUAS() { return uas; }
    public void setUAS(double uas) { this.uas = uas; }
    public double getRata() { return rata; }
    public void setRata(double rata) { this.rata = rata; }
    public char getGrade() { return grade; }
    public void setGrade(char grade) { this.grade = grade; }
    public String getHasil() { return hasil; }
    public void setHasil(String hasil) { this.hasil = hasil; }
}
