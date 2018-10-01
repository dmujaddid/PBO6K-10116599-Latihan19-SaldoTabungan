/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo6k.pkg10116599.latihan19.saldotabungan;

/**
 *
 * @author 
 * NAMA     : Robby Eka Purnama
 * KELAS    : PBO6K
 * NIM      : 10116599
 * Deskripsi Program : Program penghitungan saldo tabungan.
 * 
 */
public class PBO6K10116599Latihan19SaldoTabungan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Variabel
        double saldoAwal, bunga, perBulan, bungaan;
        int lama;
        
        saldoAwal=2500000;
        bunga=0.15;
        lama=6;
        perBulan= (saldoAwal+(saldoAwal*bunga));
        
        for (int i = 0; i < 6; i++) {
                    System.out.println("Saldo di bulan ke-" +(i+1)+ " Rp " +(saldoAwal+(saldoAwal*bunga)));
                    
                }
            
    }
           
    
}
