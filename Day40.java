
package pkg100.days.of.coding;

import java.util.Scanner;

public class Day40_menjumlahkanBilanganGanjil {

    public static void main(String[] args) {
    
        /* Buat program yang bisa menjumlahkan bilangan ganjil
           dengan banyak bilangannya itu ditentukan oleh user. */
        
        Scanner sc = new Scanner (System.in);

        int batasBilanganGanjil;
        int jumlah = 0;
        
        System.out.print("masukan batas bilangan ganjil : ");
        batasBilanganGanjil = sc.nextInt();
  
        for (int i = 1; i <= batasBilanganGanjil; i += 2) {
                jumlah += i;
                
                if(i<batasBilanganGanjil){
                    System.out.print(i+" + ");
                }else{
                    System.out.print(i+" = ");
                }
            }    
            System.out.println(" hasil penjumlahan bilangan ganjil dari 1 sampai angka yang ditentukan user : " + jumlah );
        }
    }

