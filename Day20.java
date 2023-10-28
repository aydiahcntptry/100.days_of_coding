
public class Main {
    
    public static void main(String[] args) {
        int jumlahKelipatan = 0;
        
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                jumlahKelipatan +=i;
                System.out.println("jumlah kelipatan 3 dan 5 antara 1 sampai 100 adalah : " + jumlahKelipatan);
            }
        }
    }
    
}