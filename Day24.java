
package pkg100.days.of.coding;

import java.util.Scanner;

public class Day24_inputNilaiMahasiswa {

    public static void main(String[] args) {
        
        //hari ini kita akan belajar input nilai mahasiswa
        //dengan menggunakan Scanner, Operator pembandingan dan percanbangan if else
        
        Scanner scan = new Scanner(System.in);
        String nama,nim,matkul;
        final double nilai_presensi, nilai_tugas, nilai_uas, nilai_akhir;
        
        System.out.println("-------NILAI INPUT MAHASISWA-------");
        
        System.out.print("Masukan Nama \t: ");
        nama = scan.nextLine();
        System.out.print("Masukan NIM \t: ");
        nim = scan.nextLine();
        System.out.print("Mata Kuliah \t: ");
        matkul = scan.nextLine();
        System.out.print("Nilai Presensi \t: ");
        nilai_presensi = scan.nextDouble();
        System.out.print("Nilai Tugas \t: ");
        nilai_tugas = scan.nextDouble();
        System.out.print("Nilai UAS \t: ");
        nilai_uas = scan.nextDouble();        
        nilai_akhir = (0.30 * nilai_presensi + 0.30 * nilai_tugas + 0.40 * nilai_uas);
        System.out.println("Rata-rata nilai anda adalah "+ nilai_akhir);
        
        String predikat=
                nilai_akhir <= 0 ? " Nilai Salah ": 
                nilai_akhir >= 100 ? " Nilai Salah ":
                nilai_akhir >= 85 ? " Sangat Baik ":
                nilai_akhir >= 80 ? " Baik ": 
                nilai_akhir >= 70 ? " Cukup ":
                nilai_akhir >= 60 ? " Kurang ":"error";
                
        System.out.println("Predikat nilai anda" + predikat);  
        
        if (nilai_akhir <=0 || nilai_akhir >= 100){
            System.out.println("Nilai Anda Tidak Di Input");    
        }
        else if (nilai_akhir >= 85 || nilai_akhir >=80 || nilai_akhir >= 70){
        System.out.println("Dan Anda Dinyatakan Lulus");
    }
        else{
            System.out.println("Dan Dinyatakan Tidak Lulus");
        }
    }
                
}
    
