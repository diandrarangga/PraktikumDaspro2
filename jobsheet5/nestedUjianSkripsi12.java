import java.util.Scanner;
public class nestedUjianSkripsi12 {
    public static void main(String[] args) {
        // langkah 3: deklarasi scanner
        Scanner sc = new Scanner(System.in);

        // ldeklarasi variabel pesan
        String pesan;

        //  input status kompen
        System.out.print("Apakah Anda bebas kompen? (ya/tidak): ");
        String bebasKompen = sc.nextLine().trim(); // trim untuk hapus spasi di awal/akhir

        //  input log bimbingan
        System.out.print("Masukkan jumlah log bimbingan dengan Pembimbing 1: ");
        int bimbinganP1 = sc.nextInt();
        System.out.print("Masukkan jumlah log bimbingan dengan Pembimbing 2: ");
        int bimbinganP2 = sc.nextInt();

        //  nested-if
        if (bebasKompen.equalsIgnoreCase("ya")) { // level pertama
            if (bimbinganP1 >= 8 && bimbinganP2 >= 8) { // level kedua
                pesan = "Anda diperbolehkan mengikuti ujian skripsi.";
            } else {
                pesan = "Anda belum memenuhi log bimbingan minimal 8 kali dengan masing-masing pembimbing.";
            }
        } else {
            pesan = "Anda tidak dapat mengikuti ujian skripsi karena belum bebas kompen.";
        }

        // output
        System.out.println("\nHasil pengecekan:");
        System.out.println(pesan);

        // tutup scanner
        sc.close();
    }
    
}
