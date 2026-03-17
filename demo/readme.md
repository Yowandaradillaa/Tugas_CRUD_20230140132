TUTORIAL MENGGUNAKAN POSTMAN + LINK API
1. Buka Postman

Klik New Request

2. Pilih Method

GET → ambil data

POST → tambah data

PUT → update data

DELETE → hapus data

3. Masukkan URL (Endpoint API)

   🔹 Ambil semua data
   GET http://localhost:8080/ktp

   🔹 Ambil data berdasarkan ID
   GET http://localhost:8080/ktp/{id}

Contoh:

GET http://localhost:8080/ktp/1

🔹 Tambah data
POST http://localhost:8080/ktp

🔹 Update data
PUT http://localhost:8080/ktp/{id}

Contoh:

PUT http://localhost:8080/ktp/1

🔹 Hapus data
DELETE http://localhost:8080/ktp/{id}

Contoh:

DELETE http://localhost:8080/ktp/1
4. Untuk POST & PUT

Klik tab Body

Pilih raw

Pilih JSON

Masukkan data JSON

Contoh:

{
"nik": "3201010101010001",
"namaLengkap": "Budi Santoso",
"tempatLahir": "Bandung",
"tanggalLahir": "2000-01-01",
"jenisKelamin": "Laki-laki",
"golonganDarah": "O",
"alamat": "Jl. Merdeka",
"rtRw": "001/002",
"desa": "Cibeunying",
"kecamatan": "Cibeunying Kidul",
"agama": "Islam",
"statusPerkawinan": "Belum Kawin",
"pekerjaan": "Mahasiswa",
"kewarganegaraan": "WNI",
"berlakuHingga": "Seumur Hidup"
}
5. Klik "Send"

Lihat response di bagian bawah Postman!

Dokumentasi
1. Post 