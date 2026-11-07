package Praktikum_PBO1;

class Uji {
    static void main(String[] args) {
        int x;
        bujurSangkar bujur = new bujurSangkar();
        x = bujur.hitungLuas(4);
        System.out.println("luas bujur sangkar " + x);
        x = bujur.hitungKeliling(5);
        System.out.println("keliling bujur sangkar " + x);
        Persegi persegipanjang = new Persegi();
        x = persegipanjang.hitungLuas(6, 4);
        System.out.println("Keliling persegi " + x);
    }
}
