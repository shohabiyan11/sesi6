package PBO1Sesi6;

public class SegiTiga extends BangunDatar {
    
    private final float alas;
    private final float tinggi;
    
    public SegiTiga(float alas, float tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    @Override
    float getLuas() {
        return (float) 0.5 * alas * tinggi;
    }
     
}