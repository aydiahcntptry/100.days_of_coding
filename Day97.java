package pkg100.days.of.coding;

public class Day97_ {

    public static void main(String[] args) {
        
        // penggunaan Split String
        
        String warna = "merah,kuning,hijau,biru";
        
        String[] pemisah = warna.split(",");
        
        for (String warnaPisah : pemisah){
            System.out.println(warnaPisah);
        }    
    }
    
}
