package Responsi_PBO;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== SISTEM MONITORING IOT ===");

        PerangkatIoT perangkat1 = new SensorSuhu("IOT-001", "Sensor Ruang Server");
        PerangkatIoT perangkat2 = new SmartLamp("IOT-002", "Lampu Utama", true);

        perangkat1.nyalakan();

        System.out.println("\n--- Pengujian Sensor Suhu ---");
        SensorSuhu sensorSuhu = (SensorSuhu) perangkat1;
        sensorSuhu.hubungkanKeWiFi("Lab_Informatika_5GHz");

        sensorSuhu.tampilkanInformasi();

        sensorSuhu.prosesDataSensor(28.5);
        System.out.println("Status Evaluasi: " + sensorSuhu.evaluasiKondisi());

        sensorSuhu.prosesDataSensor(41.2);
        System.out.println("Status Evaluasi: " + sensorSuhu.evaluasiKondisi());

        System.out.println("\n--- Pengujian Smart Lamp ---");
        SmartLamp lamp = (SmartLamp) perangkat2;
        lamp.tampilkanInformasi();
        lamp.prosesDataSensor(500.0);
    }
}