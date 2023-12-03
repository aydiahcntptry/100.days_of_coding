
package pkg100.days.of.coding;

public class Day56_array {

    public static void main(String[] args) {
        
        System.out.println("====mengcetak isi array dengan do while====");
        
        int angka [] = {22,45,67,80,87};
        
        int i = 0;
        
        do {
            System.out.println(angka[i]);
            i++;
        }while(i<angka.length);
    }
    
}
