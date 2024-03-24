package Tugas6;
public class MainHotel28 {
    
    public static void main(String[] args) {
  
        HotelService28 list= new HotelService28();
        Hotel28 m1 = new Hotel28("Nusa", "probolinggo", 200, (byte)1);
        Hotel28 m2 = new Hotel28("Rara", "Jakarta", 100, (byte)2);
        Hotel28 m3 = new Hotel28("Dompu", "jerman", 150, (byte)4);
        Hotel28 m4 = new Hotel28("Abdul", "Sepanyol", 1000, (byte)7);
        Hotel28 m5 = new Hotel28("Ummi", "Prancis",170, (byte)5);

        list.tambah(m1);
        list.tambah(m2);
        list.tambah(m3);
        list.tambah(m4);
        list.tambah(m5);

        System.out.println("Data Hotel sebelum sorting = ");
        list.tampil();

        System.out.println("Data Hotel setelah sorting desc berdasarkan ipk");
        list.bubbleSort();
        list.tampil();

        System.out.println("Data Hotel setelah sorting asc berdasarkam ipk");
        list.selectionSort();
        list.tampil();
    }   
}
