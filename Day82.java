package pkg100.days.of.coding;

public class Day82_ {

    public static void main(String[] args) {
        
         int arrayA [] = {10,20,30,40,50};
         int arrayB [] = {60,70,80,90,100};
         
         int gabungArray = arrayA.length + arrayB.length;
         int gabungan [] = new int[gabungArray];
         
         for (int i = 0; i < arrayA.length; i++) {
             gabungan[i] = arrayA[i];   
        }
         for (int i = 0; i < arrayB.length; i++) {
            gabungan[arrayA.length + i] = arrayB[i];
        }
         System.out.println("gabungan array A dan B : ");
         for (int i = 0; i < gabungan.length; i++) {
             System.out.print(gabungan[i] + " ");
        }
    }
    
}

