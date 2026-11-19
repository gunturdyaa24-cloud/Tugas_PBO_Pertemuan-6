package tugaspraktikum_p6;

import java.util.Scanner;

class ThreadAnak extends Thread {

    int nomor;

    ThreadAnak(int nomor) {
        this.nomor = nomor;
    }

    @Override
    public void run() {
        System.out.println("Thread anak ke-" + nomor + " sedang berjalan.");
    }
}

public class no_8 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah thread: ");
        int jumlah = input.nextInt();

        if (jumlah <= 0) {
            System.out.println("Jumlah thread harus lebih dari 0!");
            input.close();
            return;
        }

        ThreadAnak[] thread = new ThreadAnak[jumlah];

        for (int i = 0; i < jumlah; i++) {

            thread[i] = new ThreadAnak(i + 1);

            thread[i].start();
        }

        input.close();
    }
}
