
public class perulangan {
    
    public static void main(String[] args) {
        
        // untuk for
        //i = 2
        // i lebih kecil sama dengan 20
        // i+=3 yaitu 20 + 3 = 23 
        //sekarang i nya adalah 23
        // untuk if 
        // i % 4 == 2 berarti 
        // 23 % 4 == 2
        /* 2 % 4 = 2
           14 % 4 = 2 
        */
        // jadi maksudnya adalah sisa bagi yang hasilnya 2 !
        
        
        for (int i = 2; i <= 20; i+=3){
            if (i % 4 == 2) {
                System.out.println(i);
            }
        }
        
    }
    
}