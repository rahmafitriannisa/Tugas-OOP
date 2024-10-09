/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas;

/**
 *
 * @author nisa
 */
public class TiketReguler extends Tiket {
    public TiketReguler(double harga) {
        super(harga);
    }

    // Implementasi metode abstract
    @Override
    public String getInfo() {
        return "Tiket Regular dengan harga Rp. " + String.format("%.0f", getHarga());
    }
}
