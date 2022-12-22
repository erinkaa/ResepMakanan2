package com.example.resepmakanan2.Adapter;

public class Resep {

    private int gambarMakanan;
    private String judulResep;
    private String bahanResep;
    private String tahapResep;
    private String idResepVideo;

    public Resep() {}

    public Resep(int gambarMakanan, String judulResep, String bahanResep, String tahapResep, String idResepVideo) {
        this.gambarMakanan = gambarMakanan;
        this.judulResep = judulResep;
        this.bahanResep = bahanResep;
        this.tahapResep = tahapResep;
        this.idResepVideo = idResepVideo;
    }

    public int getGambarMakanan() {
        return gambarMakanan;
    }

    public void setGambarMakanan(int gambarMakanan) {
        this.gambarMakanan = gambarMakanan;
    }

    public String getJudulResep() {
        return judulResep;
    }

    public void setJudulResep(String judulResep) {
        this.judulResep = judulResep;
    }

    public String getBahanResep() {
        return bahanResep;
    }

    public void setBahanResep(String bahanResep) {
        this.bahanResep = bahanResep;
    }

    public String getTahapResep() {
        return tahapResep;
    }

    public void setTahapResep(String tahapResep) {
        this.tahapResep = tahapResep;
    }

    public String getIdResepVideo() {
        return idResepVideo;
    }

    public void setIdResepVideo(String idResepVideo) {
        this.idResepVideo = idResepVideo;
    }
}
