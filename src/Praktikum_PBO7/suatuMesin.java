package Praktikum_PBO7;

public abstract class suatuMesin {
    private boolean hidup;
    private String Nama;

    public abstract void hidupkanMesin();
    public abstract void matikanMesin();

    public suatuMesin(String Nama) {
        this.Nama = Nama;
    }

    public String getNama() {
        return Nama;
    }

    public boolean isHidup() {
        return hidup;
    }

    public void setHidup(boolean hidup) {
        this.hidup = hidup;
    }
}
