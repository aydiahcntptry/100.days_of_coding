package pkg100.days.of.coding;

public class Day79_ {

    public static void main(String[] args) {
        
        int nilai [][] = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        
        int jumlahBaris = nilai.length;
        int jumlahKolom = nilai[0].length;
        
        for (int i = 0; i < jumlahBaris; i++) {
            int angkaTerakhir = nilai[i][jumlahKolom - 1 ];
            System.out.println("angka terakhir di baris ke : " + (i + 1) + " = " + angkaTerakhir);
            
        }
    }
    
}

