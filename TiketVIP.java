/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas;

/**
 *
 * @author nisa
 */
public class TiketVIP extends Tiket {
    private String benefit;

    public TiketVIP(double harga, String benefit) {
        super(harga);
        this.benefit = benefit;
    }

    // Implementasi metode abstract
    @Override
    public String getInfo() {
        return "Tiket VIP dengan harga Rp. " + String.format("%.0f", getHarga()) + ", + " + benefit;
    }
}
