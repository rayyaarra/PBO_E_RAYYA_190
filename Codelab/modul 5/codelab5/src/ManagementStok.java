import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;
public class ManagementStok {
    public static void main (String [] args){

        Scanner input = new Scanner(System.in);
        ArrayList<Barang> daftarBarang = new ArrayList<>();
        ArrayList temp = new ArrayList<>();
        int pilihan = 0;
        Iterator iterator = daftarBarang.iterator();

        daftarBarang.add(new Barang("buku", 7));
        daftarBarang.add(new Barang("meja", 4));

        do{
            System.out.println("Pilihan:");
            System.out.println("1. Tambahkan barang baru");
            System.out.println("2. Tampilkan semua barang");
            System.out.println("3. kurangi stok");
            System.out.println("0. Keluar");
            System.out.print("Masukkan Pilihan: ");
            try {


                pilihan = input.nextInt();
                input.nextLine();
                int inputJumlah = 0;
                String inputBarang = "";
                int inputPilihan = 0;

                switch (pilihan) {
                    case 1:
                        System.out.printf("Masukkan nama Barang: ");
                        inputBarang = input.nextLine();
                        System.out.printf("Masukkan Jumlah Barang: ");
                        try {
                            inputJumlah = input.nextInt();
                            input.nextLine();

                            Barang barangBaru = new Barang(inputBarang, inputJumlah);
                            daftarBarang.add(barangBaru);
                        } catch (java.util.InputMismatchException e) {
                            System.out.println(e.getMessage() + "Input Stok Harus angka");
                            input.nextLine();
                        }
                        break;
                    case 2:
                        if (daftarBarang.isEmpty()) {
                            System.out.println("Stok barang kosong");
                        } else {
                            System.out.println("\nDaftar Barang:");
                            System.out.println("-----------------------------");
                            System.out.println("No. Nama Barang\tStok");
                            System.out.println("-----------------------------");
                        }

                        int index = 0;
                        for (Barang barang : daftarBarang) {
                            System.out.printf("%d. %s\t\t%d\n",
                                    index++, barang.getNama(), barang.getStok());
                        }
                        break;
                    case 3:
                        if (daftarBarang.isEmpty()) {
                            System.out.println("Stok barang kosong");
                        } else {
                            System.out.println("\n--- Daftar Barang (Pilih untuk Kurangi Stok) ---");
                            int i = 0;
                            for (Barang barang : daftarBarang) {
                                System.out.printf("%d. %s (Stok: %d)\n", i++, barang.getNama(), barang.getStok());
                            }

                            try {
                                System.out.print("Masukkan nomor indeks barang: ");
                                inputPilihan = input.nextInt();
                                input.nextLine();

                                // Validasi indeks
                                if (inputPilihan < 0 || inputPilihan >= daftarBarang.size()) {
                                    throw new IndexOutOfBoundsException("Index tidak ada");
                                }

                                Barang barangDipilih = daftarBarang.get(inputPilihan);

                                System.out.print("Masukkan jumlah stok yang akan diambil: ");
                                inputJumlah = input.nextInt();
                                input.nextLine();

                                // Validasi stok cukup atau tidak
                                if (inputJumlah > barangDipilih.getStok()) {
                                    throw new StokTidakCukupException("Stok untuk '" + barangDipilih.getNama() +
                                            "' hanya tinggal " + barangDipilih.getStok());
                                }

                                // Kurangi stok
                                barangDipilih.setStok(barangDipilih.getStok() - inputJumlah);
                                System.out.println("Stok barang '" + barangDipilih.getNama() +
                                        "' berhasil dikurangi. Sisa stok: " + barangDipilih.getStok());
                            } catch (InputMismatchException e) {
                                System.out.println("Input harus berupa angka.");
                                input.nextLine();
                            } catch (IndexOutOfBoundsException | StokTidakCukupException e) {
                                System.out.println(e.getMessage());
                            }
                        }
                        break;
                    case 0:
                        System.out.println("Terima Kasih <3");
                        break;
                    default:
                        System.out.println("Input Tidak Valid");
                }
            }
            catch (InputMismatchException e){
                System.out.println("Input harus berupa angka");
                input.nextLine();
            }


        }while (pilihan!=0);
        input.close();
    }
}

//array list dinamis

