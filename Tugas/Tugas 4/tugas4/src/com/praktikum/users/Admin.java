package com.praktikum.users;

import com.praktikum.actions.AdminActions;
import java.util.Scanner;

public class Admin extends user implements AdminActions
{
    private String username ;
    private String password ;

    public Admin(String nama, String nim, String username, String password) {
        super(nama, nim);
        this.username = username;
        this.password = password;
    }
    @Override
    public boolean login()
    {
        return username.equals("admin190") && password.equals("password190");
    }

    @Override
    public void displayAppMenu()
    {
        Scanner scanner = new Scanner(System.in);
        int pilihan;

        do{
            System.out.println("\n== Menu Admin ==");
            System.out.println("1. Kelola Laporan Barang");
            System.out.println("2. Kelola Data Mahasiswa");
            System.out.println("0. Logout");
            System.out.print("Pilih menu: ");
            pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    manageItems();
                    break;
                case 2:
                    manageUsers();
                    break;
                case 0:
                    System.out.println("Logout...");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 0);
    }

    @Override
    public void displayinfo(){
        System.out.println("Login Admin Berhasil");
        super.displayinfo();
    }

    @Override
    public void manageItems()
    {
        System.out.println(">> Fitur Kelola Barang Belum Tersedia <<");
    }

    @Override
    public void manageUsers()
    {
        System.out.println(">> Fitur Kelola Mahasiswa Belum Tersedia <<");
    }
}
