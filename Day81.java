package pkg100.days.of.coding;

public class Day81_ {

    public static void main(String[] args) {
        
        String buah [] = {"mangga","pisang","durian","apel","anggur","rambutan"};
        int i = 0;
        while (i < buah.length){
            if (i % 2 == 1){
                System.out.println(buah[i]);
                
            }
            i++;
        }
    }
    
}

