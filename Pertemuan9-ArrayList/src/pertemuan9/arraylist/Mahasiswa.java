/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan9.arraylist;

/**
 *
 * @author brand
 */

// step 1
public class Mahasiswa {
    // data mahasiswa
    private String NPM, nama;
    
    // constructor
    public Mahasiswa(String NPM, String nama){
        this.NPM = NPM;
        this.nama = nama;
    }
    
    // getter
    public String getNPM(){
        return NPM;
    }
    public String getNama(){
        return nama;
    }
}
