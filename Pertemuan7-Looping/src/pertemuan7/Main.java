package pertemuan6;

import Kendaraan.Sepeda;
import Kendaraan.Mobil;
import Mobil.Chevrolet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // bikin object untuk input
        Scanner input = new Scanner(System.in);
        Scanner inputPil = new Scanner(System.in);
        
        // bikin object sepeda
        Sepeda sepedaku = new Sepeda("Hitam", 2006);
        System.out.println("Implementasi Class Sepeda");
        System.out.println("Sepedaku berwarna " + sepedaku.warna);
        System.out.println("Diproduksi pada tahun " + sepedaku.tahunProduksi);
        sepedaku.maju(5);
        // endof Sepeda
        System.out.println("");

        // bikin object mobil
        Mobil mobilku = new Mobil();
        System.out.println("Implementasi Class Mobil");
        System.out.println(mobilku.getWarna());
        mobilku.setBatasPajak(5);
        mobilku.displayData();
        // endof Mobil
        System.out.println("");
        
        // bikin object mobil dengan nama camaro
        Chevrolet camaro = new Chevrolet();
        System.out.println("Implementasi Class Mobil dengan nama Camaro");
        camaro.setBatasPajak(5);
//        camaro.setModifikasi(10); // nitro doang
        camaro.setModifikasi(10, true); // nitro & spoiler
        System.out.println("mobil camaro warna: " + camaro.getWarna());
        camaro.displayData();
        // endof Camaro
        System.out.println("");

        // camaro modifikasi dengan input
        System.out.println("Implementasi Input pada Class Mobil dengan nama Camaro");
        System.out.print("Masukkan banyak nitro: ");
        int inputNitro = input.nextInt();
        camaro.setModifikasi(inputNitro);
        camaro.displayData();
        // endof Camaro Input
        
        // if else
        if(inputNitro > 10){
            System.out.println("Mobil jebol");
        } else if (inputNitro > 5){
            System.out.println("Mobil kencang dikit");
        } else {
            System.out.println("Mobil lambat");
        }
        // endof if else
        System.out.println("");
        
        // switch case
        System.out.println("Pilih data kendaraan yang mau ditampilkan (sepeda/mobil/camaro/for/while/doWhile): ");
        String pilih = inputPil.nextLine();
        
        switch(pilih){
            case "sepeda":
                System.out.println("Menampilkan data sepeda dengan switch case");
                System.out.println("Sepedaku berwarna " + sepedaku.warna);
                System.out.println("Diproduksi pada tahun " + sepedaku.tahunProduksi);
                break;
            case "mobil":
                mobilku.displayData();
                break;
            case "camaro":
                camaro.displayData();
                break;
            case "displayFor":
                for (int i = 1; i <= 3; i++) {
                    System.out.println("=== For Loop ===");
                    camaro.displayData();
                    System.out.println("");
                }
                break;
            case "displayWhile":
                int a = 1;
                while(a <= 3){
                    System.out.println("=== While Loop ===");
                    camaro.displayData();
                    System.out.println("");
                    a++;
                }
                break;
            case "displayDoWhile":
                int b = 1;
                do {
                    System.out.println("=== Do While Loop ===");
                    camaro.displayData();
                    System.out.println("");
                    b++;
                } while(b <= 3);
                break;
            default:
                System.out.println("Input invalid");
                break;
        }
    }
}
