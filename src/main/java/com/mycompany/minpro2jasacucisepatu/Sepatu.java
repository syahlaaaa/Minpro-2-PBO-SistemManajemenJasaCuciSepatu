
package com.mycompany.minpro2jasacucisepatu;

public class Sepatu {
    private String idSepatu;
    private String merek;
    private String jenis;
    private String warna;

    public Sepatu(String idSepatu, String merek, String jenis, String warna) {
        this.idSepatu = idSepatu;
        this.merek = merek;
        this.jenis = jenis;
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

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }
    
}
