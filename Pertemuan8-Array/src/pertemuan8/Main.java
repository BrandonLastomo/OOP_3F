package pertemuan8;

import Kendaraan.Sepeda;
import Kendaraan.Mobil;
import Mobil.Chevrolet;
import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arrayApagitu = {5, 6, 7};
        int[] arrayAngka = Arrays.copyOf(arrayApagitu, 3);
        arrayAngka[0] = 8;
        
//        array 1 dimensi
        for(int i = 0; i < arrayApagitu.length; i++){
            System.out.println("index ke-"+i+" "+arrayApagitu[i]);
        }
        
//        foreach
        for(int angka : arrayApagitu){
            System.out.println(angka);
        }
        
//        array multidimensi
        int[][] matriks = {
            {1, 2, 3},
            {4, 5, 6}
        };
        
        for(int a = 0; a < 2; a++){
            for(int b = 0; b < 3; b++){
                System.out.println("index ke-"+a+" "+b+" "+matriks[a][b]);
            }
        }
        
    }
}
