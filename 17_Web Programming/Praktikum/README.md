
# (17)Web Programming

1. Frontend dalam dunia pengembangan web bisa diartikan sebagai "tampilan depan"  - bagian situs web yang dilihat dan diinteraksikan langsung oleh pengguna. Ini termasuk elemen visual seperti menu, tombol, formulir, animasi, gambar, dan teks.

2. HTML (Hypertext Markup Language) adalah sebuah standar yang digunakan secara luas untuk menampilkan halaman web.

## Kegunaan HTML
* Membuat struktur dari halaman website.
* Mengatur tampilan dan isi dari halaman web.
* Membuat tabel dengan tag HTML table.
* Membuat form HTML.
* Mempublikasikan halaman website secara online.

`<! DOCTYPE html>` mendefinisikan dokumen ini sebagai HTML5

`<html>` elemen root dari halaman HTML

`<head>` berisi informasi meta tentang dokumen

`<title>` menentukan judul untuk dokumen

`<body>` berisi konten halaman yang terlihat

3. Menambahlan file CSS

3 cara menambahkan file CSS ke dalam HTML:
* External CSS
* Internal CSS
* Inline CSS

### External CSS
`<link rel="stylesheet" href="main.css">`

Syntax ini disisipkan ke dalam tag `<head>` pada HTML. Ekstensi file CSS adalah `.css`

### Internal CSS
```html
<style>
body {
    background-color: #19355f;
}

h1 {
    color: #f47523;
    margin-left: 40px;
}
</style>
```
Syntax ini dapat digunakan di dalam satu file HTML. Didefinisikan di dalam elemen `<style>`, di dalam bagian `<head>` atau di dalam bagian `<body>`.

### Inline CSS
``` html
<h1 style="color: #19355f;">Hello World</h1>
```
* Syntax ini dapat digunakan untuk elemen tunggal pada HTML.
* Diprioritaskan untuk menerapkan style yang unik.
