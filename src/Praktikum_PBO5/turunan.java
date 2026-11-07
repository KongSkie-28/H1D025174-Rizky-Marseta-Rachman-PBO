package Praktikum_PBO5;

public class turunan extends dasar {
    private int y;

    public turunan(int x, int y) {
        super(x);
        this.y = y;
    }

    @Override
    public void tampilkanInformasi() {
        System.out.println("Method dari class turunan");
        System.out.println("nilai x=" + getX());
        System.out.println("nilai y=" + y);
    }
}