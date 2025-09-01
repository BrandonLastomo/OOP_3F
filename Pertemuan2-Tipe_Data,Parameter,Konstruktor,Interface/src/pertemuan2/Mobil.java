/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan2;

/**
 *
 * @author brand
 */
public class Mobil implements methodKendaraan{
    @Override
    public void maju(int kilometer) {
        System.out.println("Mobil maju sejauh " + kilometer + " kilometer");
    }
}
