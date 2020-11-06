/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119076.latihan36.target.saldo.tabungan;
import java.util.Scanner;
/**
 *
 * @author ACER
 * Nama : Sulthon Naufal Akmal
 * Kelas : IF2
 * NIM : 10119076
 * Deskripsi : Target Saldo Tabungan
 */
public class PBOIF210119076Latihan36TargetSaldoTabungan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        Saldo saldo = new Saldo();
        System.out.print("Saldo Awal    : Rp. ");
        saldo.saldoAwal=input.nextDouble();
        System.out.print("Bunga/bulan(%)    : ");
        saldo.bunga=input.nextFloat();
        System.out.print("Saldo Target    : Rp. ");
        saldo.saldoTarget = input.nextDouble();
        
        saldo.saldoTabungan();
    }
    
}
