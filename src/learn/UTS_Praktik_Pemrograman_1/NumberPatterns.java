package learn.UTS_Praktik_Pemrograman_1;

import java.util.Scanner;

public class NumberPatterns {
    public static void main(String[] args) {
        // Membuat objek Scanner untuk input
        Scanner scanner = new Scanner(System.in);

        // Meminta input jumlah N
        System.out.print("Masukkan jumlah N : ");
        int N = scanner.nextInt();

        // Loop untuk mencetak pola
        for (int i = 1; i <= N; i++) { // i adalah nomor baris
            for (int j = 1; j <= i; j++) { // j adalah angka yang dicetak
                System.out.print(j); // Mencetak angka
            }
            System.out.println(); // Pindah ke baris berikutnya
        }

        // Menutup scanner
        scanner.close();
    }
}
