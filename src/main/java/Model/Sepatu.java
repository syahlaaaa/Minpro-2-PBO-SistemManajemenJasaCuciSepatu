package Model;

public class Sepatu {

    private String idSepatu;
    private String merek;
    private String warna;

    public Sepatu(String idSepatu, String merek, String warna) {
        this.idSepatu = idSepatu;
        this.merek = merek;
        this.warna = warna;
    }

    public String getIdSepatu() {
        return idSepatu;
    }

    public void setIdSepatu(String idSepatu) {
        this.idSepatu = idSepatu;
    }

    public String getMerek() {
        return merek;
    }

    public void setMerek(String merek) {
        this.merek = merek;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public void tampilkanJenis() {
        System.out.println("Jenis Sepatu : Umum");
    }
}