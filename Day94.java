package pkg100.days.of.coding;

import java.util.Scanner;

public class Day94_ {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("masukan teks : ");
        String teks = sc.nextLine();
        
        char karakter1 = teks.charAt(0);
        char karakter2 = teks.charAt(9);
        char karakter3 = teks.charAt(12);       

        System.out.println("Karakter pada index 0\t: " + karakter1);
        System.out.println("Karakter pada index 9\t: " + karakter2);
        System.out.println("karakter pada index 12\t: " + karakter3);

        
    }
    
}
