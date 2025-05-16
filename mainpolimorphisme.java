package ujian;
import java.util.Scanner;

class Info {
    protected int npm;

    public void setNpm(int npm) {
        this.npm = npm;
    }

    public void tampilkanInfo() {
        System.out.println("Informasi umum.");
    }
}

//  Tumbuhan
class Tumbuhan extends Info {
    @Override
    public void tampilkanInfo() {
        System.out.println("Jenis Tumbuhan: Pohon Mangga, Bunga Mawar, Kaktus");
    }
}

//  Hewan
class Hewan extends Info {
    @Override
    public void tampilkanInfo() {
        System.out.println("Suara Hewan: Guk-guk , meong , Kukuruyuk");
    }
}


public class mainpolimorphisme {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan NPM: ");
        int npm = input.nextInt();

        Info info;

        // cek genap atau ganjil
        if (npm % 2 == 0) {
            info = new Tumbuhan();  
        } else {
            info = new Hewan();     
        }

        info.setNpm(npm);
        info.tampilkanInfo();       
    }
}