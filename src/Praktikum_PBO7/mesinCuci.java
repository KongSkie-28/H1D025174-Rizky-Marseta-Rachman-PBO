package Praktikum_PBO7;

public class mesinCuci extends suatuMesin {

    public mesinCuci(String Nama) {
        super(Nama);
    }

    @Override
    public void hidupkanMesin() {
        if (isHidup()) {
            System.out.println(getNama() + " sudah hidup");
        } else {
            setHidup(true);
            System.out.println(getNama() + " dihidupkan");
        }
    }

    @Override
    public void matikanMesin() {
        if (isHidup()) {
            setHidup(false);
            System.out.println(getNama() + " dimatikan");
        } else {
            setHidup(true);
            System.out.println(getNama() + " keadaan mati");
        }
    }
}
