import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("___pengeluaran uang bulanan anak kosan___");
        Scanner input = new Scanner(System.in);

        // Meminta input
        System.out.print("Total Masukan: Rp");
        double TotalMasukan = input.nextDouble();

        System.out.print("Total Pengeluaran: Rp");
        double TotalPengeluaran = input.nextDouble();

        // Menghitung sisa uang 
        double SisaUangBulanIni = TotalMasukan - TotalPengeluaran;

        // Menentukan sisa uang
        if (SisaUangBulanIni >= 0) {
            System.out.println("Sisa uang Anda mencukupi.");
        } else {
            System.out.println("Sisa uang Anda tidak mencukupi.");
        }

        // Menutup Scanner
        input.close();
    }
}
