
package pkg100.days.of.coding;

import java.util.Scanner;

public class Day41_jumlahUangDidompet {

    public static void main(String[] args) {
        /* jika jumlah uang di dompet kurang dari 50 ribu,
        maka akan di tampilkan pesan "segera isi dompet" 
        jika tidak tampilkan pesan "uang di dompet mencukupi"
        */
        
        Scanner sc = new Scanner (System.in);
        System.out.print("uang di dompet : ");
        int uangDidompet = sc.nextInt();
        
        if (uangDidompet < 50000){
            System.out.println("segera isi dompet");
         } else { 
            System.out.println("uang di dompet mencukupi");
        }
    }
    
}
