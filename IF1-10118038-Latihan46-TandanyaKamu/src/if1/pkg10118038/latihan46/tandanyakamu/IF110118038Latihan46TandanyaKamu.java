/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10118038.latihan46.tandanyakamu;
import java.util.Scanner;
/**
 *
 * @author Lingga
 * NAMA : Lingga Purnama Al Hamdi
 * KELAS : IF1
 * NIM : 10118038
 * Deskripsi Program : program ini berisi program yang akan menampilkan tanda 
 *                     dari tahun lahir kamu
 */
public class IF110118038Latihan46TandanyaKamu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Tahun Lahir Anda : ");
        Age age = new Age(sc.nextInt());
        age.setYearBirth(2019);
        System.out.println("\n======Hasil Perhitungan Umur======");
        System.out.println("Tahun Lahir anda : " + age.getYearNow());
        System.out.println("Hari ini tahun : " + age.getYearBirth());
        System.out.println("Umur kamu sampai hari ini adalah " + age.hitungUmur() + " tahun");
        System.out.print("Tandanya Kamu : ");
        System.out.print(age.tandanyaKamu(age.hitungUmur()));
        
    }
    
}
