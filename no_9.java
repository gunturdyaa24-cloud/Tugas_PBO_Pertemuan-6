package tugaspraktikum_p6;

public class no_9 {
    public static void main(String[] args) {

        int[] age = {12, 4, 5, 2, 6};

        System.out.println("Menggunakan For:");

        for (int i = 0; i < age.length; i++) {
            System.out.println(age[i]);
        }
        
        System.out.println("\nMenggunakan While:");

        int i = 0;

        while (i < age.length) {
            System.out.println(age[i]);
            i++;
        }
    }
}
