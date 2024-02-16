package soal2;
//membeli gorengan jika mempunyai uang lebih besar dari 5000 (rupiah) dan hari tidak hujan
/**
 *
 * @author Mia Amalia
 */
import java.util.Scanner ;

public class Soal2 {
    

        public static void main(String[] args) {
            // Input
            Scanner input = new Scanner(System.in);
            System.out.print("Masukkan jumlah uang Anda: ");
            int uang = input.nextInt();

            System.out.print("Apakah hari ini hujan? (true/false): ");
            boolean hujan = input.nextBoolean();

            // Proses dan Output
            if (uang > 5000 && !hujan) {
                System.out.println("Anda akan membeli gorengan!");
            } else {
                System.out.println("Anda tidak akan membeli gorengan");
            }
        }
    }

