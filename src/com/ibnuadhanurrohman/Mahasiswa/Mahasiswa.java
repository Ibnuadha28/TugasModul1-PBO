package com.ibnuadhanurrohman.Mahasiswa;

public class Mahasiswa {
    private String nama, alamat, asalsekolah;
    private int umur, tahunmasuk;

    public Mahasiswa(){}
    //Concstuctor
    public Mahasiswa(String nama, String alamat, String asalsekolah, int umur, int tahunmasuk) {
        this.nama = nama;
        this.alamat = alamat;
        this.asalsekolah = asalsekolah;
        this.umur = umur;
        this.tahunmasuk = tahunmasuk;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getAsalsekolah() {
        return asalsekolah;
    }

    public void setAsalsekolah(String asalsekolah) {
        this.asalsekolah = asalsekolah;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    public int getTahunmasuk() {
        return tahunmasuk;
    }

    public void setTahunmasuk(int tahunmasuk) {
        this.tahunmasuk = tahunmasuk;
    }
}
