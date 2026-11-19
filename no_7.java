package tugaspraktikum_p6;

class ThreadBaru extends Thread {

    @Override
    public void run() {

        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread berjalan: " + i);
        }
    }
}

public class no_7 {
    public static void main(String[] args) {

        ThreadBaru thread = new ThreadBaru();

        thread.start();
    }
}
