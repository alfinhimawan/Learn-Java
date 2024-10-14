package learn.UTS_Praktik_Pemrograman_1;

import java.util.Scanner;

public class CircleArea {
    public static void main(String[] args) {
        // Inisialisasi variabel
        double phi; // Nilai phi
        double r; // Jari-jari
        double luas; // Luas lingkaran

        // Membuat objek Scanner untuk input
        Scanner scanner = new Scanner(System.in);

        // Meminta pilihan pengguna untuk nilai phi
        System.out.println("Pilih nilai phi:");
        System.out.println("1. 3.14");
        System.out.println("2. 22/7");
        System.out.print("Masukkan pilihan (1 atau 2): ");
        int pilihan = scanner.nextInt();

        // Menentukan nilai phi berdasarkan pilihan pengguna
        if (pilihan == 1) {
            phi = 3.14; // Menggunakan 3.14
        } else if (pilihan == 2) {
            phi = 22.0 / 7.0; // Menggunakan 22/7
        } else {
            System.out.println("Pilihan tidak valid. Menggunakan 3.14 secara default.");
            phi = 3.14; // Default ke 3.14 jika pilihan tidak valid
        }

        // Meminta input jari-jari
        System.out.print("Masukkan nilai jari-jari lingkaran (r): ");
        r = scanner.nextDouble();

        // Menghitung luas lingkaran
        luas = phi * r * r;

        // Menampilkan hasil
        System.out.println("Luas lingkaran dengan jari-jari " + r + " adalah: " + luas);

        // Menutup scanner
        scanner.close();
    }
}

