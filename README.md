# 😶‍🌫️ Sistem Manajemen Jasa Cuci Sepatu

## 📌 Deskripsi Singkat
**Sistem Manajemen Jasa Cuci Sepatu** merupakan program berbasis Java yang digunakan untuk membantu mengelola data pelanggan, sepatu, dan transaksi jasa cuci sepatu.

Program ini dikembangkan sebagai Mini Project 2 dengan menerapkan konsep Pemrograman Berorientasi Objek serta struktur MVC. Program dilengkapi dengan validasi input, ID otomatis, pengelolaan status transaksi, dan fitur cetak struk.


## 🎯 Tujuan Program

Program ini dibuat untuk:

- Mempermudah pengelolaan data pelanggan dan sepatu.
- Mencatat dan mengelola transaksi jasa cuci sepatu.
- Mengelola status proses pencucian mulai dari Menunggu hingga Diambil.
- Mempermudah pencarian, perubahan, dan penghapusan data transaksi.
- Menghasilkan ID transaksi, pelanggan, dan sepatu secara otomatis.
- Menyediakan fitur cetak struk setelah transaksi selesai dan berstatus Diambil.
- Menerapkan konsep Pemrograman Berorientasi Objek seperti encapsulation, inheritance, dan polymorphism.
- Menerapkan struktur MVC agar program lebih terorganisir.


## ✨ Fitur Program

Program memiliki beberapa fitur utama, yaitu:

- **Tambah Data** untuk menambahkan transaksi baru.
- **Lihat Data** untuk menampilkan seluruh transaksi.
- **Ubah Status** untuk mengubah status proses pencucian.
- **Hapus Data** untuk menghapus transaksi yang masih dapat dihapus.
- **Cari Data** untuk mencari transaksi berdasarkan ID.
- **Cetak Struk** untuk mencetak informasi transaksi yang sudah berstatus Diambil.
- **ID Otomatis** untuk transaksi, pelanggan, dan sepatu.
- **Tanggal Otomatis** berdasarkan tanggal transaksi dibuat.
- **Input Validation** untuk mencegah input yang tidak sesuai.
- **Dummy Data** agar data dapat langsung ditampilkan saat program dijalankan.
- **Loading Animation** pada beberapa proses dalam program.

## ✅ Input Validation

Program memiliki validasi input untuk mencegah kesalahan saat pengguna memasukkan data.

Beberapa validasi yang diterapkan:

-Input tidak boleh kosong.
-Nama minimal 3 karakter.
-Nama hanya boleh menggunakan huruf dan spasi.
-Nomor telepon hanya boleh menggunakan angka.
-Nomor telepon harus terdiri dari 10-13 digit.
-Input tertentu memiliki batas minimal dan maksimal karakter.
-Pilihan menu harus sesuai dengan pilihan yang tersedia.
-Pilihan jenis sepatu harus sesuai dengan menu.
-Pilihan layanan harus sesuai dengan menu.
-Pilihan status transaksi harus sesuai dengan menu.
-Input angka akan divalidasi agar tidak menyebabkan program error.

## 📸 Dokumentasi Program

### 1. Tambah Data
Menu Tambah Data digunakan untuk memasukkan data pelanggan, sepatu, dan transaksi baru. ID transaksi, ID pelanggan, dan ID sepatu dibuat secara otomatis oleh sistem. Tanggal transaksi juga dibuat secara otomatis berdasarkan tanggal saat data ditambahkan.

<img width="376" height="465" alt="image" src="https://github.com/user-attachments/assets/470e866e-2f3a-40a2-8999-2e20d22cc3fe" />

### 2. Lihat Data

Menu Lihat Data digunakan untuk menampilkan seluruh transaksi yang tersimpan dalam program.

Program memiliki **dummy data** yang sudah disediakan sejak awal sehingga ketika program pertama kali dijalankan, pengguna dapat langsung melihat data transaksi tanpa harus menambahkan data terlebih dahulu.

Data yang ditampilkan meliputi ID transaksi, tanggal, informasi pelanggan, informasi sepatu, jenis sepatu, layanan, harga, dan status transaksi.

<img width="417" height="632" alt="image" src="https://github.com/user-attachments/assets/67671d56-9a6d-47b9-b652-1325c49452c5" />

### 3. Ubah Status Transaksi

Menu Ubah Status Transaksi digunakan untuk mengubah status proses pencucian sepatu. Pengguna memasukkan ID transaksi yang ingin diubah, kemudian memilih status baru.

Status yang tersedia adalah **Menunggu, Diproses, Selesai, dan Diambil**. Jika transaksi sudah berstatus **Diambil**, status tersebut tidak dapat diubah lagi.

<img width="467" height="587" alt="image" src="https://github.com/user-attachments/assets/e1fcb7c9-0a82-43c6-b860-a345dcb1c054" />

### 4. Hapus Data

Menu Hapus Data digunakan untuk menghapus transaksi berdasarkan ID transaksi. Sebelum transaksi dihapus, sistem menampilkan data yang dipilih dan meminta konfirmasi pengguna.

Transaksi yang sudah berstatus **Diambil** tidak dapat dihapus karena transaksi tersebut dianggap sudah selesai dan telah diambil oleh pelanggan.

<img width="305" height="487" alt="image" src="https://github.com/user-attachments/assets/0b993859-eb56-4707-b3a1-f232763ab9ca" />

### 5. Cari Data

Menu Cari Data digunakan untuk mencari transaksi tertentu berdasarkan ID transaksi. Jika ID ditemukan, sistem akan menampilkan informasi lengkap dari transaksi tersebut.

Jika ID yang dimasukkan tidak ditemukan, sistem akan memberikan informasi bahwa data tidak tersedia.

<img width="342" height="385" alt="image" src="https://github.com/user-attachments/assets/f0fd17af-9381-4016-bebc-c95388b92a45" />

### 6. Cetak Struk

Menu Cetak Struk digunakan untuk menampilkan informasi transaksi dalam bentuk struk sederhana. Informasi yang ditampilkan meliputi ID transaksi, tanggal, nama pelanggan, nomor telepon, sepatu, warna, layanan, harga, dan status transaksi.

Fitur cetak struk hanya dapat digunakan apabila status transaksi sudah **Diambil**. Jika transaksi belum berstatus Diambil, sistem akan menolak proses cetak struk dan menampilkan status transaksi saat ini.

<img width="437" height="428" alt="image" src="https://github.com/user-attachments/assets/1b717ccf-b545-45e6-beab-abcb98eb0ec7" />

### 7. Keluar

Menu Keluar digunakan untuk mengakhiri penggunaan program. Ketika pengguna memilih menu ini, sistem akan menjalankan loading animation sederhana kemudian menampilkan pesan bahwa program telah ditutup.

<img width="433" height="407" alt="image" src="https://github.com/user-attachments/assets/94958d14-6862-4548-a1b8-7e5037f95b25" />

## 🔐 Penerapan Encapsulation
Encapsulation diterapkan pada class yang terdapat di package Model, seperti Pelanggan, Sepatu, dan Transaksi.

Atribut pada class menggunakan access modifier private.

Contohnya pada class Pelanggan:
```
private String nama;
private String noTelepon;
private String alamat;
```
Karena menggunakan private, atribut tidak dapat diakses secara langsung dari luar class.

Untuk mengakses dan mengubah data digunakan getter dan setter.

Contohnya:
```
public String getNama() {
    return nama;
}

public void setNama(String nama) {
    this.nama = nama;
}
```
Penerapan encapsulation juga terdapat pada class Sepatu dan Transaksi.

Dengan penerapan ini, data di dalam object menjadi lebih terkontrol.

## 🧬 Penerapan Inheritance
Inheritance diterapkan pada class Sepatu sebagai superclass dan SepatuSneakers serta SepatuBoot sebagai subclass.
Class SepatuSneakers dan SepatuBoot menggunakan extends untuk mewarisi atribut dan method dari class Sepatu.

Contohnya:
```
public class SepatuSneakers extends Sepatu
```
dan 
```
public class SepatuBoot extends Sepatu
```
Dengan inheritance tersebut, kedua subclass dapat menggunakan atribut dan method yang berasal dari class Sepatu.

### Nilai Tambah
## 🔄 Penerapan Polymorphism
Polymorphism diterapkan melalui method overriding pada method tampilkanJenis().

Pada class Sepatu terdapat method:
```
public void tampilkanJenis() {
    System.out.println("Jenis Sepatu : Umum");
}
```
Kemudian method tersebut dioverride pada SepatuSneakers:
```
@Override
public void tampilkanJenis() {
    System.out.println("Jenis Sepatu : Sneakers");
}
```
Sedangkan pada SepatuBoot:
```
@Override
public void tampilkanJenis() {
    System.out.println("Jenis Sepatu : Boots");
}
```
Dengan demikian, method yang sama dapat menghasilkan output yang berbeda sesuai dengan object sepatu yang digunakan.

## Penerapan MVC

Program menggunakan struktur **MVC (Model, View, Controller)** untuk memisahkan bagian data, tampilan, dan proses pengolahan data agar program lebih terorganisir.
# Model digunakan untuk menyimpan class dan data yang digunakan dalam program. Package ini berisi Pelanggan, Sepatu, SepatuSneakers, SepatuBoot, dan Transaksi.

# View digunakan untuk mengatur tampilan menu dan interaksi dengan pengguna. Pada program ini, bagian View terdapat pada class Menu.java.

# Controller digunakan untuk mengatur proses pengolahan data transaksi, seperti menambahkan, mencari, dan menghapus transaksi. Pada program ini, bagian Controller terdapat pada TransaksiController.java.

Dengan menggunakan struktur MVC, setiap bagian program memiliki tugas masing-masing sehingga kode menjadi lebih rapi dan mudah dikelola.
## 📸 Struktur Package
# Model

<img width="193" height="136" alt="image" src="https://github.com/user-attachments/assets/319ae0ac-4017-4308-a776-2be30e59c3bd" />

# view

<img width="133" height="47" alt="image" src="https://github.com/user-attachments/assets/730f6751-49a1-4229-8416-cc5298fc2367" />

# Controller

<img width="247" height="47" alt="image" src="https://github.com/user-attachments/assets/541e0716-aa09-49ca-b819-7bedecce42ea" />









