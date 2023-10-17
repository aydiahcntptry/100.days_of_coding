import java.util.Scanner;
public class Main {
	       public static void main(String[] args) {
	           Scanner input=new Scanner(System.in);
	           System.out.println("masukkan angka");
		       int angka=input.nextInt( );
	           
	           if(angka % 3 == 0 && angka % 5 == 0){
	               System.out.println("master class");
	           }else if (angka % 3 == 0){
	               System.out.println("pride of 3");
	       }else if(angka % 5 == 0){
	           System.out.println("pride of 5");}
	           
	   }
}