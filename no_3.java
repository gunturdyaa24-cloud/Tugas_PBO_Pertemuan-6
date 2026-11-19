package tugaspraktikum_p6;

import java.util.Scanner;
import java.util.Arrays;

public class no_3{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah elemen array: ");
        int n = input.nextInt();

        if (n <= 0) {
            System.out.println("Jumlah elemen harus lebih dari 0!");
            return;
        }

        int[] angka = new int[n];

        // a dan b. Input elemen array
        for (int i = 0; i < n; i++) {
            System.out.print("Masukkan nilai indeks " + i + ": ");
            angka[i] = input.nextInt();
        }

        int terbesar = angka[0];
        int terkecil = angka[0];
        int indeksBesar = 0;
        int indeksKecil = 0;

        int jumlah = 0;
        int jumlahGenap = 0;

        for (int i = 0; i < n; i++) {

            // c. Mencari nilai terbesar
            if (angka[i] > terbesar) {
                terbesar = angka[i];
                indeksBesar = i;
            }

            // c. Mencari nilai terkecil
            if (angka[i] < terkecil) {
                terkecil = angka[i];
                indeksKecil = i;
            }

            // d. Jumlah seluruh elemen
            jumlah += angka[i];

            // f. Jumlah elemen berindeks genap
            if (i % 2 == 0) {
                jumlahGenap += angka[i];
            }
        }

        // d. Menghitung rata-rata
        double rataRata = (double) jumlah / n;

        System.out.println("\n=== HASIL ARRAY ===");

        System.out.println("Nilai terbesar: " + terbesar);
        System.out.println("Indeks terbesar: " + indeksBesar);

        System.out.println("Nilai terkecil: " + terkecil);
        System.out.println("Indeks terkecil: " + indeksKecil);

        System.out.println("Jumlah seluruh elemen: " + jumlah);
        System.out.println("Nilai rata-rata: " + rataRata);

        // f. Menampilkan jumlah indeks genap
        System.out.println("Jumlah indeks genap: " + jumlahGenap);

        // g. Memeriksa hasil penjumlahan
        if (jumlahGenap % 2 == 0) {
            System.out.println("Hasil penjumlahan GENAP");
        } else {
            System.out.println("Hasil penjumlahan GANJIL");
        }

        // h. Mengurutkan array
        Arrays.sort(angka);

        System.out.println("Array setelah diurutkan:");

        for (int i = 0; i < n; i++) {
            System.out.print(angka[i] + " ");
        }

        input.close();
    }
}