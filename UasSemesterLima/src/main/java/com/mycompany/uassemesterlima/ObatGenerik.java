/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.uassemesterlima;

/**
 *
 * @author SKOLASTIKA
 */

    
public class ObatGenerik extends Obat {
    private String komposisi;

    public ObatGenerik(String nama, double harga, String komposisi) {
        super(nama, harga);
        this.komposisi = komposisi;
    }

    public String getKomposisi() {
        return komposisi;
    }

    @Override
    public void info() {
        super.info();
        System.out.println("Komposisi Obat Generik: " + komposisi);
    }
}

