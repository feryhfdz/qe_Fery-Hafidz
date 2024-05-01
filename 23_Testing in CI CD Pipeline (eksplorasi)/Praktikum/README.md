# (23) Testing in CI CD Pipeline

## Continuous Integration
    Continuous Integration adalah praktik mengintegrasikan kode ke dalam repositori bersama dan membangun/menguji setiap perubahan secara otomatis, sedini mungkin - biasanya beberapa kali sehari.

## Continuous Delivery/Deployment

**Continuous Delivery** menambahkan bahwa perangkat lunak dapat dirilis ke produksi kapan saja, sering kali dengan secara otomatis mendorong perubahan ke sistem pementasan.

**Continuous Deployment** melangkah lebih jauh dan mendorong perubahan ke produksi secara otomatis.

## What Make for Good CI

1. Tahapan yang Terpisah (Decoupled Stages)

Setiap langkah dalam CI harus melakukan satu tugas yang fokus. Hal ini memungkinkan alur kerja yang lebih mudah dipahami, diubah, dan dipelihara.

2. Dapat Diulang (Repeatable)

Proses CI harus dapat diulang secara konsisten dan otomatis. Hal ini berarti bahwa CI harus dikonfigurasi dengan cara yang sama untuk semua pengembang dan di semua lingkungan.

3. Gagal dengan Cepat (Fail Fast)

CI harus gagal pada tanda pertama masalah. Hal ini memungkinkan pengembang untuk mengidentifikasi dan memperbaiki bug lebih cepat, sebelum mereka menyebabkan masalah yang lebih besar.

## What Make for Good CD

1. Desain dengan mempertimbangkan sistem. 

CD harus dirancang dengan mempertimbangkan keseluruhan sistem, termasuk aplikasi, infrastruktur, konfigurasi, dan data. Hal ini untuk memastikan bahwa CD dapat diintegrasikan dengan mulus ke dalam sistem dan berfungsi dengan baik.

2. Pipelines. 

CD harus menggunakan pipa untuk mengotomatiskan proses penerapan. Pipa ini harus dapat diandalkan, efisien, dan mudah digunakan.

3. Versi global yang unik. 

CD harus menggunakan versi global yang unik untuk setiap penerapan. Hal ini untuk memastikan bahwa setiap penerapan adalah unik dan tidak berkonflik dengan penerapan lain.

# Components of GitHub Actions
1. Workflows -> configurable automated process that will run one or more jobs
2. Jobs -> specific activity in a repository that trigger a workflow run
3. Actions -> Costum application for the Github Actions platform that performs a complex but frequently repeated task
4. Events -> set of steps in a workflow that execute on the same runner
5. Runner -> server that run your workflow when they're triggered