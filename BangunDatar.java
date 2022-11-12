package PBO1Sesi6;

public abstract class BangunDatar {
    String warna;
    
    String getwarna() {
        return warna;
    }

    void setWarna(String warna) {
        this.warna = warna;
    }

    abstract float getLuas();
}
