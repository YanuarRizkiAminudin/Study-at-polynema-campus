public class Buku29 {
    String judul, pengarang;
    int halaman, stok, harga, hargaTotal;
    double totalDiskon, diskon = 0, hargaAkhir;

    void tampilInformasi() {
        System.out.println("Judul: " + judul);
        System.out.println("Pengarang: " + pengarang);
        System.out.println("Jumlah Halaman: " + halaman);
        System.out.println("Sisa Stok: " + stok);
        System.out.println("Harga: Rp " + harga);
        System.out.println("Haga Total: " + hargaTotal);
        System.out.println("Hitung Diskon: " + diskon);
        System.out.println("Hitung Bayar: " + hargaAkhir);
    }

    public Buku29() {

    }

    public Buku29(String jud, String pg, int hal, int stok, int har) {
        judul = jud;
        pengarang = pg;
        halaman = hal;
        this.stok = stok;
        harga = har;
    }

    void terjual(int jml) {
        if (stok > 0 && stok >= jml) {
            stok -= jml;
        } else
            System.out.println("Stok Habis");

        hitungHargaTotal(jml);
    }

    void restock(int jml) {
        stok += jml;
    }

    void gantiHarga(int hrg) {
        harga = hrg;
    }

    void hitungHargaTotal( int jml) {
        hargaTotal = harga * jml ;

        hitungDiskon(hargaTotal);
    }

    void hitungDiskon(int hargaTotal) {
        if (hargaTotal > 150000) {
            System.err.println("Selamat anda mendapatkan diskon sebesar 12% dari toko kami");
            diskon = hargaTotal * 0.12;
        } else if (hargaTotal >= 75000 && hargaTotal <= 150000) {
            System.err.println("Selamat anda mendapatkan diskon sebesar 5% dari toko kami");
            diskon = hargaTotal * 0.05;
            
        } else if (hargaTotal < 75000) {
            System.out.println("Tidak ada Diskon");
            diskon = 0;
        }

        hitungHargaBayar(diskon, hargaTotal);
    }

    void hitungHargaBayar(double diskon, int hargaTotal) {
        hargaAkhir =  hargaTotal - diskon ;
    }
}