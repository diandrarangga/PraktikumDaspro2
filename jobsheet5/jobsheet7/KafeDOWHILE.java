import java.util.Scanner;
public class KafeDOWHILE {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String namaPelanggan;
        int jumlahKopi, jumlahTeh, jumlahRoti;
        double totalHarga;

        // Harga satuan
        int hargaKopi = 12000;
        int hargaTeh = 7000;
        int hargaRoti = 20000;

        do {
            System.out.print("Masukkan nama pelanggan (ketik 'batal' untuk keluar): ");
            namaPelanggan = input.nextLine();

            if (namaPelanggan.equalsIgnoreCase("batal")) {
                System.out.println("Pesanan dibatalkan.");
                break;
            }

            System.out.print("Jumlah kopi: ");
            jumlahKopi = input.nextInt();

            System.out.print("Jumlah teh: ");
            jumlahTeh = input.nextInt();

            System.out.print("Jumlah roti: ");
            jumlahRoti = input.nextInt();
            
            totalHarga = (jumlahKopi * hargaKopi) + (jumlahTeh * hargaTeh) + (jumlahRoti * hargaRoti);
            System.out.println("Total harga pesanan Anda: Rp " + totalHarga);

            input.nextLine(); 
        } while (true);

        System.out.println("Semua transaksi selesai. Terima kasih!");
        input.close();
    }
}
