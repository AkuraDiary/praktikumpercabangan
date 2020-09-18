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
public class Luas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int alas, tinggi, r, sisi;
        double luasS, luasP, luasL;
        
        //Segitiga
        alas = 3;
        tinggi = 5;
        luasS = alas * tinggi / 2;
        
        //persegi
        sisi = 4;
        luasP = sisi * sisi;
        
        //lingkaran
        r = 14;
        double pi = Math.PI;
        luasL= pi * r*r;
        
       //output lingkaran 
       System.out.println("<<Lingkaran>>");
       System.out.println("jari jari = " +r);
       System.out.println("Luas Lingkaran = "+luasL +"\n");
       
       //output segitiga
       System.out.println("<<Segitiga>>");
       System.out.println("alas = " +alas);
       System.out.println("tinggi = " +tinggi);
       System.out.println("Luas Segitiga = "+luasS +"\n");
       
       //output Persegi
       System.out.println("<<Persegi>>");
       System.out.println("sisi = " +sisi);
       System.out.println("Luas persegi = "+luasP +"\n");
    }
    
}
