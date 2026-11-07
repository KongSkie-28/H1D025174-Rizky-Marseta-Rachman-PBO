package Praktikum_PBO2;

public class Mahasiswa {
    private String nama;
    private String nim;
    private String alamat;
    private int umur;
    private String jurusan;

    public Mahasiswa(String nama, String nim) {
        this.nama = nama;
        this.nim = nim;
    }

    public Mahasiswa(String nama, String nim, String alamat) {
        this.nama = nama;
        this.nim = nim;
        this.alamat = alamat;
    }

    public Mahasiswa(String nama, String nim, String alamat, int umur, String jurusan) {
        this.nama = nama;
        this.nim = nim;
        this.alamat = alamat;
        this.umur = umur;
        this.jurusan = jurusan;
    }

    public String getNim() {
        return nim;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    void cetakInformasi() {
        System.out.println("Nama mahasiswa " + nama + " adalah " + nim);
    }
}

