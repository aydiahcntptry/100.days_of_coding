package pkg100.days.of.coding;

public class Day68_array {

    public static void main(String[] args) {
        int nilai [][] = {
            {20,45,69},
            {54,28,99},
            {34,67,89}
        };
        int nilaiTertinggi = nilai[0][0];
        int nilaiTerendah = nilai[0][0];
        for (int i = 0; i < nilai.length; i++) {
            for (int j = 0; j < nilai[i].length; j++) {
                if (nilai[i][j] > nilaiTertinggi) {
                    nilaiTertinggi = nilai[i][j];
                }
                if (nilai[i][j] < nilaiTerendah) {
                    nilaiTerendah = nilai[i][j];
                }    
            }
        }
        System.out.println("Nilai tertinggi : " + nilaiTertinggi);
        System.out.println("Nilai terendah : " + nilaiTerendah);
    }
    
}
