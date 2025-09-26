package pertemuan4;

import Kendaraan.Sepeda;
import Kendaraan.Mobil;
import Mobil.Chevrolet;

public class Main {
    public static void main(String[] args) {
        Sepeda sepedaku = new Sepeda("Hitam", 2006);
        System.out.println("Sepedaku berwarna " + sepedaku.warna);
        System.out.println("Diproduksi pada tahun " + sepedaku.tahunProduksi);
        sepedaku.maju(5);
        
        System.out.println("");
        
        Mobil mobilku = new Mobil();
        System.out.println(mobilku.getWarna());
        mobilku.setBatasPajak(5);
        mobilku.displayData();
        
        System.out.println("");
        Chevrolet camaro = new Chevrolet();
        camaro.setBatasPajak(5);
//        camaro.setModifikasi(10); // nitro doang
        camaro.setModifikasi(10, true); // nitro & spoiler
        System.out.println("mobil camaro warna: " + camaro.getWarna());
        camaro.displayData();
    }
}
