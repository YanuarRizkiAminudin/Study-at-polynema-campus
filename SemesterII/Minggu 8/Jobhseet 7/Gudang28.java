public class Gudang28 {
    Barang28[] tumpukan;
    int size;
    int top;

    public Gudang28(int kapasitas) {
        size = kapasitas;
        tumpukan = new Barang28[size];
        top = -1;
    }

    public boolean cekKosong() {
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }
    public boolean cekPenuh() {
        if (top == size - 1){
            return true;
        } else {
            return false;
        }
    }
    public boolean isEmpty() {
        if (top == -1){
            return true;
        } else {
            return false;
        }
    }
    public void tambahBarang(Barang28 brg) {
        if (!cekPenuh()) {
            top++;
            tumpukan[top] = brg;
                System.out.println("Barang " + brg.nama + " berhasil ditambahkan ke gudang");
        } else {
            System.out.println("Gagal! Tumpukan barang di Gudang sudah penuh");
        }
    }    
    public Barang28 ambilBarang() {
        if(!cekKosong()) {
            Barang28 delete = tumpukan[top];
            top--;
            System.out.println("Barang " + delete.nama + " diambil dari Gudang.");
            System.out.println("Kode unik dalam biner:" + konversiDesimalKeBiner(delete.kode));
            return delete;
        } else {
            System.out.println("Tumpukan barang kosong.");
            return null;
        }
    }
    public Barang28 lihatBarangTeratas() {
        //if(!cekKosong()){
        if (!isEmpty()) {
            Barang28 barangTeratas = tumpukan[top];
            System.out.println("Barang teratas: " + barangTeratas.nama);
            return barangTeratas;
        } else {
            System.out.println("Tumpukan barang kosong.");
            return null;
        }
    }

    public void tampilkanBarang() {
        if (!cekKosong()) {
            System.out.println("Rincian tumpukan barang di Gudang: ");
            //for (int i = top; i >= 0; i--)
            for (int i = top; i >= 0; i--) {
                System.out.printf("Kode %d: %s (Kategori %s)\n", tumpukan[i].kode, tumpukan[i].nama, tumpukan[i].kategori);
            }
        } else {
            System.out.println("Tumpukan barang kosong.");
        }
    }    
        public String konversiDesimalKeBiner(int kode) {
            StackKonversi28 stack = new StackKonversi28();
            //while (kode > 0) {
            while (kode != 0) {
                int sisa = kode % 2;
                stack.push(sisa);
                kode = kode / 2;
            }
            String biner = new String();
            while (!stack.isEmpty()){
                biner += stack.pop();
            }
            return biner;
            }
        }
