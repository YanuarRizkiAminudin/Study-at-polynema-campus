public class LimasSegiEmpatSamaSisi {
    private double panjangSisiAlas;
    private double tinggiLimas;

    public LimasSegiEmpatSamaSisi(double psa, double tl) {
        panjangSisiAlas = psa;
        tinggiLimas = tl;
    }

    public double hitungLuasPermukaan() {
        return panjangSisiAlas * panjangSisiAlas + 4 * (0.5 * panjangSisiAlas * tinggiLimas);
    }

    public double hitungVolume() {
        return (1.0 / 3.0) * panjangSisiAlas * panjangSisiAlas * tinggiLimas;
    }
}
