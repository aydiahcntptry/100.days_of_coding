
package pkg100.days.of.coding;

public class Day18_faktorial {

    public static void main(String[] args) {
        
        int angka =7;
        int faktorial = 1;
        for (int i = 1; i <= angka; i++){
            faktorial *=i;
        }
        System.out.println("hasil perkalian dari 1 hingga angka " + angka + " adalah " + faktorial);
        // 1*2*3*4*5*6*7 = 5040
    }
    
}
