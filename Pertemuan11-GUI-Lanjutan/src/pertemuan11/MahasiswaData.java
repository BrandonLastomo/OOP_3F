/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan11;

/**
 *
 * @author brand
 */
import java.util.ArrayList;

public class MahasiswaData {
    private static ArrayList<Mahasiswa> data = new ArrayList<>();

    public static void tambah(Mahasiswa mhs) {
        data.add(mhs);
    }

    public static void update(int index, Mahasiswa mhsBaru) {
        if (index >= 0 && index < data.size()) {
            data.set(index, mhsBaru);
        }
    }

    public static void hapus(int index) {
        if (index >= 0 && index < data.size()) {
            data.remove(index);
        }
    }

    public static ArrayList<Mahasiswa> getAll() {
        return data;
    }
}

