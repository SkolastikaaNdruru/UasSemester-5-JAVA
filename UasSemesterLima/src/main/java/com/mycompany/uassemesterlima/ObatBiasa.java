/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.uassemesterlima;

/**
 *
 * @author SKOLASTIKA
 */
public class ObatBiasa extends Obat {
    private String manfaat;

    public ObatBiasa(String nama, double harga, String manfaat) {
        super(nama, harga);
        this.manfaat = manfaat;
    }

    public String getManfaat() {
        return manfaat;
    }

    @Override
    public void info() {
        super.info();
        System.out.println("Manfaat Obat Biasa: " + manfaat);
    }
}

