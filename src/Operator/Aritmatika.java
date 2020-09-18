/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Operator;
/**
 *
 * @author userMM
 */
public class Aritmatika {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //deklarasi
        int mawar, melati, matahari;
        double harga, total, bayar;
        boolean banding1, banding2;
        
        //pemasukan nilai
        mawar = 21;
        melati =2;
        matahari = 5;
        harga = 4500.5;
        
        //operator penugasan
        melati += 1;
        //operator aritmatika
        total = mawar + melati;
        bayar = total * harga;
        
        //perbandingan
        banding1 = mawar > melati;
        banding2 = mawar > matahari;
        
        //output
        System.out.print("Jumlah barang yang dibeli = ");
        System.out.println(mawar +"+"+melati+"="+total);
        
        System.out.println("total yang dibayar = Rp "+ bayar);
        System.out.println("Bunga mawar > Bunga melati " + banding1);
        System.out.println("Pembelian bunga mawar lebih banyak dari matahari dan melati " + banding2);
    }
    
}
