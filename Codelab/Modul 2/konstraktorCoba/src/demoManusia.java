class manusia
{
    String nama,alamat;
    int umur;


    //konstruktor yang tidak mempunyai parameter
    public manusia(String nama, int umur, String alamat) {
        this.nama = nama;
        this.umur = umur;
        this.alamat = alamat;
    }

    void cetak (){

    }
}


class mahasiswa extends manusia {

    int nim;

    public mahasiswa(String nama, int umur, String alamat, int nim) {
        super(nama, umur, alamat);
        this.nim = nim;
    }
 @Override
    void cetak (){
        System.out.println("nama: " + nama + "\numur: " + umur + "\nalamat: " + alamat + "\nnim: " + nim);
    }
}
public class demoManusia {
    public static void main(String[] args) {
        manusia manusia1 = new mahasiswa("rudi",20,"jalan serayu sanggeng", 190 );

        manusia1.cetak();
    }

}
