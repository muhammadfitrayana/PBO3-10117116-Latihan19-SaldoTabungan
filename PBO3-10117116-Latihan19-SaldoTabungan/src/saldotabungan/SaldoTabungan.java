/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package saldotabungan;

/**
 *
 * @author 
 * NAMA  : Muhammad Fitrayana
 * Kelas : PBO3
 * NIM   : 10117116
 * Deskripsi Tugas : Membuat Program Saldo Tabungan
 *  
 */
public class SaldoTabungan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int saldoAwal = 2500000;
        int bunga = 15;
        int jumlahBunga;
        int Bulan = 7;
        
        
        int i = 1;
         while(i != Bulan ) {
             jumlahBunga = saldoAwal * bunga / 100;
             saldoAwal += jumlahBunga;
             
             String mataUang = String.format(" Rp.%,3d",saldoAwal).replaceAll(","
             + "",".");
             
             System.out.printf("Saldo dibulan ke-" + i + "%s%n",mataUang);       
             i++;         
         }
         
    }
    
}
