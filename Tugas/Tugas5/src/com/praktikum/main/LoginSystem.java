package com.praktikum.main;

import com.praktikum.data.Item;
import com.praktikum.users.User;
import com.praktikum.users.Admin;
import com.praktikum.users.Mahasiswa;

import java.util.Scanner;
import java.util.ArrayList;

public class LoginSystem
{
    public static ArrayList<User> userList = new ArrayList<>();
    public static ArrayList<Item> reportedItem = new ArrayList<>();
    public static void main(String[] args)
    {
        userList.add(new Admin("Rayya Az Zahra Firdausi Khuludiyah","202410370110190","admin190", "password190"));
        userList.add(new Mahasiswa("Rayya", "190"));
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\n--- Sistem Login ---");
            System.out.println("1. Login Admin");
            System.out.println("2. Login Mahasiswa");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            int pilihan;
            try {
                pilihan = scanner.nextInt();
                scanner.nextLine();
                if (pilihan == 1) {
                    System.out.print("Username: ");
                    String username = scanner.nextLine();
                    System.out.print("Password: ");
                    String password = scanner.nextLine();
                    User admin = Admin.loginAdmin(username, password);
                    if (admin !=null){
                        admin.displayinfo();
                        admin.displayAppMenu();
                    }
                } else if (pilihan == 2) {
                    System.out.print("Nama: ");
                    String nama = scanner.nextLine();
                    System.out.print("NIM: ");
                    String nim = scanner.nextLine();
                    User mahasiswa = Mahasiswa.loginMahasiswa(nama, nim);
                    if (mahasiswa !=null){
                        mahasiswa.displayinfo();
                        mahasiswa.displayAppMenu();
                    }
                } else if (pilihan == 0) {
                    System.out.println("Terima kasih!");
                    break;
                } else {
                    System.out.println("Pilihan tidak valid.");
                }
            } catch (Exception e) {
                System.out.println("Input tidak valid atau data tidak ada.");
                scanner.nextLine();
            }
        }
    }
}