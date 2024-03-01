public class Kerucut {
    double jariJari = 0;
    double sisiMiring = 0;

    public Kerucut(double jariJariKerucut, double sisiMiringKerucut) {
        jariJari = jariJariKerucut;
        sisiMiring = sisiMiringKerucut;
    }

    public double hitungVolume() {
        return (1.0 / 3.0) * Math.PI * jariJari * jariJari * sisiMiring;
    }

    public double hitungLuasPermukaan() {
        return (1.0 / 3.0) * Math.PI * jariJari * sisiMiring;
    }
    
    
}
