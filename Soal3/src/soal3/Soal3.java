package soal3;
//Menjumlahkan Kode ASCII dari karakter ‘1’ dan karakter ‘2’
/**
 *  
 * @author Mia Amalia
 */
import java.util.Scanner;

public class Soal3 {

    public static void main(String[] args) {
        // Input
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan karakter pertama: ");
        char char1 = input.next().charAt(0);
        System.out.print("Masukkan karakter kedua: ");
        char char2 = input.next().charAt(0);
        
        // Proses
        int ascii1 = (int) char1; 
        int ascii2 = (int) char2; 
        int total = ascii1 + ascii2;
        
        // Output
        System.out.println("Jumlah ASCII dari '" + char1 + "' dan '" + char2 + "' adalah: " + total);
    }
}
