/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan12;

/**
 *
 * @author brand
 */
public class NilaiMhs {
    double tugas, uts, uas, rata;
    char grade;
    
    double nilaiRata() {
        rata = (tugas + uts + uas) / 3.0;
        return rata;
    }
}

