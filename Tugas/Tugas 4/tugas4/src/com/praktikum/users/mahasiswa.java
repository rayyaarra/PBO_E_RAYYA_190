package com.praktikum.users;

import com.praktikum.actions.MahasiswaAction;
import java.util.Scanner;

public class mahasiswa extends user implements MahasiswaAction
{
    public mahasiswa(String nama, String nim)
    {
        super(nama, nim);
    }

    @Override
    public boolean login() {
        return getNama().equalsIgnoreCase("Rayya Az Zahra Firdausi Khuludiyah") && getNim().equals("202410370110190");
    }

    @Override
    public void displayAppMenu()
    {
        Scanner scanner = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("\n== Menu Mahasiswa ==");
            System.out.println("1. Laporkan Barang Temuan/Hilang");
            System.out.println("2. Lihat Daftar Laporan");
            System.out.println("0. Logout");
            System.out.print("Pilih menu: ");
            pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    reportItem();
                    break;
                case 2:
                    viewReportedItems();
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
    public void displayinfo() {
        System.out.println("Login Mahasiswa Berhasil");
        super.displayinfo();
    }

    @Override
    public void reportItem()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nama Barang: ");
        String nama = scanner.nextLine();
        System.out.print("Deskripsi Barang: ");
        String deskripsi = scanner.nextLine();
        System.out.print("Lokasi Terakhir/Ditemukan: ");
        String lokasi = scanner.nextLine();

        System.out.println(">> Laporan berhasil dikirim. <<");
    }

    @Override
    public void viewReportedItems()
    {
        System.out.println(">> Fitur Lihat Laporan Belum Tersedia <<");
    }
}


