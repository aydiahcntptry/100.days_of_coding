package pkg100.days.of.coding;

public class Day99_ {

    public static void main(String[] args) {
        
        System.out.println("=====StringBuffer deleteCharAt()=====");
        
        StringBuffer nama = new StringBuffer ("chinta");
        System.out.println("sebelum : " + nama);
        nama.deleteCharAt(1);
        System.out.println("sedudah : " + nama);
        
        System.out.println("=====StringBuilder deleteCharAt()=====");
        
        StringBuilder angkatan = new StringBuilder ("angkatan. 23");
        System.out.println("sebelum : " + angkatan);
        angkatan.deleteCharAt(8);
        System.out.println("sesudah : " + angkatan);
        
    }
    
}
