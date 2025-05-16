package packagebeda;

import uts.soal4; 

public class packagebeda {
    public static void main(String[] args) {
        soal4 s = new soal4();
        s.gantiKode(444);
        s.gantiNamaBarang("air");
        s.gantiNamaPenerima("rooon");
        s.gantiNamaToko("nantulang");
        s.gantiJenisBarang("minuman");
        s.gantiHargaBarang(50000);
        s.gantiBeratBarang(20);

        s.cetakData(); // Cetak hasil
    }
}

