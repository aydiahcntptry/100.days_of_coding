package pkg100.days.of.coding;

import java.util.Scanner;

public class Day90_ {
    
    // angka berurut di tambah 3!

    static void perulanganFor(int angka) {
        for (int i = 0; i <= angka; i+=3) {
            System.out.println("nilai ke-" + i);
        }    
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan batas nilai : ");
        int nilai = sc.nextInt();

        perulanganFor(nilai);

        sc.close();
    }
    
}
