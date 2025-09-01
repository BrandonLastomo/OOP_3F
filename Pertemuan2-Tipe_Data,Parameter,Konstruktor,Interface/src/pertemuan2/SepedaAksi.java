package pertemuan2;

public class SepedaAksi {
    public static void main(String[] args) {
        Sepeda sepedaku = new Sepeda("Hitam", 2006);
        System.out.println("Sepedaku berwarna " + sepedaku.warna);
        System.out.println("Diproduksi pada tahun " + sepedaku.tahunProduksi);
        sepedaku.maju(5);
        
        System.out.println("");
        
        Mobil mobilku = new Mobil();
        mobilku.maju(10);
    }
}
