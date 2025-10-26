
import java.util.Scanner;

public class caasemetthod12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input data mahasiswa
        System.out.println("=== SISTEM PENENTUAN KELULUSAN MAHASISWA ===");
        System.out.print("Masukkan nama mahasiswa: ");
        String nama = input.nextLine();
        System.out.print("Masukkan NIM mahasiswa: ");
        String NIM = input.nextLine();

        // Nilai kehadiran dan etika
        System.out.print("Masukkan nilai kehadiran : ");
        double kehadiran = input.nextDouble();
        System.out.print("Masukkan nilai etika : ");
        double etika = input.nextDouble();

        // Nilai rata-rata mata kuliah
        System.out.print("Masukkan rata-rata nilai mata kuliah: ");
        double rataMK = input.nextDouble();

        // Logika penentuan kelulusan
        String status;

        if (kehadiran <= 75 || etika <= 70) {
            // Jika salah satu di bawah batas minimum, tidak lulus
            status = "TIDAK LULUS";
        } else {
            // Jika kehadiran & etika baik, baru mengecek nilai mk
            if (rataMK <= 60) {
                status = "TIDAK LULUS";
            } else {
                status = "LULUS";
            }
        }

        // Output hasil
        System.out.println("\n=== HASIL PENILAIAN KELULUSAN ===");
        System.out.println("Nama Mahasiswa : " + nama);
        System.out.println("NIM            : " + NIM);
        System.out.println("Nilai Kehadiran: " + kehadiran);
        System.out.println("Nilai Etika    : " + etika);
        System.out.println("Rata-rata MK   : " + rataMK);
        System.out.println("---------------------------------------");
        System.out.println("Status Kelulusan: " + status);

        input.close();
    }
}
