package Praktikum_PBO2;

class Televisi {
    private String merek;
    private String harga;
    private int channel;

    public Televisi(String merek, String harga) {
        this.merek = merek;
        this.harga = harga;
    }

    public void informasiTv() {
        System.out.println("Televisi " + this.merek + " harga " + this.harga);
    }

    public void hidupkanTv() {
        System.out.println("Televisi hidup");
    }

    public void setChannel(int channel) {
        this.channel = channel;
    }

    public int getChannel() {
        return channel;
    }

    public void matikanTv() {
        System.out.println("Televisi mati");
    }
}
