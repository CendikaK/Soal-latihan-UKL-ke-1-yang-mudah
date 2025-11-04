import java.util.Scanner;

public class Soal_1_Mudah {

    public static void main(String[] args) {

        int harga_jarak = 0, tambahan = 0;
        double harga_total = 0;
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan berat paket (KG)");
        double berat = input.nextDouble();
        System.out.println("Masukkan jarak tempuh (KM)");
        double jarak = input.nextDouble();
        if (jarak < 10) {
            harga_jarak = 4250;
        } else {
            harga_jarak = 6000;
        }

        System.out.println("Masukkan panjang, lebar, dan tinggi paket (cm)");
        System.out.print("Panjang: ");
        double panjang = input.nextDouble();
        System.out.print("Lebar: ");
        double lebar = input.nextDouble();
        System.out.print("Masukkan tinggi: ");
        double tinggi = input.nextDouble();

        double volume = panjang * lebar * tinggi;
        if (volume > 100) {

            tambahan = 50000;
        }

        harga_total = (harga_jarak * berat) + tambahan;
        System.out.println("harga akhir dari pengiriman paket adalah: " + harga_total);
    }

}
