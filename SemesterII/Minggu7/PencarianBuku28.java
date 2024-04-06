public class PencarianBuku28 {
    Buku28 listBk[] = new Buku28[5];

    int idx;

    PencarianBuku28() {
        listBk[0] = new Buku28(111, "Algoritma", "Indrajani", 2019, 100);
        listBk[1] = new Buku28(132, "Dasar Pemrograman Java", "Abdul Kadir", 2004, 200);
        listBk[2] = new Buku28(121, "Pemrograman Java", "Indrajani", 2005, 100);
        listBk[3] = new Buku28(20, "Pemrograman Berbasis Objek", "Indrajani", 2005, 100);
        listBk[4] = new Buku28(1, "Dasar Pemrograman", "Abdul Kadir", 2004, 200);
    }

    void tambah(Buku28 bk) {
        if (idx < listBk.length) {
            listBk[idx] = bk;
            idx++;
        } else {
            System.out.println("Data sudah penuh");
        }
    }

    void tampil() {
        for (Buku28 bk : listBk) {
            bk.tampil();
        }
    }

    public int FindSeqSearch(int cari) {
        int posisi = -1;
        for (int j = 0; j < listBk.length; j++) {
            if (listBk[j].kodeBuku == cari) {
                posisi = j;
                break;
            }
        }
        return posisi;
    }

    public void TampilPosisi(int x, int pos) {
        if (pos != -1) {
            System.out.println("data : " + x + " ditemukan pada indeks ke " + pos);
            listBk[pos].tampil();
        } else {
            System.out.println("data : " + x + " tidak ditemukan");
        }
    }

    public Buku28 FindBuku(int cari) {
        for (Buku28 buku : listBk) {
            if (buku.kodeBuku == cari) {
                return buku;
            }
        }
        return null;
    }

}
