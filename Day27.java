
public class Day27_angkaSatuanSampaiRibuan {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
            System.out.print("masukan angka: ");
        int nilai= scan.nextInt();
        if(nilai < 10){
            System.out.println("satuan");
        }else if (nilai < 100){
            System.out.println("puluhan");
        }else if (nilai < 1000){
            System.out.println("ratusan");
        }else
            System.out.println("ribuan");
      
    }
} 
    
