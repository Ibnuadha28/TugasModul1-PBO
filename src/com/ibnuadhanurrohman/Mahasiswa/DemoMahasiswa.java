package com.ibnuadhanurrohman.Mahasiswa;

public class DemoMahasiswa {
    public static void main(String[] args) {
        Mahasiswa arrayMahasiswa[] = new Mahasiswa[2];
        Mahasiswa mahasiswa = new Mahasiswa("Kaka Kiki", "Melbourne", "D Senior High School ",
                18, 2020);
        Mahasiswa mahasiswa1 = new Mahasiswa();
        mahasiswa1.setNama("Joshua");
        mahasiswa1.setAlamat("SouthNorth");
        mahasiswa1.setAsalsekolah("Middle School City");
        mahasiswa1.setUmur(17);
        mahasiswa1.setTahunmasuk(2020);

        arrayMahasiswa[0] = mahasiswa;
        arrayMahasiswa[1] = mahasiswa1;
        System.out.println("==Pendaftaran Mahasiswa Baru==\n");

        for (Mahasiswa msiswa : arrayMahasiswa) {
            System.out.println("Nama\t\t : " + msiswa.getNama());
            System.out.println("Alamat\t\t : " + msiswa.getAlamat());
            System.out.println("Asal Sekolah : " + msiswa.getAsalsekolah());
            System.out.println("Umur\t\t : " + msiswa.getUmur());
            System.out.println("Tahun Masuk\t : " + msiswa.getTahunmasuk());
            System.out.println();
        }
    }
}
