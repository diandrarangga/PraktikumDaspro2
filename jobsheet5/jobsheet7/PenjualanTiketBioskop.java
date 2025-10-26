import java.util.Scanner;

public class PenjualanTiketBioskop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        final int hargaTiket = 50000;
        int totalTiketTerjual = 0;
        double totalPendapatan = 0;
        int jumlahTiket;
        String lanjut = "ya"; 

        System.out.println("=== PROGRAM PENJUALAN TIKET BIOSKOP ===");

        do {
            System.out.print("Masukkan jumlah tiket yang dibeli pelanggan: ");
            jumlahTiket = input.nextInt();

            if (jumlahTiket < 0) {
                System.out.println("Jumlah tiket tidak valid! Silakan masukkan ulang.");
                continue;
            }

            double totalHarga = jumlahTiket * hargaTiket;
            double diskon = 0;

            if (jumlahTiket > 10) {
                diskon = 0.15;
            } else if (jumlahTiket > 4) {
                diskon = 0.10;
            }

            totalHarga -= totalHarga * diskon;

            System.out.println("Diskon yang didapat: " + (diskon * 100) + "%");
            System.out.println("Total harga yang harus dibayar: Rp " + totalHarga);

            totalTiketTerjual += jumlahTiket;
            totalPendapatan += totalHarga;

            System.out.print("Apakah ada pelanggan lain? (ya/tidak): ");
            input.nextLine(); 
            lanjut = input.nextLine();

        } while (lanjut.equalsIgnoreCase("ya")); 

        System.out.println("\n=== REKAP PENJUALAN HARIAN ===");
        System.out.println("Total tiket terjual: " + totalTiketTerjual);
        System.out.println("Total pendapatan: Rp " + totalPendapatan);
        System.out.println("Terima kasih telah membeli tiket kami!!");

        input.close();
    }
}