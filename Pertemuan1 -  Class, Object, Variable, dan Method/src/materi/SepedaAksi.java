public class SepedaAksi {
    public static void main(String[] args) {
        Sepeda sepedaku = new Sepeda();
        sepedaku.warna = "Hitam";
        sepedaku.tahunProduksi = 2006;
        System.out.println("Sepedaku berwarna " + sepedaku.warna);
        System.out.println("Diproduksi pada tahun " + sepedaku.tahunProduksi);
        sepedaku.maju();
    }
}
