package pkg100.days.of.coding;

import java.util.Scanner;

public class Day88_ {
    
    public static void nilaiIPK(double ipk){
        System.out.print("Mahasiswa dengan IPK " + ipk + " : ");
        
        if (ipk >= 3.5) {
            System.out.println("Termasuk dalam Kategori Pujian.");
        } else if (ipk >= 3.0) {
            System.out.println("Termasuk dalam Kategori Sangat Memuaskan.");
        } else if (ipk >= 2.5) {
            System.out.println("Termasuk dalam Kategori Memuaskan.");
        } else if (ipk >= 2.0) {
            System.out.println("Termasuk dalam Kategori Cukup.");
        } else {
            System.out.println("Termasuk dalam Kategori Tidak Lulus.");
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("masukan nilai IPK : ");
        double ipk = sc.nextDouble();
        nilaiIPK(ipk);
    }
    
}
