 
public class Day16_memahami_modulus {

    public static void main(String[] args) {
        
        // memahami (%)modulus atau sisa bagi :)
       
        for (int i = 2; i <= 20; i+=3){
            if (i % 4 == 2 ) {
                System.out.println(i);
            }else{
                System.out.println("angka tidak memenuhi syarat");
            }
        }
        // coba lagi
        System.out.println("==========coba lagi==========");
        for (int i = 0; i <= 10; i++) {
            if (i % 2 == 1){
                System.out.println(i);    
            }else{
                System.out.println("angka tidak memenuhi syarat");
            }
        }
    }
    
}
    
