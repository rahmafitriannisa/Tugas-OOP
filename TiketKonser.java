/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas;

/**
 *
 * @author nisa
 */
public class TiketKonser {
    public static void main(String[] args) {
        System.out.println("=== Pemesanan Tiket Konser ===");
        
        // Membuat objek tiket regular dan tiket VIP
        Tiket tiket1 = new TiketReguler(200000);
        Tiket tiket2 = new TiketVIP(350000, "Baju Kaos dan Tumbler");

        // Menampilkan informasi tiket
        System.out.println(tiket1.getInfo());
        System.out.println(tiket2.getInfo());
    }
}
