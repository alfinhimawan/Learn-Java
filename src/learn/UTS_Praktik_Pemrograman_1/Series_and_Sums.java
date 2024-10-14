package learn.UTS_Praktik_Pemrograman_1;

import java.util.Scanner;

public class Series_and_Sums{
    public static void main(String[] args) {
                // Membuat objek Scanner untuk input
                Scanner scanner = new Scanner(System.in);

                // Meminta input batas N
                System.out.print("Masukkan jumlah N (batas): ");
                int N = scanner.nextInt();
        
                double phi = 3.14; // Nilai awal
                double interval = 6.28; // Interval antara elemen
                double jumlah = 0; // Variabel untuk menghitung jumlah
        
                // Menampilkan deret
                System.out.print("Output deretnya: ");
                for (int i = 0; i < N; i++) {
                    System.out.printf("%.2f", phi + (i * interval)); // Menampilkan elemen deret
        
                    // Menambahkan elemen ke jumlah
                    jumlah += phi + (i * interval);
        
                    // Menampilkan tanda tambah jika bukan elemen terakhir
                    if (i < N - 1) {
                        System.out.print(" + ");
                    }
                }
        
                // Menampilkan hasil jumlah
                System.out.printf(" = %.2f%n", jumlah);
        
                // Menutup scanner
                scanner.close();
            }
    }