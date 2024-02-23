public class BukuMain29 {
    public static void main(String[] args) {
        Buku29 bk1 = new Buku29();

        bk1.judul = "Today Ends Tomorrow Comes";
        bk1.pengarang = "Denanda Pratiwi";
        bk1.halaman = 198;
        bk1.stok = 13;
        bk1.harga = 71000;

        bk1.tampilInformasi();
        bk1.terjual(7);
        bk1.gantiHarga(60000);
        bk1.tampilInformasi();

        Buku29 bk2 = new Buku29("Self reward", "Maheera Ayesha", 160, 29, 59000);
        bk2.terjual(11);
        bk2.tampilInformasi();

        Buku29 bk3 = new Buku29("Solo Leveling", "Yanuar Rizki Aminudin", 80, 20, 93000);
        bk3.terjual(5);
        bk3.tampilInformasi();
                
    }
}
    
