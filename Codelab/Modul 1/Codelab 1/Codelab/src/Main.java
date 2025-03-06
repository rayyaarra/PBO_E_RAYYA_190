import java.util.Scanner;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // program membaca input dari user
        Scanner scanner = new Scanner(System.in);

        // User diminta untuk menginputkan nama
        System.out.print("Masukkan nama: ");
        String nama = scanner.nextLine();

        // User diminta untuk menginput jenis kelamin (P/L)
        System.out.print("Masukkan jenis kelamin (P/L): ");
        char jenisKelamin = scanner.next().charAt(0);

        // User diminta untuk menginput tahun lahir
        System.out.print("Masukkan tahun lahir: ");
        int tahunLahir = scanner.nextInt();

        // Menutup Scanner
        scanner.close();

        // Menghitung umur berdasarkan tahun lahir
        int tahunSekarang = LocalDate.now().getYear();
        int umur = tahunSekarang - tahunLahir;

        // Menentukan jenis kelamin dalam bentuk teks
        String jenisKelaminTeks;
        if (jenisKelamin == 'L' || jenisKelamin == 'l') {
            jenisKelaminTeks = "Laki-laki";
        } else if (jenisKelamin == 'P' || jenisKelamin == 'p') {
            jenisKelaminTeks = "Perempuan";
        } else {
            jenisKelaminTeks = "Tidak diketahui";
        }

        // Menampilkan output sesuai format yang diminta
        System.out.println("Data Diri:");
        System.out.println("Nama            : " + nama);
        System.out.println("Jenis Kelamin   : " + jenisKelaminTeks);
        System.out.println("Umur            : " + umur + " tahun");
    }
}