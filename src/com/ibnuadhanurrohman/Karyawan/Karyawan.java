package com.ibnuadhanurrohman.Karyawan;

public class Karyawan {
    String Nama, Jabatan, Alamat;
    int Umur, Penghasilan;

    public Karyawan(String nama) {
        this.Nama = nama;
    }

    public void setUmur(int umur) {
        Umur = umur;
    }

    public void setAlamat(String alamat) {
        Alamat = alamat;
    }

    public void setJabatan(String jabatan) {
        Jabatan = jabatan;
    }

    public void setPenghasilan(int penghasilan) {
        Penghasilan = penghasilan;
    }

    public void printKaryawan(){
        System.out.println("Nama\t\t : " + Nama);
        System.out.println("Umur\t\t : " + Umur);
        System.out.println("Alamat\t\t : " + Alamat);
        System.out.println("Jabatan\t\t : " + Jabatan);
        System.out.println("Penghasilan\t : " + Penghasilan + " USD");
    }
}
