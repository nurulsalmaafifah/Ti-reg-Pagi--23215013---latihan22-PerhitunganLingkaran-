/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan6;

import java.util.Scanner;
/**
 *
 * @author ASUS
 */
public class PerhitunganLingkaran {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double diameter = 0;

        while (true) {
            System.out.println("======Perhitungan Lingkaran=====");
            System.out.print("Masukkan nilai diameter lingkaran: ");
            String input = scanner.nextLine();

            try {
                // Cek apakah input berupa angka
                diameter = Double.parseDouble(input);

                // Jika nilai diameter lebih dari 0, lanjutkan perhitungan
                if (diameter > 0) {
                    break;
                } else {
                    System.out.println("Nilai Diameter Tidak Sesuai\n");
                }
            } catch (NumberFormatException e) {
                // Jika input bukan angka
                System.out.println("Nilai Diameter Tidak Sesuai\n");
            }
        }

        // Menghitung jari-jari, luas, dan keliling
        double jariJari = diameter / 2;
        double luas = Math.PI * jariJari * jariJari;
        double keliling = Math.PI * diameter;

        // Menampilkan hasil perhitungan
        System.out.println("\n======Hasil Perhitungan Lingkaran=====");
        System.out.printf("Jari-jari Lingkaran = %.2f cm%n", jariJari);
        System.out.printf("Luas Lingkaran = %.2f cm²%n", luas);
        System.out.printf("Keliling Lingkaran = %.2f cm%n", keliling);

        scanner.close();
    }
}