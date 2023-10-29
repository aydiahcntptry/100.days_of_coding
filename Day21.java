package harihari;

import java.util.Scanner;

public class HariHari {
    public static void main(String[] args) {
        
        //hari ini kita akan buat program hari dalam
        //seminggu berdasarkan angka 1-7
        
        // membuat variabel dan Scanner
        int angka;
        Scanner scan = new Scanner(System.in);
        
        // mengambil input
        System.out.println("masukan angka: ");
        angka = scan.nextInt();
        
        switch(angka){
            case 1:
                System.out.println("senin");
                break;
            case 2:
                System.out.println("selasa");
                break;
            case 3:
                System.out.println("rabu");
                break;
            case 4:
                System.out.println("kamis");
                break;
            case 5:
                System.out.println("jum'at");
                break;
            case 6:
                System.out.println("sabtu");
                break;
            case 7:
                System.out.println("minggu");
                break;
            default:
            System.out.println("anda salah memasukkan angka!");
            
            // output 
            // jika angka 1 yang dimasukan maka ia akan print "senin"
            //jika anda masukkan angka selain dari 1-7 maka ia akan print "anda salah memasukan angka!"
         
        }    
     
    }
    
}