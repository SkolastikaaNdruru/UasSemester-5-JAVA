/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.uassemesterlima;

/**
 *
 * @author SKOLASTIKA
 */
public class Obat {
    private String nama;
    private double harga;

    public Obat(String nama, double harga) {
        this.nama = nama;
        this.harga = harga;
    }

    public String getNama() {
        return nama;
    }

    public double getHarga() {
        return harga;
    }

    public void info() {
        System.out.println("Nama Obat: " + nama);
        System.out.println("Harga Obat: " + harga);
    }
}
