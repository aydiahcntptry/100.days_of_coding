
package pkg100.days.of.coding;

import java.util.Scanner;

public class Day51_operatorTernary {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukan umur anda : ");
        int umur = sc.nextInt();
        
        System.out.print("apa anda memiliki SIM ? (true/false) : ");
        boolean memilikiSIM = sc.nextBoolean();
        
        String usia = umur >= 18 ? "boleh mengemudi" : "tidak boleh mengemudi";
        
        System.out.println(umur + " tahun " + usia);

    }
    
}
