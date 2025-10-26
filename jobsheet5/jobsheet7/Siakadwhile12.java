import java.util.Scanner;
public class Siakadwhile12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jml = input.nextInt();
        int i = 1;
        while (i <= jml) {
            System.out.print("Masukkan nilai mahasiswa ke-" + i + ": ");
            double nilai = input.nextDouble();

            if (nilai < 0 || nilai > 100) {
                System.out.println(
                    "Nilai tidak valid, silakan masukkan antara 0 - 100."
                );
                continue;
            }

            if (nilai > 80 && nilai <= 100) {
                System.out.println("Nilai mahasiswa ke-" + i + " = A");
                System.out.println("Bagus, pertahankan prestasimu!");
            } else if (nilai > 73 && nilai <= 80) {
                System.out.println("Nilai mahasiswa ke-" + i + " = B+");
            } else if (nilai > 65 && nilai <= 73) {
                System.out.println("Nilai mahasiswa ke-" + i + " = B");
            } else if (nilai > 60 && nilai <= 65) {
                System.out.println("Nilai mahasiswa ke-" + i + " = C+");
            } else if (nilai > 50 && nilai <= 60) {
                System.out.println("Nilai mahasiswa ke-" + i + " = C");
            } else if (nilai > 39 && nilai <= 50) {
                System.out.println("Nilai mahasiswa ke-" + i + " = D");
            } else {
                System.out.println("Nilai mahasiswa ke-" + i + " = E");
            }

            System.out.println();
            i++;
        }

        input.close();
    }
}
