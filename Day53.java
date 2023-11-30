
package pkg100.days.of.coding;

public class Day53_array {

    public static void main(String[] args) {
        
        System.out.println("=====Menjumlahkan isi array menggunakan for");
        
        int angka [] = new int [] {11,12,13,14,15};
        
        int jumlah = 0;
        
        for (int i = 0; i < angka.length; i++) {
            jumlah += angka[i];
        }
        System.out.println(jumlah);
    }
    
}
