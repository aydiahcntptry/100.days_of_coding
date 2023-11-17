
package pkg100.days.of.coding;

import java.util.Scanner;

public class Day22_PilihanWarna {

    public static void main(String[] args) {
        //hari ini kita belajar buat program yang sama dengan day21 tapi,
       //bedanya adalah kita akan program warna berdasarkan huruf 
       //M(Merah), K(kuning), H(Hijau), dan B(Biru).
       
       //masukkan variabel dan Scanner
       char huruf;
       Scanner scan = new Scanner(System.in);
       
       //mengambil input
        System.out.println("masukan huruf: ");
        huruf = scan.next().charAt(0);
        
        switch(huruf){
            case 'M':
                System.out.println("Merah");
                break;
            case 'K':
                System.out.println("Kuning");
                break;
            case 'H':
                System.out.println("Hijau");
                break;
            case 'B':
                System.out.println("Biru");
                break;
            default:
                System.out.println("maaf, anda salah memasukan huruf");
                
        //anda harus memasukkan huruf kapital !!
                
        }    
                
    }
    
}
    
