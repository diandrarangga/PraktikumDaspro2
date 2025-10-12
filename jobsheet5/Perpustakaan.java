
import java.util.Scanner;

public class Perpustakaan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("--- Sistem Izin Masuk Perpustakaan ---");

        System.out.print("Apakah Anda membawa kartu mahasiswa? (true/false): ");
        boolean bawaKartu = input.nextBoolean();

        System.out.print("Apakah Anda sudah registrasi online? (true/false): ");
        boolean registrasiOnline = input.nextBoolean();

        // Logika izin masuk: harus memenuhi kedua syarat
        if (bawaKartu && registrasiOnline) {
            System.out.println("Izin masuk diberikan. Selamat datang di perpustakaan!");
        } else {
            System.out.println("Maaf, Anda tidak diizinkan masuk.");
        }

        input.close();
    }
}