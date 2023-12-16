package pkg100.days.of.coding;

public class Day69_java {

    public static void main(String[] args) {
        int[] nilai = {63, 48, 75, 88, 56, 93, 70, 85, 91, 65};
        for (int i = 0; i < nilai.length; i++) {
            if (nilai[i] > 70) {
                System.out.println(nilai[i] + " (Lulus)");
            } else {
                System.out.println(nilai[i] + " (Tidak lulus)" );
            }
        }
    }
}
