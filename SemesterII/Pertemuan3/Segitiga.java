public class Segitiga {
    public int alas;
    public int tinggi;

    public Segitiga(int a, int t) {
    alas = a ;
    tinggi = t;
    }
    public double hitungLuas(){
    return 0.5 * alas * tinggi;
    }
    public double hitungKeliling(){
	double sisiMiring = Math.sqrt(alas * alas + tinggi * tinggi);
    return alas + tinggi + sisiMiring;
    }
}

