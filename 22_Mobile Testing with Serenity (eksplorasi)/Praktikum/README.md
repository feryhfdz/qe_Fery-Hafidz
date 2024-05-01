# (22) Mobile Testing with Serenity

## Appium
        Appium, sebuah kerangka kerja otomatisasi seluler yang memungkinkan pengguna untuk menjalankan tes otomatisasi pada aplikasi seluler. Appium mendukung berbagai bahasa pemrograman, seperti Java, Python, JavaScript, dan Ruby, dan dapat digunakan untuk menguji aplikasi Android, iOS, dan Windows.

## Cucumber Framework

        Cucumber BDD adalah framework yang mendukung pembuatan tes automasi behavior-driven development (BDD). Framework ini menggunakan sintaks Gherkin dan mendukung berbagai bahasa pemrograman seperti Java, Ruby, Javascript, Python, dan lainnya. Cucumber BDD memiliki fitur dan dukungan yang hebat dengan IDE Intellij IDEA.

### The WebdriverWait Object

        Objek WebdriverWait digunakan untuk mengatur waktu tunggu hingga elemen memenuhi kondisi. Contoh: tunggu hingga elemen terlihat, tunggu hingga elemen menghilang, dll.

Objek ini merupakan bagian dari Explicit wait (yang akan diterapkan untuk elemen Android tertentu saja)

Konstruktornya memiliki 3 parameter:

* Parameter pertama untuk objek Android Driver.
* Parameter kedua untuk timeout (waktu maksimum yang kita tunggu agar elemen memenuhi kondisi).
* Parameter ketiga untuk polling time (periksa setiap x milidetik).

Objek ExpectedConditions menyimpan daftar kondisi yang didukung oleh Appium.

```
WebDriverWait wait = new WebDriverWait(driver, 30, 1000);
AndroidElement element = (AndroidElement) driver.findElement(By.id("splash_activity_title"));

wait.until(ExpectedConditions.presenceOfElementLocated(By.id("splash_activity_title")));
```