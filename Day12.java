
package pkg100.days.of.coding;

import java.util.Scanner;

public class Day12_menghitung_luas_dan_keliling_segitiga {

    public static void main(String[] args) {
      
        Scanner sc = new Scanner (System.in);
        
        // menghitung luas dan keliling segitiga dengan rumus
        // Luas, Keliling
        // L = 0.5 x a x t
        // K = s + s + s
        // a = s

        double L, K, a, t, s;
        System.out.print("nilai alas = ");
        a = sc.nextDouble();
        System.out.print("nilai tinggi = ");
        t = sc.nextDouble();
        
        s = a;
        L = 0.5 * (a * t);
        K = s + s + s;
        
        System.out.println("L = 0.5 * a * t");
        System.out.println("L = " +0.5+ " x " + a * t);
        System.out.println("Jadi Luas dari segitiga ini adalah" + "\n" + L + "\n");
        
        
        System.out.println("K = s + s + s");
        System.out.println("K = " +s+ " + " +s+ " + " +s);
        System.out.println("Jadi Keliling dari segitiga ini adalah" + "\n" + K);
        
        
    }
    
}
    
