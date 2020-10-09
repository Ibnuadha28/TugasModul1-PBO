package com.ibnuadhanurrohman.Karyawan;

public class DetailKaryawan {
    public static void main(String[] args) {
        Karyawan karyawan1 = new Karyawan("John Kay");
        karyawan1.setUmur(28);
        karyawan1.setAlamat("Los Angeles");
        karyawan1.setJabatan("Chief Executive Operation");
        karyawan1.setPenghasilan(10000);
        System.out.println("---Detail Karyawan---\n");
        karyawan1.printKaryawan();
    }
}
