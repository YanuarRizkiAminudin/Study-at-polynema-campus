public class mahasiswa {
    public String nama;
    public long nim;
    public char kelamin;
    public double ipk; 

    public static void printRataIPK(mahasiswa[] nilai){
        double rataIpk = 0;
        for (int i = 0; i < nilai.length; i++) {
            rataIpk += nilai[i].ipk;
        }
        rataIpk /= nilai.length;
        System.out.println("\nRata-rata IPK:" + rataIpk);
    }

    public mahasiswa(String nm, long n, char kl, Double ip){
        this.nama = nm ;
        this.nim = n;
        this.kelamin = kl;
        this.ipk = ip;
    }
        public static void printIPKTerbesar(mahasiswa[] nilai) {
            double ipkTerbesar = 0 ;
            for(int i = 0; i < nilai.length; i++) {

               if (ipkTerbesar < nilai[i].ipk)
                  ipkTerbesar = nilai[i].ipk;
            } 
            System.out.println("IPK Terbesar: " + ipkTerbesar);
        }
    }
