/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuan9.arraylist;

/**
 *
 * @author brand
 */
// step 3
public class Pertemuan9ArrayList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Kenapa ArrayList dibanding Array?
        // 1. lebih fleksibel
        // 2. bisa nampung berbagai macam tipe data
        
        // Kenapa JANGAN pake ArrayList?
        // 1. Memori lebih boros
        // 2. performa nurun
        
        InputDataMahasiswa dataMahasiswa = new InputDataMahasiswa();
        
        dataMahasiswa.insertData("23128", "Entei");
        dataMahasiswa.insertData("23129", "Machamp");
        dataMahasiswa.insertData("23130", "Pikachu");
        
        System.out.println("Data Mahasiswa sebelum remove: ");
        dataMahasiswa.getData();
        
        dataMahasiswa.deleteData(1);
        
        System.out.println("");
        System.out.println("Data Mahasiswa setelah remove: ");
        dataMahasiswa.getData();
    }
    
}
