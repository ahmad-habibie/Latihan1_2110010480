/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hitung;

/**
 *
 * @author ahmad
 */
public class MatematikaBeraksi {
    public static void main(String[] args) {
        Matematika habibie = new Matematika(8,0);
        
        System.out.println("Hasil Penjumlahan: "+habibie.setPenjumlahan());
        System.out.println("Hasil Pengurangan: "+habibie.setPengurangan());
        System.out.println("Hasil Perkalian: "+habibie.setPerkalian());
        System.out.println("Hasil Pembagian: "+habibie.setPembagian());
    }
}
