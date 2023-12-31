package pkg100.days.of.coding;

import java.util.Scanner;

public class Day84_ {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        String buah [] = {"Semangka","Mangga","Apel","Rambutan","Anggur","Durian"};
                
        System.out.print("Masukan nomor indeks yang ingin di hapus : ");
        int hapusIndeks = sc.nextInt();
        
        if(hapusIndeks < 0 || hapusIndeks >= buah.length){
            System.out.println("Indeks yang anda masukan tidak ada di dalam array ");
        }else{
        String buahZ [] = new String [buah.length - 1];
        int j = 0;
        for (int i = 0; i < buah.length; i++) {
            if (i != hapusIndeks){
                buahZ[j++] = buah[i];
            }
        }
        System.out.println("HASIL SETELAH PENGHAPUSAN INDEKS");
        for (String buahan : buahZ) {
            System.out.println(buahan);
            
        }

    }
    
}
}
