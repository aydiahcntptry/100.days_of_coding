
package pkg100.days.of.coding;
import java.util.Scanner;
public class Day30_pangkat {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
      
        System.out.print("masukkan angka : ");
        int angka = sc.nextInt();
        
        System.out.print("pangkat :");
        int pangkat = sc.nextInt();
        
        int hasil =1;
        
        for (int i = 0; i < pangkat ; i++) {
            hasil *= angka;
            
        }
        System.out.println("hasil : " + hasil);
       }
 }    
    
