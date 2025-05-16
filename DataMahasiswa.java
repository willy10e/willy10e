
package ujian;
import java.util.Scanner;


public class DataMahasiswa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // 1. Input data 
        System.out.print("Masukkan Nama: ");
        String nama = input.nextLine();

        System.out.print("Masukkan NPM: ");
        String npm = input.nextLine();

        System.out.print("Masukkan Jenis Kelamin: ");
        String jenisKelamin = input.nextLine();

        System.out.print("Masukkan Umur: ");
        int umur = input.nextInt();

        input.nextLine();

        System.out.print("Masukkan Kelas: ");
        String kelas = input.nextLine();

        System.out.print("Masukkan Fakultas: ");
        String fakultas = input.nextLine();

        System.out.print("Masukkan Banyak Teman: ");
        int banyakTeman = input.nextInt();

        System.out.println(); 

        //  Cek umur
        if (umur <= 17) {
            System.out.println("Kamu Masih Muda");
        } else {
            System.out.println("Kamu Mahasiswa");
        }

        // Cek banyak teman
        if (banyakTeman < 5) {
            for (int i = 0; i < 10; i++) {
                System.out.println("Universitas Methodist Indonesia");
            }
        } else {
            for (int i = 0; i < 20; i++) {
                System.out.println("Fakultas Ilmu Komputer");
            }
        }

        // Cetak data 
        System.out.println("\n--- Data Mahasiswa ---");
        System.out.println("Nama         : " + nama);
        System.out.println("NPM          : " + npm);
        System.out.println("Jenis Kelamin: " + jenisKelamin);
        System.out.println("Umur         : " + umur);
        System.out.println("Kelas        : " + kelas);
        System.out.println("Fakultas     : " + fakultas);
        System.out.println("Banyak Teman : " + banyakTeman);
    }
}