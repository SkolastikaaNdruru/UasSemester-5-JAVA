/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.uassemesterlima;

/**
 *
 * @author SKOLASTIKA
 */
public class UasSemesterLima {
    public static void main(String[] args) {
        ObatBiasa obatBiasa = new ObatBiasa("Paracetamol", 5000, "Meredakan demam dan sakit kepala");
        ObatGenerik obatGenerik = new ObatGenerik("Amoxicillin", 10000, "Amoxicillin trihydrate");

        // Polimorfisme
        Obat obat1 = obatBiasa;
        Obat obat2 = obatGenerik;

        System.out.println("Informasi Obat Pertama:");
        obat1.info();

        System.out.println("\nInformasi Obat Kedua:");
        obat2.info();
    }
}

