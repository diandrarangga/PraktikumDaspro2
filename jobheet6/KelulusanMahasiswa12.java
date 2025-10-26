import java.util.Scanner;

public class KelulusanMahasiswa12{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input data mahasiswa
        System.out.println("=== SISTEM PENENTUAN KELULUSAN MAHASISWA ===");
        System.out.print("Masukkan nama mahasiswa: ");
        String nama = input.nextLine();
        System.out.print("Masukkan NIM mahasiswa: ");
        String NIM = input.nextLine();

        // Nilai mata kuliah Algoritma dan Pemrograman
        System.out.println("\n--- Mata Kuliah : Algoritma dan Pemrograman ---");
        System.out.print("Nilai UTS: ");
        double utsAlgo = input.nextDouble();
        System.out.print("Nilai UAS: ");
        double uasAlgo = input.nextDouble();
        System.out.print("Nilai Tugas: ");
        double tugasAlgo = input.nextDouble();

        // Nilai mata kuliah Struktur Data
        System.out.println("\n--- Mata Kuliah : Struktur Data ---");
        System.out.print("Nilai UTS: ");
        double utsSD = input.nextDouble();
        System.out.print("Nilai UAS: ");
        double uasSD = input.nextDouble();
        System.out.print("Nilai Tugas: ");
        double tugasSD = input.nextDouble();

        // Hitung nilai akhir tiap mata kuliah
        double akhirAlgo = (utsAlgo * 0.3) + (uasAlgo * 0.4) + (tugasAlgo * 0.3);
        double akhirSD = (utsSD * 0.3) + (uasSD * 0.4) + (tugasSD * 0.3);

        // Tentukan status kelulusan per mata kuliah
        String statusAlgo = (akhirAlgo >= 60) ? "LULUS" : "TIDAK LULUS";
        String statusSD = (akhirSD >= 60) ? "LULUS" : "TIDAK LULUS";

        // Konversi nilai ke huruf (grade)
        String gradeAlgo, gradeSD;

        // Grade Algoritma dan Pemrograman
        if (akhirAlgo >= 80) gradeAlgo = "A";
        else if (akhirAlgo >= 73) gradeAlgo = "B+";
        else if (akhirAlgo >= 65) gradeAlgo = "B";
        else if (akhirAlgo >= 60) gradeAlgo = "C+";
        else if (akhirAlgo >= 50) gradeAlgo = "C";
        else if (akhirAlgo >= 39) gradeAlgo = "D";
        else gradeAlgo = "E";

        // Grade Struktur Data
        if (akhirSD >= 80) gradeSD = "A";
        else if (akhirSD >= 73) gradeSD = "B+";
        else if (akhirSD >= 65) gradeSD = "B";
        else if (akhirSD >= 60) gradeSD = "C+";
        else if (akhirSD >= 50) gradeSD = "C";
        else if (akhirSD >= 39) gradeSD = "D";
        else gradeSD = "E";

        // Rata-rata nilai akhir
        double rataRata = (akhirAlgo + akhirSD) / 2;

        // Status kelulusan semester (nested if)
        String statusSemester;
        if (statusAlgo.equals("LULUS") && statusSD.equals("LULUS")) {
            if (rataRata >= 70) {
                statusSemester = "LULUS SEMESTER";
            } else {
                statusSemester = "TIDAK LULUS SEMESTER";
            }
        } else {
            statusSemester = "TIDAK LULUS SEMESTER";
        }

        // Output hasil
        System.out.println("\n================ HASIL PENILAIAN AKADEMIK ================");
        System.out.println("Nama : " + nama);
        System.out.println("NIM  : " + NIM);
        System.out.println();
        System.out.println("Mata Kuliah           UTS   UAS   Tugas   Nilai Akhir   Nilai Huruf   Status");
        System.out.println("---------------------------------------------------------------------------");
        System.out.printf("%-22s %3.0f   %3.0f    %3.0f       %6.2f         %-3s        %-10s\n",
                "Algoritma Pemrograman", utsAlgo, uasAlgo, tugasAlgo, akhirAlgo, gradeAlgo, statusAlgo);
        System.out.printf("%-22s %3.0f   %3.0f    %3.0f       %6.2f         %-3s        %-10s\n",
                "Struktur Data", utsSD, uasSD, tugasSD, akhirSD, gradeSD, statusSD);
        System.out.println();
        System.out.printf("Rata-rata Nilai Akhir : %.2f\n", rataRata);
        System.out.printf("Status Semester       : %s (Rata-rata < 70)\n", statusSemester);

        input.close();
    }
}