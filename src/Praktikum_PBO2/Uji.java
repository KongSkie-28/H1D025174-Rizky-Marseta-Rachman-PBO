package Praktikum_PBO2;

class Uji {
    public static void main(String[] args) {
        Mahasiswa mhs1 = new Mahasiswa("Daplun", "H1L009002");
        mhs1.cetakInformasi();
        Mahasiswa mhs2 = new Mahasiswa("Daplun", "H1L009002", "Purwokerto");

        System.out.println(mhs2.getNama());
    }
}
