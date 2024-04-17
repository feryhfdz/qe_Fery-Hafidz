
# (19)Fundamental Performance Test

1. ### Apa Itu Performance Test?
Performance test adalah teknik pengujian non-fungsional untuk menentukan parameter sistem dalam hal responsif dan stabilitas di bawah berbagai beban (load) kerja. Pengujian ini mengukur kualitas atribut dari sistem seperti stabilitas, ketahanan (reliability) dan penggunaan sumber daya.

### Apa Yang Perlu Diperhatikan Dari Performance Test?

Dalam melakukan performance test, biasanya yang menjadi perhatian utama adalah throughput dan response data-nya. Throughput mengacu pada jumlah data yang dapat diproses oleh sistem dalam waktu tertentu, sedangkan response time adalah waktu yang dibutuhkan oleh sistem untuk memproses dan merespons permintaan.

2. Metode Perfomance Test
* Smoke Testing

Dilakukan untuk verify script yang sudah dibuat, apakah sistem tersebut dapat handle minimal load, tanpa masalah sama sekali. Biasanya hanya 1-2 VUs.
* Load Testing

Load testing adalah pengujian yang dilakukan untuk memahami perilaku sistem dalam keadaan beban tertentu. Hasil dari load test digunakan untuk mengukur kepentingan bisnis saat transaksi yang kritis dengan memonitor dampak terhadap database, application server atau pendukung lainnya.

Sederhananya, load testing menentukan kelakuan sistem pada saat kondisi normal dan puncak. Idealnya, kita mengetahui jumlah traffic yang ada di prod sebagai nilai di load test.

* Stress Testing

Metode ini untuk dilakukan untuk mengamati kemampuan dan kestabilan sistem pada saat kondisi ekstrem.
Dilakukan bertahap menuju load normal, puncak, dan melebihinya, lalu turun untuk melihat proses recovery.

* Spike Testing

Spike testing mirip dengan stress testing, tetapi dengan beberapa perbedaan utama. Pada spike testing, kenaikan beban trafik dilakukan secara langsung menuju puncak, sedangkan pada stress testing, kenaikan beban trafik dilakukan secara bertahap. Pada spike testing, tidak ada waktu bagi sistem untuk melakukan scale-out, sedangkan pada stress testing, sistem diberi waktu untuk melakukan scale-out.

Salah satu contoh penggunaan spike testing adalah pada saat flash sale di suatu e-commerce. Saat flash sale berlangsung, banyak pengguna akan mengunjungi halaman flash sale secara bersamaan, sehingga trafik akan melonjak secara tiba-tiba. Spike testing dapat digunakan untuk mengetahui bagaimana sistem e-commerce akan merespon lonjakan trafik ini.

* Soak Testing

Soak testing adalah jenis pengujian kinerja yang digunakan untuk mengetahui keandalan sistem ketika dalam tekanan di bawah puncak dalam jangka panjang (>=1 jam). Tujuannya adalah untuk mendeteksi bug pada race condition, memory leaks, db connection, dan sebagainya.

3. Istilah Penting dalam Performance Test

* System Under Test (SUT): Sebutan untuk sistem yang sedang dilakukan test.
* Load Generator: Sebutan untuk server yang digunakan untuk membuat request.
* Throughput: Satuan kerja dalam satuan waktu. Misalnya Request per second (RPS) dan Request per minute (RPM).
* Performance Threshold: Target maksimal nilai yang diperbolehkan, misalnya response time 2 detik, Max CPU usage 70% dan sebagainya.
* Saturation: Kondisi dimana SUT atau Load Generator sudah dalam kondisi maksimum dalam merespon atau mengenerate.
* Virtual Users: Simulasi dari users yang melakukan pengujian, dapat melakukan satu atau lebih requests dalam satu iterasi.
* Response Time: Lama waktu pengiriman request hingga menerima response.