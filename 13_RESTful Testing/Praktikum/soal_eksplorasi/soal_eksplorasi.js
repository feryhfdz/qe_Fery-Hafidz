//GET-01 Mendapatkan semua data post

//Memastikan mendapatkan semua data post dengan kode status 200
pm.test("Status code harus 200", () => {
  pm.response.to.have.status(200);
});

//Memastikan respons tidak kosong
pm.test("Response Tidak Kosong", function () {
  pm.response.to.be.ok;
  pm.response.to.have.jsonBody();

  var jsonData = pm.response.json();
  pm.expect(jsonData.length).to.be.above(0);
});

//Mengirimkan parameter yang tidak valid atau tidak sesuai dengan yang diharapkan.
pm.test("Parameter Salah", function () {
  pm.response.to.have.status(400);
});

//Meminta data dengan parameter yang valid tetapi tidak ada data yang cocok.
pm.test("Data Tidak Ditemukan", function () {
  pm.response.to.have.status(200); // Memastikan bahwa status code adalah 200 OK
  pm.response.to.have.jsonBody(); // Memastikan bahwa response body adalah JSON

  var jsonData = pm.response.json();
  pm.expect(jsonData.length).to.equal(0); // Memastikan bahwa response body adalah array kosong
});

//========================================================================================

//POST-02

//Memastikan data berhasil ditambahkan
pm.test("Status code is 201 Created", function () {
  pm.response.to.have.status(201);
});

pm.test("Response body has correct title", function () {
  var jsonData = pm.response.json();
  pm.expect(jsonData.title).to.eql("Test Post");
});

pm.test("Response body has correct body content", function () {
  var jsonData = pm.response.json();
  pm.expect(jsonData.body).to.eql("Ini adalah konten dari test post");
});

pm.test("Response body has correct userId", function () {
  var jsonData = pm.response.json();
  pm.expect(jsonData.userId).to.eql(1);
});

//Mengirimkan request POST tanpa menyertakan salah satu atau lebih dari field yang diperlukan.
pm.test("Status code is 201 Created", function () {
  pm.response.to.have.status(201);
});

pm.test("Response body has correct title", function () {
  var jsonData = pm.response.json();
  pm.expect(jsonData.title).to.eql("Test Post Without Body");
});

pm.test("Response body has userId", function () {
  var jsonData = pm.response.json();
  pm.expect(jsonData.userId).to.eql(1);
});

//Mengirimkan request POST dengan format data yang tidak valid (misalnya, body tidak dalam format JSON).
pm.test("Status code is 400 Bad Request", function () {
  pm.response.to.have.status(400);
});

pm.test("Response body contains error message", function () {
  var jsonData = pm.response.json();
  pm.expect(jsonData).to.have.property("error");
});

//============================================================================================================

//GET-03 Mendapatkan data post berdasarkan ID

//Memastikan API merespons dengan benar ketika ID post yang valid diberikan.
pm.test("Status code is 200 OK", function () {
  pm.response.to.have.status(200);
});

pm.test("Response body has correct post ID", function () {
  var jsonData = pm.response.json();
  pm.expect(jsonData.id).to.eql(1);
});

pm.test("Response body has title", function () {
  var jsonData = pm.response.json();
  pm.expect(jsonData).to.have.property("title");
});

pm.test("Response body has body content", function () {
  var jsonData = pm.response.json();
  pm.expect(jsonData).to.have.property("body");
});

// Memastikan API memberikan respons yang tepat saat ID post yang tidak valid diberikan.
pm.test("Status code is 404 Not Found", function () {
  pm.response.to.have.status(404);
});

pm.test("Response body has error message", function () {
  var jsonData = pm.response.json();
  pm.expect(jsonData).to.have.property("error");
});

//Memastikan bahwa API memberikan respons yang benar saat ID post diberikan dalam format yang tidak valid.
pm.test("Status code is 404 Not Found or 400 Bad Request", function () {
  pm.response.to.have.status(404).or.to.have.status(400);
});

pm.test("Response body contains error message", function () {
  var jsonData = pm.response.json();
  pm.expect(jsonData).to.have.property("error");
});

//==============================================================================================================

//PUT-04

//Memastikan bahwa data post berhasil diubah ketika request PUT berhasil.
pm.test("Data berhasil diubah", function () {
  pm.response.to.have.status(200);
  pm.expect(pm.response.json().title).to.eql("Updated Title");
  pm.expect(pm.response.json().body).to.eql("Updated Body");
});

//Memastikan bahwa API memberikan respons yang sesuai ketika mencoba mengubah data post dengan ID yang tidak ada dalam database.
pm.test("Status code is 404", function () {
  pm.response.to.have.status(404);
});

pm.test("Response body contains error message", function () {
  pm.expect(pm.response.json().error).to.eql("Post not found");
});

//================================================================================================================

//DELETE-05

//Menghapus data post dengan ID yang valid.
pm.test("Status code is 200", function () {
  pm.response.to.have.status(200);
});

pm.test("Response body contains success message", function () {
  pm.expect(pm.response.text()).to.eql("{}");
});

//Menghapus data post dengan ID yang tidak ada.
pm.test("Status code is 404", function () {
  pm.response.to.have.status(404);
});

pm.test("Response body contains error message", function () {
  pm.expect(pm.response.json().error).to.eql("Post not found");
});

//Menghapus data post dengan ID yang tidak valid (bukan angka).
pm.test("Status code is 404", function () {
  pm.response.to.have.status(404);
});

pm.test("Response body contains error message", function () {
  pm.expect(pm.response.json().error).to.eql("Invalid ID format");
});
