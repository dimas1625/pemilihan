/**
 * PemilihanPercobaan218
 */
import java.util.Scanner;
 public class PemilihanPercobaan218 {

    public static void main(String[] args) {
        Scanner input18 = new Scanner(System.in);
        
        System.out.println("Nilai uas : ");
        float uas = input18.nextFloat();
        System.out.println("Nilai uts : ");
        float uts = input18.nextFloat();
        System.out.println("Nilai kuis : ");
        float kuis = input18.nextFloat();
        System.out.println("Nilai tugas : ");
        float tugas = input18.nextFloat();

        float total = (uas * 0.4F) + (uts * 0.3F) + (kuis * 0.1F) + (tugas * 0.2F);

        String message = total < 65 ? " Remidi " : " Tidak Remidi ";
        System.out.println("Nilai akhir = " + total + " sehingga " + message);

        if (total>84 && total<=100) {
            System.out.println("Nilai yang anda dapatkan adalah : A");
        }
        else if (total>75 && total<=84) {
            System.out.println("Nilai yang anda dapatkan adalah : B+");
        }
        else if (total>65 && total<=75) {
            System.out.println("Nilai yang anda dapatkan adalah : B");
        }
        else if (total>58 && total<=65) {
            System.out.println("Nilai yang anda dapatkan adalah : C+");
        }
        else if (total>50 && total<=58) {
            System.out.println("Nilai yang anda dapatkan adalah : C");
        }
        else if (total>39 && total<=50) {
            System.out.println("Nilai yang anda dapatkan adalah : D");
        }
        else {
        }
    }
}