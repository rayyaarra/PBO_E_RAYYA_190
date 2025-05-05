public class hewan {
    static class Hewan {
        // Atribut
        String nama, jenis, suara;

        // Konstruktor
        public Hewan(String nama, String jenis, String suara) {
            this.nama = nama;
            this.jenis = jenis;
            this.suara = suara;
        }

        // Metode untuk menampilkan informasi
        public void tampilkanInfo() {
            System.out.println("Nama: " + nama);
            System.out.println("Jenis: " + jenis);
            System.out.println("Suara: " + suara);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // Membuat objek Hewan
        Hewan hewan1 = new Hewan("Kucing", "Mamalia", "Nyann~~");
        Hewan hewan2 = new Hewan("Anjing", "Mamalia", "Woof-Woof!!");
        // Menampilkan informasi kedua hewan
        hewan1.tampilkanInfo();
        hewan2.tampilkanInfo();
    }


}