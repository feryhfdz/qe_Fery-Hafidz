
# (21) Post Processor & Understanding Jmeter Results

1. Apa itu Post Processors?

Post processors adalah elemen test plan yang digunakan untuk melakukan tindakan tertentu setelah pemrosesan permintaan sampler. Post processors biasanya digunakan untuk mengekstrak nilai tertentu dari respons permintaan sampler.

2. JSON Path adalah bahasa kueri untuk JSON, mirip dengan XPath untuk XML. JSON Path digunakan untuk mengekstrak data dari struktur JSON. JSON Path menggunakan notasi khusus untuk mewakili node dan koneksi mereka ke node yang berdekatan dalam jalur JSON Path.

Beberapa ekspresi JSON Path yang umum digunakan:

- $: Elemen root
- []: Operator anak (array)
- .: Operator anak (objek)
- ..: Turunan rekursif (langsung ke objek)
- *: Wildcard (semua hal)
- [start:end]: Operator irisan array

### Quick Analyze   
| Case | Response Time | Throughput | Kesimpulan |
|---|---|---|---|
| 1 | Rendah | Rendah | Belum pernah terjadi |
| 2 | Rendah | Tinggi | Ketika laporan menunjukkan bahwa waktu respons rendah dan Throughput sangat tinggi. Artinya Server bekerja dengan baik. Tes kinerja lulus atau Anda dapat mempertimbangkan untuk menambah beban dan terus menemukan batasan Server |
| 3 | Tinggi | Rendah | Ketika kita menemukan skenario di mana waktu respons untuk permintaan tinggi tetapi Throughput jauh lebih rendah. Ini menandakan bahwa Server tidak cukup mampu untuk mempertahankan/mengeksekusi permintaan. Yang meminta penyetelan di sisi server. |
| 4 | Tinggi | Tinggi | Ketika Waktu Respons tinggi tetapi Throughput dibandingkan dengan Waktu Respons jauh lebih tinggi. Ini menyiratkan bahwa permintaan tersebut memakan lebih banyak waktu karena kesalahan dalam aplikasi, mungkin skripnya tidak cukup baik. Kita tidak boleh menyalahkan waktu pemrosesan server untuk ini. Sekarang saatnya untuk mempertimbangkan faktor-faktor lain dan menyetelnya untuk membuat kinerja aplikasi lebih baik. |
