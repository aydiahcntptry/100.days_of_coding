package pkg100.days.of.coding;

import java.util.ArrayList;

public class Day89_ {

    public static void main(String[] args) {
        
        ArrayList<String> warna = new ArrayList<>();
        
        warna.add("merah");
        warna.add("putih");
        warna.add("kuning");
        warna.add("biru");
        
        // array awal
        System.out.println("===ARRAY AWAL===");
        System.out.println(warna);
        
        // tambah elemen array
        System.out.println("===TAMBAH ELEMEN ARRAY===");
        warna.add(3,"hijau");
        System.out.println(warna);
        
        // menghapus elemen array
        System.out.println("===HAPUS ELEMEN ARRAY===");
        warna.remove("putih");
        System.out.println(warna);
        
        // cetak array satu satu
        System.out.println("===CETAK ARRAY SATU SATU===");
        System.out.println(warna.get(0));
        System.out.println(warna.get(1));
        System.out.println(warna.get(2));
        System.out.println(warna.get(3));
        
        //menghapus semua elemen array
        System.out.println("===MENGHAPUS SEMUA ELEMEN ARRAY===");
        warna.clear();
        System.out.println(warna);
    }
    
}

