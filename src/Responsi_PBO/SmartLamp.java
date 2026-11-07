package Responsi_PBO;

public class SmartLamp extends PerangkatUtama {
    private int tingkatKecerahan;

    public SmartLamp(String idPerangkat, String namaPerangkat, boolean statusAktif) {
        super(idPerangkat, namaPerangkat, statusAktif);
        this.tingkatKecerahan = 100;
    }

    public int getTingkatKecerahan() {
        return tingkatKecerahan;
    }

    @Override
    public void prosesDataSensor(double intensitasCahaya) {
        System.out.println("\n[Membaca Intensitas Cahaya] Nilai: " + intensitasCahaya + " Lux");
        if (intensitasCahaya < 200.0) {
            nyalakan();
            this.tingkatKecerahan = 100;
            System.out.println("-> Ruangan gelap: Lampu menyala 100%.");
        } else {
            this.tingkatKecerahan = 20;
            System.out.println("-> Ruangan terang: Lampu redup ke 20%.");
        }
    }
}