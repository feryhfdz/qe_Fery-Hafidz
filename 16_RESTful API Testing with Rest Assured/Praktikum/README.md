
# (16)RESTful API Testing with Rest Assured

Konsep API (Application Programming Interface) yang dianalogikan dengan proses pemesanan makanan di restoran. Berikut adalah penjelasannya:

- Pengguna (Mobile App): Pengguna mewakili aplikasi seluler yang ingin memesan makanan dari restoran.
- Waiter (API): Waiter mewakili API yang bertindak sebagai perantara antara pengguna dan dapur.
- Dapur (Application): Dapur mewakili aplikasi yang menyediakan makanan yang dipesan oleh pengguna.

__Proses Pemesanan__

1. Pengguna memilih makanan yang ingin dipesan di aplikasi seluler.
2. Aplikasi seluler mengirimkan permintaan ke API untuk memesan makanan.
3. API meneruskan permintaan pengguna ke dapur.
4. Dapur menyiapkan makanan yang dipesan.
5. Dapur mengirimkan pemberitahuan ke API bahwa makanan sudah siap.
6. API mengirimkan pemberitahuan ke aplikasi seluler bahwa makanan sudah siap.
7. Pengguna menerima pemberitahuan di aplikasi seluler bahwa makanan sudah siap.
8. Pengguna dapat mengambil makanan di restoran.

## Fundamental API Integration

1. Buat Aplikasi Mobile

Langkah pertama adalah membuat aplikasi mobile yang akan menggunakan API. Aplikasi ini bisa dibuat dengan bahasa pemrograman atau framework apapun yang sesuai dengan platform mobile (Android/iOS).  Aplikasi perlu dirancang untuk dapat mengirimkan permintaan ke server API dan memproses respon yang diterima.

2. Buat Server API

Langkah kedua adalah membuat server API yang menyediakan data atau fungsi yang dibutuhkan aplikasi mobile. Server API bisa dibuat dengan bahasa pemrograman atau framework apapun yang sesuai dengan platform server. Server perlu dirancang untuk menerima permintaan dari aplikasi mobile dan memberikan respon yang berisi data atau fungsi yang dibutuhkan.

3. Buat Tes API

Langkah ketiga adalah membuat tes API. Tes ini digunakan untuk memastikan server API berfungsi dengan baik. Tes API bisa ditulis dengan framework testing apapun yang sesuai dengan bahasa pemrograman atau framework yang digunakan untuk membangun server API. Tes ini harus mencakup seluruh fungsi yang disediakan oleh server API.

4. Deploy Server API

Langkah keempat adalah deploy server API. Ini adalah proses membuat server API tersebut bisa diakses oleh aplikasi mobile. Server API dapat dideploy ke platform cloud, server lokal, atau kombinasi keduanya. Proses deploy akan tergantung pada platform yang digunakan.

5. Tes Aplikasi Mobile

Langkah terakhir adalah menguji aplikasi mobile.  Ini untuk memastikan aplikasi mobile berfungsi dengan baik dan dapat mengakses data atau fungsi dari server API. Aplikasi mobile dapat diuji dengan framework testing apapun yang sesuai dengan bahasa pemrograman atau framework yang digunakan untuk mengembangkan aplikasi. Tes ini harus mencakup seluruh fungsi yang disediakan oleh aplikasi.

Setelah kelima langkah tersebut selesai, integrasi API pun selesai. Aplikasi mobile dapat mengakses data atau fungsi dari server API, dan server API dapat menyediakan data atau fungsi yang dibutuhkan oleh aplikasi.

## The Practical Test Pyramid

- Tes Unit (Unit Test): Menguji bagian terkecil yang dapat diuji dari suatu aplikasi melalui metode.
- Tes Komponen (Component Test): Menguji satu modul atau subsistem tertentu melalui API.
- Tes Integrasi (Integration Test): Menguji interaksi antara dua modul atau subsistem melalui kontrak API.
- Tes UI (UI Test): Menguji interaksi antara pengguna dengan aplikasi melalui antarmuka pengguna.
