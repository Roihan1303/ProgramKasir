/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programkasir;
import java.util.Scanner;
/**
 *
 * @author Samuel C
 */
public class ProgramKasir {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Roihan Farras Setyadi / X RPL 6 / 36");
        
        Scanner scan = new Scanner(System.in);
        int harga = 0, pilih, jmlhBrng, hasil, uang;
        double total, diskon = 0, kembali;
        
        System.out.println("Nama Barang : ");
        System.out.println("1. Buku Tulis");
        System.out.println("2. Buku Gambar");
        System.out.println("3. Bulpoin");
        System.out.println("4. Pensil");
        System.out.println();
        System.out.print("Pilih barang yang akan dibeli : ");
        pilih = scan.nextInt();
        if (pilih == 1) {
            System.out.println("Kode : 001");
            System.out.println("Harga : Rp 3000");
            harga = 3000;
        }else if(pilih == 2){
            System.out.println("Kode : 002");
            harga = 5000;
            System.out.println("Harga : Rp 5000");
        }else if(pilih == 3){
            System.out.println("Kode : 003");
            System.out.println("Harga : Rp 2000");
            harga = 2000;
        }else if(pilih == 4){
            System.out.println("Kode : 005");
            System.out.println("Harga : Rp 1000");
            harga = 1000;
        }else{}
        
        System.out.println();
        System.out.print("Jumlah barang yang akan dibeli : ");
        jmlhBrng = scan.nextInt();
        hasil = harga * jmlhBrng;
        if (hasil > 500000){
            diskon = hasil*0.5;
        }else if (hasil > 200000){
            diskon = hasil*0.2;
        }else if (hasil > 100000){
            diskon = hasil*0.1;
        }else{
            total = hasil;
        }
        total = hasil - diskon;
        System.out.println();
        System.out.println("Harga = Rp " + total);
        
        System.out.println();
        System.out.print("Pembayaran Uang = Rp ");
        uang = scan.nextInt();
        if (uang > total){
            kembali = uang - total;
            System.out.println("Kembali = Rp " + kembali);
        }else {
            System.out.println("Uang anda kurang");
        }
        
    }
    
}
