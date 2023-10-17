import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        System.out.println("masukan angka");
        int a = input.nextInt();
        
        System.out.println("masukan angka");
        int b = input.nextInt();
        
        int min, max;
        
        if(a<b){
            min = a;
            max = b;
            
        }else{
            
            min = b;
            max = a;
        }
        System.out.println ("nilai Min : " + min);
        System.out.println ("nilai Max : " + max);
    }
    
}