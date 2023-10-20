import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        // menghitung luas dan keliling segitiga dengan rumus
        // Luas, Keliling
        // L = 0.5 x a x t
        // K = s + s + s
        // a = s
        
        Scanner input = new Scanner(System.in);
        
        double L, K, a, t, s;
        System.out.print("nilai alas = ");
        a = input.nextDouble();
        System.out.print("nilai tinggi = ");
        t = input.nextDouble();
        
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