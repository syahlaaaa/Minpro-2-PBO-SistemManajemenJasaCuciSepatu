package View;

import Controller.TransaksiController;
import Model.Pelanggan;
import Model.Sepatu;
import Model.SepatuBoot;
import Model.SepatuSneakers;
import Model.Transaksi;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Menu {

    private Scanner input;
    private TransaksiController controller;

    public Menu(TransaksiController controller) {

        this.controller = controller;
        input = new Scanner(System.in);
    }

    public void tampilkanMenu() {

        loading("Menyiapkan sistem");

        int pilihan;

        do {

            System.out.println();
            System.out.println("==========================================");
            System.out.println("       SISTEM MANAJEMEN JASA CUCI SEPATU");
            System.out.println("==========================================");
            System.out.println("1. Tambah Data");
            System.out.println("2. Lihat Data");
            System.out.println("3. Ubah Status Transaksi");
            System.out.println("4. Hapus Data");
            System.out.println("5. Cari Data");
            System.out.println("6. Cetak Struk");
            System.out.println("7. Keluar");
            System.out.println("==========================================");

            pilihan = inputInt("Pilih menu: ");

            switch (pilihan) {

                case 1:
                    tambahData();
                    break;

                case 2:
                    lihatData();
                    break;

                case 3:
                    ubahData();
                    break;

                case 4:
                    hapusData();
                    break;

                case 5:
                    cariData();
                    break;

                case 6:
                    cetakStruk();
                    break;

                case 7:
                    loading("Menutup program");
                    System.out.println(
                            "Terima kasih telah menggunakan sistem."
                    );
                    break;

                default:
                    System.out.println(
                            "Pilihan menu hanya 1 sampai 7."
                    );
            }

        } while (pilihan != 7);
    }

    private void tambahData() {

        System.out.println();
        System.out.println("========== TAMBAH DATA ==========");

        String idTransaksi =
                controller.generateIdTransaksi();

        String idPelanggan =
                controller.generateIdPelanggan();

        String idSepatu =
                controller.generateIdSepatu();

        System.out.println(
                "ID Transaksi : " + idTransaksi
        );

        System.out.println(
                "ID Pelanggan : " + idPelanggan
        );

        String nama =
                inputNama("Nama Pelanggan: ");

        String noTelepon =
                inputTelepon("No. Telepon: ");

        String alamat =
                inputPanjang(
                        "Alamat: ",
                        5,
                        100
                );

        Pelanggan pelanggan =
                new Pelanggan(
                        idPelanggan,
                        nama,
                        noTelepon,
                        alamat
                );
        System.out.println(
                "ID Sepatu : " + idSepatu
        );

        String merek =
                inputPanjang(
                        "Merek Sepatu: ",
                        2,
                        30
                );
        System.out.println("Jenis Sepatu:");
        System.out.println("1. Sneakers");
        System.out.println("2. Boots");

        int pilihanJenis;

        do {

            pilihanJenis =
                    inputInt("Pilih jenis sepatu: ");

            if (pilihanJenis != 1
                    && pilihanJenis != 2) {

                System.out.println(
                        "Pilihan hanya 1 atau 2."
                );
            }

        } while (
                pilihanJenis != 1
                && pilihanJenis != 2
        );

        String warna =
                inputPanjang(
                        "Warna Sepatu: ",
                        3,
                        20
                );

        Sepatu sepatu;

        if (pilihanJenis == 1) {

            sepatu =
                    new SepatuSneakers(
                            idSepatu,
                            merek,
                            warna
                    );

        } else {

            sepatu =
                    new SepatuBoot(
                            idSepatu,
                            merek,
                            warna
                    );
        }
        System.out.println("Jenis Layanan:");
        System.out.println("1. Fast Clean  - Rp20.000");
        System.out.println("2. Deep Clean  - Rp35.000");
        System.out.println("3. Special Care - Rp50.000");

        int pilihanLayanan;

        do {

            pilihanLayanan =
                    inputInt("Pilih layanan: ");

            if (pilihanLayanan < 1
                    || pilihanLayanan > 3) {

                System.out.println(
                        "Pilihan layanan hanya 1 sampai 3."
                );
            }

        } while (
                pilihanLayanan < 1
                || pilihanLayanan > 3
        );

        String jenisLayanan;
        int harga;

        if (pilihanLayanan == 1) {

            jenisLayanan = "Fast Clean";
            harga = 20000;

        } else if (pilihanLayanan == 2) {

            jenisLayanan = "Deep Clean";
            harga = 35000;

        } else {

            jenisLayanan = "Special Care";
            harga = 50000;
        }

        LocalDate tanggalSekarang =
                LocalDate.now();

        DateTimeFormatter formatTanggal =
                DateTimeFormatter.ofPattern(
                        "dd-MM-yyyy"
                );

        String tanggal =
                tanggalSekarang.format(formatTanggal);

        System.out.println(
                "Tanggal Transaksi : " + tanggal
        );

        Transaksi transaksi =
                new Transaksi(
                        idTransaksi,
                        pelanggan,
                        sepatu,
                        jenisLayanan,
                        harga,
                        tanggal,
                        "Menunggu"
                );

        loading("Menyimpan data");

        if (controller.tambah(transaksi)) {

            System.out.println();
            System.out.println(
                    "Data berhasil ditambahkan!"
            );

        } else {

            System.out.println(
                    "Data gagal ditambahkan."
            );
        }
    }

    private void lihatData() {
        System.out.println(
                "========== DATA TRANSAKSI =========="
        );

        if (controller.getDaftarTransaksi().isEmpty()) {

            System.out.println(
                    "Belum ada data transaksi."
            );

        } else {

            for (Transaksi transaksi
                    : controller.getDaftarTransaksi()) {

                transaksi.tampilkanData();

                System.out.println(
                        "------------------------------------"
                );
            }
        }
    }
    private void ubahData() {
        System.out.println(
                "========== UBAH STATUS TRANSAKSI =========="
        );

        String id =
                inputString("Masukkan ID Transaksi: ");

        Transaksi transaksi =
                controller.cari(id);

        if (transaksi == null) {

            System.out.println(
                    "Data tidak ditemukan."
            );

            return;
        }

        if (transaksi.getStatus()
                .equalsIgnoreCase("Diambil")) {

            System.out.println(
                    "Transaksi sudah diambil pelanggan."
            );

            System.out.println(
                    "Status tidak dapat diubah lagi."
            );

            return;
        }

        System.out.println("Data Transaksi:");
        transaksi.tampilkanData();

        System.out.println();
        System.out.println(
                "Status Saat Ini : "
                + transaksi.getStatus()
        );
        System.out.println(
                "Ubah Status Menjadi:"
        );

        System.out.println("1. Menunggu");
        System.out.println("2. Diproses");
        System.out.println("3. Selesai");
        System.out.println("4. Diambil");

        int pilihanStatus;

        do {

            pilihanStatus =
                    inputInt("Pilih status baru: ");

            if (pilihanStatus < 1
                    || pilihanStatus > 4) {

                System.out.println(
                        "Pilihan status hanya 1 sampai 4."
                );
            }

        } while (
                pilihanStatus < 1
                || pilihanStatus > 4
        );

        if (pilihanStatus == 1) {

            transaksi.setStatus("Menunggu");

        } else if (pilihanStatus == 2) {

            transaksi.setStatus("Diproses");

        } else if (pilihanStatus == 3) {

            transaksi.setStatus("Selesai");

        } else {

            transaksi.setStatus("Diambil");
        }

        loading("Mengubah status");

        System.out.println(
                "Status transaksi berhasil diubah menjadi: "
                + transaksi.getStatus()
        );
    }

    private void hapusData() {
        System.out.println(
                "========== HAPUS DATA =========="
        );

        String id =
                inputString(
                        "Masukkan ID Transaksi: "
                );

        Transaksi transaksi =
                controller.cari(id);

        if (transaksi == null) {

            System.out.println(
                    "Data tidak ditemukan."
            );

            return;
        }

        if (transaksi.getStatus()
                .equalsIgnoreCase("Diambil")) {

            System.out.println(
                    "Transaksi sudah diambil dan tidak dapat dihapus."
            );

            return;
        }
        System.out.println(
                "Data yang akan dihapus:"
        );

        transaksi.tampilkanData();
        System.out.println(
                "Apakah yakin ingin menghapus?"
        );

        System.out.println("1. Ya");
        System.out.println("2. Tidak");

        int pilihan;

        do {

            pilihan =
                    inputInt("Pilih: ");

            if (pilihan != 1
                    && pilihan != 2) {

                System.out.println(
                        "Pilih 1 atau 2."
                );
            }

        } while (
                pilihan != 1
                && pilihan != 2
        );

        if (pilihan == 1) {

            loading("Menghapus data");

            controller.hapus(id);

            System.out.println(
                    "Data berhasil dihapus."
            );

        } else {

            System.out.println(
                    "Penghapusan dibatalkan."
            );
        }
    }

    private void cariData() {
        System.out.println(
                "========== CARI DATA =========="
        );

        String id =
                inputString(
                        "Masukkan ID Transaksi: "
                );

        Transaksi transaksi =
                controller.cari(id);

        if (transaksi != null) {

            System.out.println();
            System.out.println(
                    "Data ditemukan:"
            );

            transaksi.tampilkanData();

        } else {

            System.out.println(
                    "Data dengan ID "
                    + id
                    + " tidak ditemukan."
            );
        }
    }

    private void cetakStruk() {
        System.out.println(
                "========== CETAK STRUK =========="
        );

        String id =
                inputString(
                        "Masukkan ID Transaksi: "
                );

        Transaksi transaksi =
                controller.cari(id);

        if (transaksi == null) {

            System.out.println(
                    "Transaksi tidak ditemukan."
            );

            return;
        }
        if (!transaksi.getStatus()
                .equalsIgnoreCase("Diambil")) {

            System.out.println(
                    "Struk belum dapat dicetak."
            );

            System.out.println(
                    "Transaksi harus berstatus Diambil terlebih dahulu."
            );

            System.out.println(
                    "Status saat ini: "
                    + transaksi.getStatus()
            );

            return;
        }
        loading("Menyiapkan struk");

        System.out.println();

        System.out.println(
                "========================================"
        );

        System.out.println(
                "          STRUK CUCI SEPATU"
        );

        System.out.println(
                "========================================"
        );

        System.out.println(
                "ID Transaksi : "
                + transaksi.getIdTransaksi()
        );

        System.out.println(
                "Tanggal      : "
                + transaksi.getTanggal()
        );

        System.out.println(
                "Pelanggan    : "
                + transaksi.getPelanggan().getNama()
        );

        System.out.println(
                "No. Telepon  : "
                + transaksi.getPelanggan().getNoTelepon()
        );

        System.out.println(
                "Sepatu       : "
                + transaksi.getSepatu().getMerek()
        );

        System.out.println(
                "Warna        : "
                + transaksi.getSepatu().getWarna()
        );

        System.out.println(
                "Layanan      : "
                + transaksi.getJenisLayanan()
        );

        System.out.println(
                "Harga        : Rp"
                + transaksi.getHarga()
        );

        System.out.println(
                "Status       : "
                + transaksi.getStatus()
        );

        System.out.println(
                "========================================"
        );

        System.out.println(
                "      Terima kasih telah menggunakan"
        );

        System.out.println(
                "          jasa cuci sepatu kami!"
        );

        System.out.println(
                "========================================"
        );
    }

    private String inputString(String pesan) {

        String hasil;

        do {

            System.out.print(pesan);

            hasil =
                    input.nextLine().trim();

            if (hasil.isEmpty()) {

                System.out.println(
                        "Input tidak boleh kosong!"
                );
            }

        } while (hasil.isEmpty());

        return hasil;
    }
    private String inputNama(String pesan) {

        while (true) {

            String nama =
                    inputString(pesan);

            if (nama.length() < 3) {

                System.out.println(
                        "Nama terlalu pendek."
                );

            } else if (
                    !nama.matches("[a-zA-Z ]+")
            ) {

                System.out.println(
                        "Nama hanya boleh berisi huruf dan spasi."
                );

            } else if (
                    !nama.matches(".*[aeiouAEIOU].*")
            ) {

                System.out.println(
                        "Nama terlihat tidak valid atau mungkin typo."
                );

                System.out.println(
                        "Silakan masukkan nama kembali."
                );

            } else {

                return nama;
            }
        }
    }

    private String inputTelepon(String pesan) {

        while (true) {

            String nomor =
                    inputString(pesan);

            if (!nomor.matches("\\d+")) {

                System.out.println(
                        "Nomor telepon hanya boleh berisi angka."
                );

            } else if (
                    nomor.length() < 10
                    || nomor.length() > 13
            ) {

                System.out.println(
                        "Nomor telepon harus 10-13 digit."
                );

            } else {

                return nomor;
            }
        }
    }
    private String inputPanjang(
            String pesan,
            int minimal,
            int maksimal) {

        while (true) {

            String hasil =
                    inputString(pesan);

            if (hasil.length() < minimal) {

                System.out.println(
                        "Input minimal "
                        + minimal
                        + " karakter."
                );

            } else if (
                    hasil.length() > maksimal
            ) {

                System.out.println(
                        "Input maksimal "
                        + maksimal
                        + " karakter."
                );

            } else {

                return hasil;
            }
        }
    }
    private int inputInt(String pesan) {

        while (true) {

            try {

                System.out.print(pesan);

                int angka =
                        Integer.parseInt(
                                input.nextLine().trim()
                        );

                return angka;

            } catch (NumberFormatException e) {

                System.out.println(
                        "Input harus berupa angka!"
                );
            }
        }
    }

    private void loading(String pesan) {

        System.out.print(pesan);

        for (int i = 0; i < 5; i++) {

            System.out.print(".");

            try {

                Thread.sleep(200);

            } catch (InterruptedException e) {

                Thread.currentThread()
                        .interrupt();
            }
        }

        System.out.println(" selesai!");
    }
}