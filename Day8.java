
package pkg100.days.of.coding;

import java.util.Scanner;
public class Day8_soal2ROUND2 {

    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
	 
        System.out.print("masukkan angka : ");
	int angka= sc.nextInt( );
	           
	if(angka % 3 == 0 && angka % 5 == 0){
	    System.out.println("master class");
	}else if (angka % 3 == 0){
	    System.out.println("pride of 3");
	}else if(angka % 5 == 0){
	    System.out.println("pride of 5");}
	           
	   
    }
    
}
