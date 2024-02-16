package soal1;
//inputan tiga buah masukan bilangan bulat dan menampilkan hasil operasi (+,-,*,/) ketiga bilangan
import java.util.Scanner;

public class Soal1 {
    public static void main(String[] args) {
        // Membuat objek Scanner untuk menerima input dari pengguna
        Scanner input = new Scanner(System.in);

        // Meminta untuk memasukkan tiga bilangan bulat (input)
        System.out.print("Masukkan bilangan pertama: ");
        int bilanganPertama = input.nextInt();

        System.out.print("Masukkan bilangan kedua: ");
        int bilanganKedua = input.nextInt();

        System.out.print("Masukkan bilangan ketiga: ");
        int bilanganKetiga = input.nextInt();

        // Melakukan operasi penjumlahan dan menampilkan hasilnya (proses, output)
        int hasilPenjumlahan = bilanganPertama + bilanganKedua + bilanganKetiga;
        System.out.println("Penjumlahan: " + hasilPenjumlahan);

        // Melakukan operasi pengurangan dan menampilkan hasilnya (proses, output)
        int hasilPengurangan = bilanganPertama - bilanganKedua - bilanganKetiga;
        System.out.println("Pengurangan: " + hasilPengurangan);

        // Melakukan operasi perkalian dan menampilkan hasilnya (proses, output)
        int hasilPerkalian = bilanganPertama * bilanganKedua * bilanganKetiga;
        System.out.println("Perkalian: " + hasilPerkalian);

        // Melakukan operasi pembagian dan menampilkan hasilnya (proses, output)
        int hasilPembagian = bilanganPertama / bilanganKedua / bilanganKetiga;
        System.out.println("Pembagian: " + hasilPembagian);
    }
}
