/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan9.arraylist;
import java.util.ArrayList; // untuk menggunakan arrayList

/**
 *
 * @author brand
 */
// step 2
public class InputDataMahasiswa {
    ArrayList<Mahasiswa> listMahasiswa;
    
    public InputDataMahasiswa(){
        listMahasiswa = new ArrayList();
    }
    
    public void insertData(String NPM, String Nama) {
        Mahasiswa mhs = new Mahasiswa(NPM, Nama);
        listMahasiswa.add(mhs);
    }
    
    public void deleteData(int index){
        listMahasiswa.remove(index);
    }
    
    public void getData(){
        for (int i = 0; i < listMahasiswa.size(); i++) {
//            System.out.println(listMahasiswa.get(i));
            System.out.println("NPM: " + listMahasiswa.get(i).getNPM() + "\nNama: " + listMahasiswa.get(i).getNama());
         }
    }
}
