/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Mobil;
import Kendaraan.Mobil;

/**
 *
 * @author brand
 */
public class Chevrolet extends Mobil{
    public void displayMerek(){
        System.out.println("Ini adalah mobil chevrolet");
    }
    
    // writeOnly
    
    @Override
    // overriding tipe data dan jumlah parameter harus sama.
    // Nama method harus sama
    public void setBatasPajak(int jangkaTahun){
        this.batasPajak = tahunProduksi+10+jangkaTahun;
    }
}
