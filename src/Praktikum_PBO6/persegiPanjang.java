package Praktikum_PBO6;

public class persegiPanjang extends bentuk2D {
    private int panjang;
    private int lebar;
    private double luas;
    private int keliling;

    public persegiPanjang(int panjang, int lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    @Override
    public void cetakLuas() {
        luas = panjang * lebar;
        System.out.println("Luas persegi adalah:" + luas);
    }

    @Override
    public void cetakKeliling() {
        keliling = 2 * (panjang + lebar);
        System.out.println("Keliling persegi:" + keliling);
    }
}