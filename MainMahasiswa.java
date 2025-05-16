
package ujian;

import java.util.Scanner;


public class MainMahasiswa {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Mahasiswa mhs = new Mahasiswa();

        // Input Nama dan NPM
        System.out.print("Masukkan Nama: ");
        String nama = input.nextLine();
        mhs.setNama(nama);

        System.out.print("Masukkan NPM: ");
        String npm = input.nextLine();
        mhs.setNpm(npm);

        // Output hasil
        System.out.println("\n--- Data Mahasiswa ---");
        System.out.println("Nama : " + mhs.getNama());
        System.out.println("NPM  : " + mhs.getNpm());
    }
}

