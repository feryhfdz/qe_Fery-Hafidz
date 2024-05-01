# (18)Review Web UI Testing with Serenity

        Serenity BDD adalah kerangka kerja BDD open source yang membantu membuat tes penerimaan otomatis yang terstruktur dengan baik dan mudah dipelihara. Ini terdiri dari Requirements, Tests, Steps, Pages, Reports.

## Define Requirements

**Mulai dengan persyaratan yang perlu Anda implementasikan.** Persyaratan ini sering diekspresikan sebagai "cerita" pengguna dengan kriteria penerimaan yang membantu memperjelas persyaratan.

**Contoh Persyaratan**

* Sebagai pembeli, saya ingin dapat mencari artikel berdasarkan kata kunci.
* Sebagai penjual, saya ingin dapat menambahkan produk baru ke katalog saya.
* Sebagai administrator, saya ingin dapat melihat semua pesanan yang telah dilakukan.

## Automate Aceeptance Criteria
Contoh penulisan dalam format BDD:

**Feature**: Search by keyword  
In order for buyers to find what they are looking for  
As a seller  
I want buyers to be able to search articles by keywords  

  Scenario: Search for articles by keyword  
    Given I want to buy a wool scarf    
    When I search for 'wool'  
    Then I should see only articles related to 'wool'

## Implement the Test
        Kriteria penerimaan adalah pernyataan yang mendefinisikan apa yang harus dicapai oleh suatu sistem atau fitur agar dianggap berhasil. Kriteria ini penting untuk memastikan bahwa sistem atau fitur memenuhi kebutuhan pengguna dan memenuhi tujuan pengembangan.

```
@Given ("Saya membuka halaman web")
public void GivenloginWebsite() {
    loginSteps.OpenFacebookPage();
}

@When ("Saya memasukkan email dan kata sandi")
public void WhenInputEmailPassword() {
    loginSteps.InputEmailAndPassword();
}

@When ("Saya mengklik tombol login")
public void WhenClickButtonLogin(){
    loginSteps.ClickButtonLogin();
}

@Then ("Saya harus diarahkan ke halaman beranda")
public void ThenVerifyHomepage() {
    Assert.assertTrue(driver.getCurrentUrl().contains("https://www.facebook.com/"));
} 
```

## Report on Test Results
Serenity memberikan laporan rinci tentang hasil tes dan pelaksanaannya, termasuk:

* Narasi untuk setiap tes
* Tangkapan layar untuk setiap langkah dalam ujian
* Hasil pengujian termasuk waktu eksekusi dan pesan kesalahan jika pengujian gagal


