package pertemuan2;

public class Sepeda implements methodKendaraan{
    String warna;
    int tahunProduksi;
    
    public Sepeda(String warna, int tahunProduksi){
        this.warna = warna;
        this.tahunProduksi = tahunProduksi;
    }

    @Override
    public void maju(int meter) {
        System.out.println("Sepeda maju sejauh " + meter);
    }
}