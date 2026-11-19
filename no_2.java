package tugaspraktikum_p6;

public class no_2 {
    public static void main(String[] args){
       String[] mobil = {"Tesla", "Suzuki", "Civic", "Mazda", "BMW"};
       mobil[1] = "Hyundai";

        System.out.println("Array Setelah Diubah:");

        for (int i = 0; i < mobil.length; i++) {
            System.out.println("Indeks " + i + " : " + mobil[i]);
        }
    }
}
