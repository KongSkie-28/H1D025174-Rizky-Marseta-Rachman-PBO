package Responsi_PBO;

public class SensorSuhu extends PerangkatUtama {
    private double suhuSaatIni;
    private boolean alarmAktif;

    public SensorSuhu(String idPerangkat, String namaPerangkat) {
        super(idPerangkat, namaPerangkat);
        this.suhuSaatIni = 0.0;
        this.alarmAktif = false;
    }

    public double getSuhuSaatIni() {
        return suhuSaatIni;
    }

    public boolean isAlarmAktif() {
        return alarmAktif;
    }

    @Override
    public void tampilkanInformasi() {
        super.tampilkanInformasi();
        System.out.println("Tipe: Sensor Suhu | Suhu: " + suhuSaatIni + " " + METRIC_UNIT + " | Alarm: " + (alarmAktif ? "BUNYI" : "NORMAL"));
    }

    @Override
    public void prosesDataSensor(double nilaiSensor) {
        this.suhuSaatIni = nilaiSensor;
        System.out.println("\n[Membaca Sensor Suhu] Nilai: " + nilaiSensor + " " + METRIC_UNIT);
        if (nilaiSensor > 35.0) {
            this.alarmAktif = true;
            System.out.println("-> WARNING: Suhu terlalu tinggi! Alarm dinyalakan.");
        } else {
            this.alarmAktif = false;
            System.out.println("-> OK: Suhu dalam batas aman. Alarm dimatikan.");
        }
    }

    public String evaluasiKondisi() {
        if (suhuSaatIni > 35.0) {
            return "KRITIS";
        } else if (suhuSaatIni >= 20.0) {
            return "NORMAL";
        } else {
            return "DINGIN";
        }
    }
}