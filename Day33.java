
package pkg100.days.of.coding;
import java.util.Scanner;
public class Day33_menuMakanan {

    public static void main(String[] args) {
        
        // Menu makanan dengan Switch Case 
       
        Scanner scan = new Scanner (System.in);
        int menu, porsi, harga =0;
        System.out.println("====Warung Bang Odi====");
        System.out.println("Menu Makanan");
        System.out.println("1. Nasi Goreng");
        System.out.println("2. Nasi Kuning");
        System.out.println("3. Nasi Campur");
        System.out.print("Pilih Menu : ");
        menu = scan.nextInt();
        switch (menu){
            case 1:
                System.out.print("porsi : ");
                porsi = scan.nextInt();
                System.out.println("Nasi Goreng (10rb/porsi)");
                harga = 10000 * porsi;
                break;
            case 2:
                System.out.print("porsi : ");
                porsi = scan.nextInt();
                System.out.println("Nasi Kuning (10rb/porsi)");
                harga = 10000 * porsi;
                break;
            case 3:
                System.out.print("porsi : ");
                porsi = scan.nextInt();
                System.out.println("Nasi Campur (13rb/porsi)");
                harga = 13000 * porsi;
                break;
            default:
                System.out.println("Pilihan Salah");
        }
        System.out.println("Total : Rp. " + harga );
        
    }
    
}
 
