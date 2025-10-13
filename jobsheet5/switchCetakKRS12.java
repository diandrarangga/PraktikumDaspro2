import java.util.Scanner;

public class switchCetakKRS12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--- Cetak KRS SIAKAD ---");
        System.out.print("Masukkan semester saat ini: ");
        int semester = sc.nextInt();

        System.out.print("Apakah UKT sudah lunas? (true/false): ");
        boolean uktLunas = sc.nextBoolean();

        switch (semester) {
            case 1:
                System.out.println("=== KRS Semester 1 ===");
                if (uktLunas) {
                    System.out.println("Pembayaran UKT terverifikasi");
                    System.out.println("Silakan cetak KRS dan minta tanda tangan DPA");
                } else {
                    System.out.println("Registrasi ditolak. Silakan lunasi UKT terlebih dahulu.");
                }
                break;
            case 2:
                System.out.println("KRS Semester 2 ditampilkan");
                break;
            case 3:
                System.out.println("KRS Semester 3 ditampilkan");
                break;
            case 4:
                System.out.println("KRS Semester 4 ditampilkan");
                break;
            case 5:
                System.out.println("KRS Semester 5 ditampilkan");
                break;
            case 6:
                System.out.println("KRS Semester 6 ditampilkan");
                break;
            default:
                System.out.println("KRS Semester 7 atau lebih ditampilkan");
                break;
        }

        System.out.println("Terima Kasih");
        sc.close();
    }
    
}
