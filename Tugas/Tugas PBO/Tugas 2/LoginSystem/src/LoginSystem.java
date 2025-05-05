import java.util.Scanner;

// Kelas Admin
class Admin {
    private final String validUsername = "admin";
    private final String validPassword = "admin123";

    public boolean login(String username, String password) {
        return username.equals(validUsername) && password.equals(validPassword);
    }
}

// Kelas Mahasiswa
class Mahasiswa {
    private final String validNama = "rayya";
    private final String validNim = "190";

    public boolean login(String nama, String nim) {
        return nama.equalsIgnoreCase(validNama) && nim.equals(validNim);
    }

    public void displayInfo() {
        System.out.println("=== Login Mahasiswa Berhasil ===");
        System.out.println("Nama: " + validNama);
        System.out.println("NIM : " + validNim);
    }
}

// Kelas Utama
public class LoginSystem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== Sistem Login ===");
        System.out.println("1. Login sebagai Admin");
        System.out.println("2. Login sebagai Mahasiswa");
        System.out.print("Pilih (1/2): ");
        int pilihan = input.nextInt();
        input.nextLine(); // Buang newline

        switch (pilihan) {
            case 1:
                System.out.print("Masukkan Username: ");
                String username = input.nextLine();
                System.out.print("Masukkan Password: ");
                String password = input.nextLine();

                Admin admin = new Admin();
                if (admin.login(username, password)) {
                    System.out.println("=== Login Admin Berhasil ===");
                } else {
                    System.out.println("Login Admin Gagal! Username atau Password salah.");
                }
                break;

            case 2:
                System.out.print("Masukkan Nama: ");
                String nama = input.nextLine();
                System.out.print("Masukkan NIM : ");
                String nim = input.nextLine();

                Mahasiswa mhs = new Mahasiswa();
                if (mhs.login(nama, nim)) {
                    mhs.displayInfo();
                } else {
                    System.out.println("Login Mahasiswa Gagal! Nama atau NIM salah.");
                }
                break;

            default:
                System.out.println("Pilihan tidak valid!");
        }

        input.close();
    }
}
