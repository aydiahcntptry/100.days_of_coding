package pkg100.days.of.coding;

public class Day78_ {
 
    public static void main(String[] args) {
        
        int[][] nilai = {
        	{1, 0, 0}, 
        	{0, 5, 6}, 
        	{3, 1, 0}
        	};
        int jumlahNol = hitungJumlahNol(nilai);
        System.out.println("Jumlah elemen array yang bernilai 0 : " + jumlahNol);
    }

    public static int hitungJumlahNol(int[][] array) {
        int jumlah = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] == 0) {
                    jumlah++;
                }
            }
        }
        return jumlah; 
    }
}
