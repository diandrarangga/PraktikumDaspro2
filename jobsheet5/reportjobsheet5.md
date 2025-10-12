Soal Percobaan 1

1.Mengapa pengecekan pada struktur IF tersebut tidak melibatkan kondisi dengan operator relasional?
Jawaban:Karena Variabel uktLunas bertipe boolean (true atau false). Pada tipe boolean, kita tidak perlu operator relasional seperti ==, >, <, dll. Cukup gunakan langsung nilai boolean-nya di dalam if.

2.Saat program dijalankan, kemudian Anda mengisikan nilai false, bagaimana hasilnya?
Jawaban:Jika user mengetik false, maka variabel uktLunas = false. Maka program akan masuk ke blok else

3.Sistem perlu memberikan informasi apabila pengguna memasukkan nilai false, maka terdapat keluaran “Registrasi ditolak. Silakan lunasi UKT terlebih dahulu”. Modifikasi program tersebut dengan menambahkan struktur ELSE!
Jawaban:if (uktLunas) { // gunakan nama yang sama persis System.out.println("Pembayaran UKT terverifikasi"); System.out.println("Silakan cetak KRS dan minta tanda tangan DPA"); } else { System.out.println("Silakan lunasi UKT terlebih dahulu agar bisa mencetak KRS."); } 4. Commit dan push hasil modifikasi Anda ke Github dengan pesan “Modifikasi Percobaan 1” Jawaban: Sudah

Soal Percobaan 2

1.Apa fungsi dari sintaks break?
Jawaban:Dalam struktur switch-case, break digunakan untuk menghentikan eksekusi setelah suatu case dijalankan. Tanpa break, program akan melanjutkan ke case berikutnya walaupun kondisi tidak cocok (fall-through).

2.Apa peran dari sintaks default pada struktur pemilihan SWITCH-CASE?
Jawaban:Default berfungsi seperti else di if-else Jika tidak ada nilai yang cocok dengan case-case sebelumnya, maka blok default akan dijalankan.

3.Buat file baru dengan nama ifElseCetakKRSNoPresensi.java. File ini berisi program hasil transformasi dari program cetak KRS menggunakan struktur SWITCH-CASE yang telah dibuat ke dalam bentuk IF-ELSE IF-ELSE.
Jawaban:Sudah Selesai

Commit dan push hasil modifikasi Anda ke Github dengan pesan “Modifikasi Percobaan 2”
Jawaban:Sudah

Soal Percobaan 3

1.Apa yang terjadi jika mahasiswa menjawab "No" pada pertanyaan bebas kompen? Mengapa demikian?
Jawaban:Jika user menjawab "No", maka program akan menampilkan pesan: "Anda tidak dapat mengikuti ujian skripsi karena belum bebas kompen." Karena syarat utama untuk dapat mengikuti ujian adalah harus bebas kompen.

2.Jelaskan maksud dari potongan kode berikut!
Jawaban:Mengecek apakah input dari user sama dengan "ya" tanpa membedakan huruf besar atau kecil (misalnya "YA", "Ya", "ya" semuanya dianggap sama). Jika hasilnya true, maka program akan lanjut memeriksa syarat berikutnya (jumlah log bimbingan).

3.Bagaimana alur pemeriksaan syarat mahasiswa dari awal sampai akhir? Jelaskan secara runtut untuk semua kondisi!
Jawaban:Program meminta input apakah mahasiswa bebas kompen. Jika tidak bebas kompen → langsung ditolak ikut ujian. Jika bebas kompen → lanjut memeriksa jumlah log bimbingan Pembimbing 1 dan 2. Jika kedua log bimbingan ≥ 8 → diperbolehkan ikut ujian. Jika salah satu log bimbingan < 8 → belum memenuhi syarat. Program menampilkan hasil akhir sesuai kondisi.

Pseuducode Latihan Pemilihan Soal 1 Sistem perpustakaan kampus memberikan izin masuk dengan dua syarat: • Jika mahasiswa membawa kartu mahasiswa, atau sudah melakukan registrasi online, maka boleh masuk. • Jika tidak memenuhi salah satu dari dua syarat tersebut, maka ditolak masuk. Buatlah flowchart dan pseudocode untuk menyelesaikan masalah tersebut!

Start Deklarasi variabel: kartuMahasiswa : boolean registrasiOnline : boolean

"Apakah membawa kartu mahasiswa? (true/false): "
Input kartuMahasiswa

"Apakah sudah melakukan registrasi online? (true/false): "
Input registrasiOnline

Jika (kartuMahasiswa == true) atau (registrasiOnline == true) maka
    Tampilkan "Izin masuk diberikan"
Jika false
    Tampilkan "Izin masuk ditolak"
End

Soal 2 Di kampus tersedia layanan WiFi gratis yang hanya bisa diakses oleh civitas akademika. Sistem hotspot kampus akan melakukan pengecekan sebagai berikut: • Jika jenis pengguna adalah dosen, maka tampilkan “Akses WiFi diberikan (dosen)”. • Jika jenis pengguna adalah mahasiswa, maka sistem akan memeriksa jumlah SKS yang diambil: o Jika SKS ≥ 12, maka tampilkan “Akses WiFi diberikan (mahasiswa aktif)”. o Jika SKS < 12, maka tampilkan “Akses ditolak, SKS kurang dari 12”. • Jika bukan mahasiswa maupun dosen, maka tampilkan “Akses ditolak”. Buatlah flowchart dan pseudocode untuk menyelesaikan masalah tersebut!

Start Deklarasi variabel: jenisPengguna : string sks : integer
"Masukkan jenis pengguna (dosen/mahasiswa/lainnya): "
Input jenisPengguna

Jika jenisPengguna = "dosen" maka
    Tampilkan "Akses WiFi diberikan (dosen)"
Jika tidak, jika jenisPengguna = "mahasiswa" maka
    Tampilkan "Masukkan jumlah SKS yang diambil: "
    Input sks
    Jika sks >= 12 maka
        Tampilkan "Akses WiFi diberikan (mahasiswa aktif)"
    Jika tidak
        Tampilkan "Akses ditolak, SKS kurang dari 12"
Jika tidak
    Tampilkan "Akses ditolak"
End

