package Responsi_PBO;

public abstract class PerangkatUtama implements PerangkatIoT, DapatDihubungkan {
    public static final String METRIC_UNIT = "Celsius";
    private final String idPerangkat;

    private String namaPerangkat;
    private boolean statusAktif;
    private boolean terhubungWiFi;

    public PerangkatUtama(String idPerangkat, String namaPerangkat) {
        this.idPerangkat = idPerangkat;
        this.namaPerangkat = namaPerangkat;
        this.statusAktif = false;
        this.terhubungWiFi = false;
    }

    public PerangkatUtama(String idPerangkat, String namaPerangkat, boolean statusAktif) {
        this.idPerangkat = idPerangkat;
        this.namaPerangkat = namaPerangkat;
        this.statusAktif = statusAktif;
        this.terhubungWiFi = false;
    }

    public String getIdPerangkat() {
        return idPerangkat;
    }

    public String getNamaPerangkat() {
        return namaPerangkat;
    }

    public void setNamaPerangkat(String namaPerangkat) {
        this.namaPerangkat = namaPerangkat;
    }

    public void setStatusAktif(boolean statusAktif) {
        this.statusAktif = statusAktif;
    }

    @Override
    public boolean isStatusAktif() {
        return statusAktif;
    }

    public boolean isTerhubungWiFi() {
        return terhubungWiFi;
    }

    @Override
    public void hubungkanKeWiFi(String ssid) {
        this.terhubungWiFi = true;
        System.out.println(namaPerangkat + " terhubung ke WiFi: " + ssid);
    }

    @Override
    public void putusKoneksi() {
        this.terhubungWiFi = false;
        System.out.println(namaPerangkat + " terputus dari WiFi.");
    }

    @Override
    public void nyalakan() {
        this.statusAktif = true;
        System.out.println(namaPerangkat + " dinyalakan.");
    }

    @Override
    public void matikan() {
        this.statusAktif = false;
        System.out.println(namaPerangkat + " dimatikan.");
    }

    public void tampilkanInformasi() {
        System.out.println("ID: " + idPerangkat + " | Nama: " + namaPerangkat + " | Status: " + (statusAktif ? "ON" : "OFF"));
    }

    public abstract void prosesDataSensor(double nilaiSensor);
}
