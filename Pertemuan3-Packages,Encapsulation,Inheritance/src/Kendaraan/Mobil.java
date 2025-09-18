/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Kendaraan;

/**
 *
 * @author brand
 */
public class Mobil implements methodKendaraan{
    private String warna = "putih";
    private int tahunProduksi = 2005;
    private int batasPajak;
    
    // readonly
    public String getWarna(){
        return this.warna;
    }
    
    // writeOnly
    public void setBatasPajak(int jangkaTahun){
        this.batasPajak = tahunProduksi+jangkaTahun;
    }
    
    public void displayData(){
        System.out.println("warna mobil: " + this.warna);
        System.out.println("Batas Pajak: " + this.batasPajak);
    }
    
    @Override
    public void maju(int kilometer) {
        System.out.println("Mobil maju sejauh " + kilometer + " kilometer");
    }
}
