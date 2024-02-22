public class BukuMain29 {
    public static void main(String[] args) {
        Buku29 bk1 = new Buku29();

        bk1.judul = "Today Ends Tomorrow Comes";
        bk1.pengarang = "Yanuar Rizki Aminudin";
        bk1.halaman = 198;
        bk1.stok = 13;
        bk1.harga = 71000;

        System.out.println("Informasi Buku Sebelum Perubahan:");
        bk1.tampilInformasi();
        bk1.terjual(5);
        bk1.gantiHarga(60000);

        System.out.println("Informasi Buku Setelah Perubahan:");
        bk1.tampilInformasi();
    }
}