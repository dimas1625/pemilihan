import java.util.Scanner;
/**
 * Pemilihanternary
 */
public class Pemilihanternary {

    public static void main(String[] args) {
        Scanner input18 = new Scanner (System.in);

        System.out.println("Masukkan angka");
        int angka = input18.nextInt();
        String statusAngka=(angka % 2==0) ? " bilangan genap" : " bilangan ganjil";

        System.out.println("Angka " +angka+ " adalah" + statusAngka);

    }
} 
        
        