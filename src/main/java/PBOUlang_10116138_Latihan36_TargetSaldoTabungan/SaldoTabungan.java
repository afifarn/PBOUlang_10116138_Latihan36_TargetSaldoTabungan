/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PBOUlang_10116138_Latihan36_TargetSaldoTabungan;

/**
 *
 * @author 
 * NAMA     : Afif Raditya Nugraha
 * KELAS    : PBO_ULANG/IF4
 * NIM      : 10116138
 * LOG      : Program ini berisi program untuk Menampilkan Target Saldo Tabungan
 * Running
 */
public class SaldoTabungan {
  public void hitungSaldoTabungan(int saldo, double bulan, double bunga){
    int i;
    for(i = 1; saldo<=6000000; i++){
        bulan = bunga * saldo;
        saldo = (int) (saldo + bulan);
        System.out.println("Saldo di Bulan ke-" + i +"Rp." + saldo);
    }   
}
}