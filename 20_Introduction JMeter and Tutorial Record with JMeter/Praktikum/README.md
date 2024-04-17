
# (20) Introduction JMeter and Tutorial Record with JMeter

1. Kenapa menggunakan JMeter?

Apache JMeter adalah perangkat lunak sumber terbuka, aplikasi desktop Java 100% murni, yang dirancang untuk memuat uji perilaku fungsional dan mengukur kinerja situs web.
Awalnya dirancang untuk aplikasi web pengujian beban tetapi sejak itu diperluas ke fungsi pengujian lainnya.

2. Komponen pada JMeter script

* Test Plan

Rencana besar tes yang akan dilakukan(parent)

* Thread Groups

Kumpulan thread yang menjalankan skenario yang sama

* Samplers

Sebutan untuk request yang dikirim ke server

* Config Elements

Elemen yang digunakan untuk konfigurasi atau modifikasi sampler request yang dikirim ke server

* Listeners

Perekam data yang dihasilkan dari tes

* Timers

Fitur ini akan jalan duluan sebelum semua fitur yang lain berjalan

* Assertions

Seperti assert pada API/Web/Testing, merupakan kriteria tambahan apakah pass/tidak

* Pre-post processors

Fitur yang memproses response data sebelum/sesudah tes

3. Langkah-langkah Merekam Skrip dengan JMeter:
-

1. Buka terminal
2. Buka JMeter
3. Arahkan ke folder bin
4. Jalankan JMeter
* Gunakan perintah ./jmeter.sh untuk macOS
* Gunakan perintah jmeter untuk Windows
* Atau, klik file ApacheJMeter.jar dari direktori Anda
5. Rekam skrip
* Klik tombol Record di bilah alat JMeter
* Jelajahi situs web yang ingin Anda uji
* Klik tombol Stop saat Anda selesai merekam
6. Simpan skrip
* Klik tombol Save di bilah alat JMeter
* Beri nama skrip dan pilih lokasi penyimpanan
7. Jalankan skrip
* Klik tombol Run di bilah alat JMeter
* Pilih skrip yang ingin Anda jalankan
* Klik tombol Start

