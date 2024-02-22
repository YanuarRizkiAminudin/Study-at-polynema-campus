public class Buku29 {
    String judul, pengarang;
    int halaman, stok, harga;

    void tampilInformasi(){
        System.out.println("Judul: " + judul);
        System.out.println("Pengarang: " + pengarang);
        System.out.println("Jumlah halman:" + halaman);
        System.out.println("Sisa stok : " + stok);
        System.out.println("Harga: Rp " + harga);
    }
    public Buku29(){
    }
    public Buku29(String jd, String pg, int hl, int stok, int hr){
        judul = jd;
        pengarang = pg;
        halaman = hl;
        this.stok = stok;
        harga = hr;
    }
    void terjual(int jml){
        if (stok > 0 && stok >= jml){
            stok -= jml;
            System.out.println("Penjualana berhasil, Sisa stok: " + stok);
        }else {
            System.out.println("stok sudah habis.");
        }
    }
    void restock(int jml){
        stok += jml;
    }
    void gantiHarga(int hrg){
        harga = hrg;
    }
}
