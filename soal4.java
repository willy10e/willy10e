package uts; // <== huruf kecil, sesuai nama folder

public class soal4 {
    private int kodeBarang;
    public String namaBarang;
    String namaPenerima;
    String namaToko;
    private String jenisBarang;
    int hargaBarang;
    protected int beratBarang;

    public void isiData() {
        kodeBarang = 123;
        namaBarang = "Aqua";
        namaPenerima = "Ronny";
        namaToko = "LustStore";
        jenisBarang = "Minuman";
        hargaBarang = 5000;
        beratBarang = 2;
    }

    public void gantiKode(int kodeBarang) {
        this.kodeBarang = kodeBarang;
    }

    public void gantiNamaBarang(String namaBarang) {
        this.namaBarang = namaBarang;
    }

    public void gantiNamaPenerima(String namaPenerima) {
        this.namaPenerima = namaPenerima;
    }

    public void gantiNamaToko(String namaToko) {
        this.namaToko = namaToko;
    }

    public void gantiJenisBarang(String jenisBarang) {
        this.jenisBarang = jenisBarang;
    }

    public void gantiHargaBarang(int hargaBarang) {
        this.hargaBarang = hargaBarang;
    }

    public void gantiBeratBarang(int beratBarang) {
        this.beratBarang = beratBarang;
    }

    public void cetakData() {
        System.out.println("Kode Barang    : " + kodeBarang);
        System.out.println("Nama Barang    : " + namaBarang);
        System.out.println("Nama Penerima  : " + namaPenerima);
        System.out.println("Nama Toko      : " + namaToko);
        System.out.println("Jenis Barang   : " + jenisBarang);
        System.out.println("Harga Barang   : " + hargaBarang);
        System.out.println("Berat Barang   : " + beratBarang);
    }
    
    public static void main(String[] args) {
    soal4 s = new soal4();
    s.gantiKode(111);
    s.gantiNamaBarang("Teh Botol");
    s.gantiNamaPenerima("Budi");
    s.gantiNamaToko("Toko Barokah");
    s.gantiJenisBarang("Minuman");
    s.gantiHargaBarang(7000);
    s.gantiBeratBarang(3);

    s.cetakData();
}
}
