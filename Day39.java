
package pkg100.days.of.coding;

import java.util.Scanner;

public class Day39_pengirimanBarang {

    public static void main(String[] args) {
        
        /* buat program yang meminta user memasukan kode barang
           yang akan di kirim ke alamat yang sudah di tentukan. */
        
        Scanner sc = new Scanner (System.in);
        
        System.out.print("Masukan kode barang yang akan di kirim : ");
        int kodeBarang = sc.nextInt();
        
        String alamatTujuan;
     
        switch(kodeBarang){
            case 123:
                alamatTujuan = "JL. MAWAR NO. 02, JAKARTA";
                System.out.println("Barang dengan kode " + kodeBarang);
                System.out.println("akan dikirim ke alamat " + alamatTujuan);
                break;
            case 345:
                alamatTujuan = "JL. INDAH NO. 07, JAKARTA";
                System.out.println("Barang dengan kode " + kodeBarang);
                System.out.println("akan dikirim ke alamat " + alamatTujuan);
                break;
            case 567:
                alamatTujuan = "JL. MELATI NO. 12, JAKARTA";
                System.out.println("Barang dengan kode " + kodeBarang);
                System.out.println("akan dikirim ke alamat " + alamatTujuan);
                break;
            case 789:
                alamatTujuan = "JL. JAGOAN NO. 15, JAKARTA";
                System.out.println("Barang dengan kode " + kodeBarang);
                System.out.println("akan dikirim ke alamat " + alamatTujuan);
                break;
            default:
                System.out.println("ANDA SALAH MEMASUKAN KODE BARANG !");
                break;
        }
        
     }
       
 }
     
