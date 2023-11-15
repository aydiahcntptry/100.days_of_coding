
package pkg100.days.of.coding;

import java.util.Scanner;

public class Day11_menghitung_luas_dan_keliling_persegi_panjang {

    public static void main(String[] args) {
       
        Scanner sc = new Scanner (System.in);
        
        // menghitung luas dan keliling persegi panjang
       
        // Meminta input panjang dan lebar persegi panjang
        System.out.print("panjang persegi panjang: ");
        double panjang = sc.nextDouble();
        System.out.print("lebar persegi panjang: ");
        double lebar = sc.nextDouble();

        // Menghitung luas dan keliling persegi panjang
        double luas = panjang * lebar;
        double keliling = 2 * (panjang + lebar);

        // Menampilkan luas dan keliling persegi panjang
        System.out.println("Luas persegi panjang: " + luas);
        System.out.println("Keliling persegi panjang: " + keliling);
        
        
    }
    
}
