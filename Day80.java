package pkg100.days.of.coding;

import java.util.Scanner;

public class Day80_ {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        
        System.out.print("masukan nilai yang ingin anda cek : ");
        int nilaiCari = sc.nextInt();
        
        int nilai [] = {10,20,30,40,50,60,70};
        
        boolean ditemukan = false;
        for (int i = 0; i < nilai.length; i++) {
            if (nilai[i] == nilaiCari){
                ditemukan = true;
                break;   
        }
            
        }
        if (ditemukan) {
            System.out.println("nilai : " + nilaiCari + " ditemukan dalam array");
        }else{
            System.out.println("nilai : " + nilaiCari + " tidak ditemukan dalam array");
        }
    }
    
}

