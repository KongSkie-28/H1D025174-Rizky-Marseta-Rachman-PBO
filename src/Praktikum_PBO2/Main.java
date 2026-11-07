package Praktikum_PBO2;

class Main {
    public static void main(String[] args) {
        Televisi tvflat = new Televisi("sharp", "3 Juta");
        tvflat.informasiTv();
        tvflat.hidupkanTv();
        tvflat.setChannel(1);
        System.out.println("Televisi diset pada channel:" + tvflat.getChannel());

        tvflat.matikanTv();
    }
}
