package Jobshert6;
public class Main28 {
    
    public static void main(String[] args) {
  
        DafraMahasiswaBerprestasi28 list= new DafraMahasiswaBerprestasi28();
        Mahasiswa28 m1 = new Mahasiswa28("Nusa", 2017, 25, 3);
        Mahasiswa28 m2 = new Mahasiswa28("Rara", 2012, 19, 4);
        Mahasiswa28 m3 = new Mahasiswa28("Dompu", 2018, 19, 3.5);
        Mahasiswa28 m4 = new Mahasiswa28("Abdul", 2017, 23, 2);
        Mahasiswa28 m5 = new Mahasiswa28("Ummi", 2019,21, 3.75);

        list.tambah(m1);
        list.tambah(m2);
        list.tambah(m3);
        list.tambah(m4);
        list.tambah(m5);

        System.out.println("Data mahasiswa sebelum sorting = ");
        list.tampil();

        System.out.println("Data mahasiswa setelah sorting desc berdasarkan ipk");
        list.bubbleSort();
        list.tampil();

        System.out.println("Data mahasiswa setelah sorting asc berdasarkam ipk");
        list.selectionSort();
        list.tampil();

        System.out.println("Data mahasiswa setelah sorting Desc berdasarkan ipk");
        list.insertionSort();
        list.tampil();
    }   
}
