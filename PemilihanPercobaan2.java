/**
 * PemilihanPercobaan2
 */
import java.util.Scanner;
 public class PemilihanPercobaan2 {

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
   }
}