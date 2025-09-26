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
    protected int tahunProduksi = 2005;
    protected int batasPajak;
    private int nitro = 0;
    private boolean adaSpoiler = false;
    
    // readonly
    public String getWarna(){
        return this.warna;
    }
    
    // writeOnly
    public void setBatasPajak(int jangkaTahun){
        this.batasPajak = tahunProduksi+jangkaTahun;
    }
    
    // overloading
    // tipe data dan nama method harus sama.
    // jumlah parameter boleh beda
    public void setModifikasi(int nitro){
        this.nitro = nitro;
    }
    public void setModifikasi(int nitro, boolean adaSpoiler){
        this.nitro = nitro;
        this.adaSpoiler = adaSpoiler;
    }
    
    public int getNitro(){
        return this.nitro;
    }
    
    public void displayData(){
        System.out.println("warna mobil: " + this.warna);
        System.out.println("Batas Pajak: " + this.batasPajak);
        System.out.println("nitro mobil: " + getNitro());
        System.out.println("Apakah ada spoiler? " + this.adaSpoiler);
    }
    
    
    @Override
    public void maju(int kilometer) {
        System.out.println("Mobil maju sejauh " + kilometer + " kilometer");
    }
}
