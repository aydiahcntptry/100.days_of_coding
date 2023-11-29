
package pkg100.days.of.coding;

public class Day52_array {

    public static void main(String[] args) {   
        
        System.out.println("===mengambil data dari array===");
        
        String nama [] = {"agus","bayu","dewi","putra"};
        
        System.out.println(nama[3]);
        
        System.out.println("=====menggunakan perulangan for=====");
        
        String namaTeman [] = {"agus","bayu","dewi","putra"};  
        
        for (int i = 0; i < namaTeman.length; i++) {
            System.out.println("indeks ke " + i + " = " + namaTeman[i]);
        }
        
        }
    }
    

