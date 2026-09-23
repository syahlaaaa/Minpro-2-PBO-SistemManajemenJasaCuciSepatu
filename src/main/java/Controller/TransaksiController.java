package Controller;

import Model.Transaksi;
import java.util.ArrayList;

public class TransaksiController {

    private ArrayList<Transaksi> daftarTransaksi;

    public TransaksiController() {
        daftarTransaksi = new ArrayList<>();
    }

    public String generateIdTransaksi() {

        int nomor = daftarTransaksi.size() + 1;

        return String.format(
                "TR%03d",
                nomor
        );
    }

    public String generateIdPelanggan() {

        int nomor = daftarTransaksi.size() + 1;

        return String.format(
                "PL%03d",
                nomor
        );
    }

    public String generateIdSepatu() {

        int nomor = daftarTransaksi.size() + 1;

        return String.format(
                "SP%03d",
                nomor
        );
    }

    public boolean tambah(Transaksi transaksi) {

        if (transaksi == null) {
            return false;
        }

        daftarTransaksi.add(transaksi);

        return true;
    }

    public ArrayList<Transaksi> getDaftarTransaksi() {

        return daftarTransaksi;
    }

    public Transaksi cari(String id) {

        for (Transaksi transaksi : daftarTransaksi) {

            if (transaksi.getIdTransaksi()
                    .equalsIgnoreCase(id)) {

                return transaksi;
            }
        }

        return null;
    }

    public boolean hapus(String id) {

        Transaksi transaksi = cari(id);

        if (transaksi != null) {

            if (transaksi.getStatus()
                    .equalsIgnoreCase("Diambil")) {

                return false;
            }

            daftarTransaksi.remove(transaksi);

            return true;
        }

        return false;
    }
}