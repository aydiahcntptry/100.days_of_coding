import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("masukan karakter penilaian A/B/C/D/E : ");
        
        char nilai = input.next().charAt(0);
        
        if (nilai == 'A'){
            System.out.println("nilai anda sempurna");
        }else if (nilai == 'B'){
            System.out.println("nilai anda memuaskan");
        }else if (nilai == 'C'){
            System.out.println("nilai anda cukup");
        }else if (nilai == 'D'){
            System.out.println("nilai anda kurang");
        }else if (nilai == 'E'){
            System.out.println("nilai anda buruk");
        }else{
            System.out.println("maaf, anda salah memasukan huruf");
        }
    }
    
}