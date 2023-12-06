
public class Day59_array {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        
        System.out.print("masukan elemen array : ");
        int pilih = sc.nextInt();
        int nilai [] = {13,16,23,45,56};
        
        for (int i = 0; i < nilai.length; i++) {
            if (pilih == nilai[i]) {
                System.out.println("indeks ke " + i);
                
            }
        }
    }
    
}
