class Mahasiswa extends User {
    public Mahasiswa(String nama, String nim) {
        super(nama, nim);
    }

    @Override
    public boolean login(String inputNama, String inputNim) {
        return getNama().equals(inputNama) && getNim().equals(inputNim);
    }

    @Override
    public void displayInfo() {
        System.out.println("Login sebagai Mahasiswa berhasil!");
        System.out.println("Nama: " + getNama());
        System.out.println("NIM: " + getNim());
    }
}