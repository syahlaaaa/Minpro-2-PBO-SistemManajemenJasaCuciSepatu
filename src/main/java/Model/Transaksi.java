package Model;

public class Transaksi {

    private String idTransaksi;
    private Pelanggan pelanggan;
    private Sepatu sepatu;
    private String jenisLayanan;
    private int harga;
    private String tanggal;
    private String status;

    public Transaksi(
            String idTransaksi,
            Pelanggan pelanggan,
            Sepatu sepatu,
            String jenisLayanan,
            int harga,
            String tanggal,
            String status) {

        this.idTransaksi = idTransaksi;
        this.pelanggan = pelanggan;
        this.sepatu = sepatu;
        this.jenisLayanan = jenisLayanan;
        this.harga = harga;
        this.tanggal = tanggal;
        this.status = status;
    }

    public String getIdTransaksi() {
        return idTransaksi;
    }

    public void setIdTransaksi(String idTransaksi) {
        this.idTransaksi = idTransaksi;
    }

    public Pelanggan getPelanggan() {
        return pelanggan;
    }

    public void setPelanggan(Pelanggan pelanggan) {
        this.pelanggan = pelanggan;
    }

    public Sepatu getSepatu() {
        return sepatu;
    }

    public void setSepatu(Sepatu sepatu) {
        this.sepatu = sepatu;
    }

    public String getJenisLayanan() {
        return jenisLayanan;
    }

    public void setJenisLayanan(String jenisLayanan) {
        this.jenisLayanan = jenisLayanan;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void tampilkanData() {

        System.out.println("ID Transaksi : " + idTransaksi);
        System.out.println("Tanggal      : " + tanggal);

        System.out.println("ID Pelanggan : "
                + pelanggan.getIdPelanggan());

        System.out.println("Pelanggan    : "
                + pelanggan.getNama());

        System.out.println("No. Telepon  : "
                + pelanggan.getNoTelepon());

        System.out.println("Alamat       : "
                + pelanggan.getAlamat());

        System.out.println("ID Sepatu    : "
                + sepatu.getIdSepatu());

        System.out.println("Merek        : "
                + sepatu.getMerek());

        sepatu.tampilkanJenis();

        System.out.println("Warna        : "
                + sepatu.getWarna());

        System.out.println("Layanan      : "
                + jenisLayanan);

        System.out.println("Harga        : Rp" + harga);

        System.out.println("Status       : "
                + status);
    }
}