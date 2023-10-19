import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Meminta input panjang dan lebar persegi panjang
        System.out.print("panjang persegi panjang: ");
        double panjang = input.nextDouble();
        System.out.print("lebar persegi panjang: ");
        double lebar = input.nextDouble();

        // Menghitung luas dan keliling persegi panjang
        double luas = panjang * lebar;
        double keliling = 2 * (panjang + lebar);

        // Menampilkan luas dan keliling persegi panjang
        System.out.println("Luas persegi panjang: " + luas);
        System.out.println("Keliling persegi panjang: " + keliling);
        
        
    }
    
}