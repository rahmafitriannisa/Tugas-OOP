/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas;

/**
 *
 * @author nisa
 */
abstract class Tiket {
    private final double harga;

    public Tiket(double harga) {
        this.harga = harga;
    }

    // Getter untuk mendapatkan harga
    public double getHarga() {
        return harga;
    }

    // Metode abstract untuk mendapatkan informasi tiket
    public abstract String getInfo();
}
