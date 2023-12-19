package pkg100.days.of.coding;

import java.util.Scanner;

public class Day72_array {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        
        String dataMahasiswa [][] = new String [5][3]; 
        
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 3; j++) {
                if(j == 0){
                    System.out.print("Nama : ");
                }else if(j == 1){
                    System.out.print("NIM : ");
                }else{
                    System.out.print("Nilai : ");
                }
                dataMahasiswa[i][j] = sc.next();
            }
            System.out.println("========================");
        }
        System.out.println("=====CETAK DATA MAHASISWA=====");
        
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(dataMahasiswa[i][j] + " ");
            }
            System.out.println("");
        }
    }
    
}
