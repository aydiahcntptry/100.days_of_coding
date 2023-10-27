
public class main {
    
    public static void main(String[] args) {
        // bilangan prima
        // mencari prima sampai batas 20
         
        int batas = 20; 
        
        for (int i = 0; i <= 20; i++){
            if (i==2){
                System.out.println(i);
            }
            for (int j = 2; j < i; j++){
                if (i%j==0){
                    break;
                }else{
                    System.out.println(i);
                    break;
                }
            }    
        }
        
    }
    
}