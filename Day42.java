
package pkg100.days.of.coding;

import java.util.Scanner;

public class Day42_angkaBerurutan {

    public static void main(String[] args) {
        /*
        buat program menginput angka awal dan angka akhir
        dan jumlahkan angka awal sampai angka akhir
        */
        
        Scanner sc = new Scanner(System.in);
        
        int angkaAwal, angkaAkhir, total = 0;
        
        System.out.print("angka awal : ");
        angkaAwal = sc.nextInt();
        System.out.print("angka akhir : ");
        angkaAkhir = sc.nextInt();

        for (int i = angkaAwal; i <= angkaAkhir; i++){
             System.out.print(i); 
             total +=i;
            
             if(i < angkaAkhir ){
                System.out.print(" + ");
             }else{
                System.out.print(" = ");
            }
       }
             System.out.println(total);
   }
}
