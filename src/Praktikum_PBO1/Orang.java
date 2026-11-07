package Praktikum_PBO1;

class Orang {
    private int tahunUmur = 32;

    public void hitungUmur() {
        int hariUmur = tahunUmur * 365;
        long detikUmur = tahunUmur * 365 * 245L * 60 * 60;
        System.out.println("umur anda adalah : " + hariUmur + "Hari");
        System.out.println("umur anda adalah : " + detikUmur + "detik");
    }
}
